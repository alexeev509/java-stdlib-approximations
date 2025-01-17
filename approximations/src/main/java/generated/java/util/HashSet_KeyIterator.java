// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Void;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * HashSet_KeyIteratorAutomaton for HashSet_KeyIterator ~> java.util.HashSet_KeyIterator
 */
@Approximate(stub.java.util.HashSet_KeyIterator.class)
public final class HashSet_KeyIterator implements LibSLRuntime.Automaton, Iterator {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public int expectedModCount;

    public LibSLRuntime.Map<Object, Object> visitedKeys;

    public HashSet parent;

    public int index;

    public Object currentKey;

    public boolean nextWasCalled;

    @LibSLRuntime.AutomatonConstructor
    public HashSet_KeyIterator(Void __$lsl_token, final byte p0, final int p1,
            final LibSLRuntime.Map<Object, Object> p2, final HashSet p3, final int p4,
            final Object p5, final boolean p6) {
        this.__$lsl_state = p0;
        this.expectedModCount = p1;
        this.visitedKeys = p2;
        this.parent = p3;
        this.index = p4;
        this.currentKey = p5;
        this.nextWasCalled = p6;
    }

    @LibSLRuntime.AutomatonConstructor
    public HashSet_KeyIterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, 0, null, null, 0, 0, false);
    }

    /**
     * [CONSTRUCTOR] HashSet_KeyIteratorAutomaton::HashSet_KeyIterator(HashSet_KeyIterator, HashMap) -> HashSet_KeyIterator
     */
    private HashSet_KeyIterator(HashMap source) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] HashSet_KeyIteratorAutomaton::_checkForComodification() -> void
     */
    private void _checkForComodification() {
        /* body */ {
            final int modCount = ((HashSet) ((Object) this.parent)).modCount;
            if (this.expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] HashSet_KeyIteratorAutomaton::hasNext(HashSet_KeyIterator) -> boolean
     */
    public boolean hasNext() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            final int length = ((HashSet) ((Object) this.parent)).length;
            result = this.index < length;
        }
        return result;
    }

    /**
     * [FUNCTION] HashSet_KeyIteratorAutomaton::next(HashSet_KeyIterator) -> Object
     */
    public final Object next() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            _checkForComodification();
            final int length = ((HashSet) ((Object) this.parent)).length;
            final boolean atValidPosition = this.index < length;
            if (!atValidPosition) {
                throw new NoSuchElementException();
            }
            final Object key = Engine.makeSymbolic(Object.class);
            Engine.assume(key != null);
            Engine.assume(key != this.currentKey);
            final LibSLRuntime.Map<Object, Object> parentStorage = ((HashSet) ((Object) this.parent)).storage;
            final boolean sourceStorageHasKey = parentStorage.hasKey(key);
            Engine.assume(sourceStorageHasKey);
            final boolean dstStorageHasKey = this.visitedKeys.hasKey(key);
            Engine.assume(!dstStorageHasKey);
            this.currentKey = key;
            result = key;
            this.visitedKeys.set(this.currentKey, LibSLGlobals.SOMETHING);
            this.index += 1;
            this.nextWasCalled = true;
        }
        return result;
    }

    /**
     * [FUNCTION] HashSet_KeyIteratorAutomaton::remove(HashSet_KeyIterator) -> void
     */
    public void remove() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            final int length = ((HashSet) ((Object) this.parent)).length;
            final boolean atValidPosition = this.index < length;
            if (!atValidPosition || !this.nextWasCalled) {
                throw new IllegalStateException();
            }
            this.nextWasCalled = false;
            _checkForComodification();
            final LibSLRuntime.Map<Object, Object> parentStorage = ((HashSet) ((Object) this.parent)).storage;
            parentStorage.remove(this.currentKey);
            this.expectedModCount = ((HashSet) ((Object) this.parent)).modCount;
        }
    }

    /**
     * [FUNCTION] HashSet_KeyIteratorAutomaton::forEachRemaining(HashSet_KeyIterator, Consumer) -> void
     */
    public void forEachRemaining(Consumer userAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            if (userAction == null) {
                throw new NullPointerException();
            }
            final int length = ((HashSet) ((Object) this.parent)).length;
            int i = this.index;
            while (i < length) {
                _checkForComodification();
                final Object key = Engine.makeSymbolic(Object.class);
                Engine.assume(key != null);
                Engine.assume(key != this.currentKey);
                final LibSLRuntime.Map<Object, Object> parentStorage = ((HashSet) ((Object) this.parent)).storage;
                final boolean sourceStorageHasKey = parentStorage.hasKey(key);
                Engine.assume(sourceStorageHasKey);
                final boolean destStorageHasKey = this.visitedKeys.hasKey(key);
                Engine.assume(!destStorageHasKey);
                this.currentKey = key;
                this.visitedKeys.set(this.currentKey, LibSLGlobals.SOMETHING);
                userAction.accept(key);
                i += 1;
            }
            ;
            this.index = i;
            this.nextWasCalled = true;
        }
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(HashSet_KeyIterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
