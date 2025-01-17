// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Void;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import org.usvm.api.SymbolicList;
import runtime.LibSLRuntime;

/**
 * ArrayList_ListIteratorAutomaton for ArrayList_ListIterator ~> java.util.ArrayList_ListItr
 */
@Approximate(stub.java.util.ArrayList_ListItr.class)
public final class ArrayList_ListItr implements LibSLRuntime.Automaton, ListIterator {
    static {
        Engine.assume(true);
    }

    public ArrayList parent;

    public int cursor;

    public int expectedModCount;

    public int lastRet;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_ListItr(Void __$lsl_token, final byte p0, final ArrayList p1, final int p2,
            final int p3, final int p4) {
        this.parent = p1;
        this.cursor = p2;
        this.expectedModCount = p3;
        this.lastRet = p4;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_ListItr(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, 0, 0, -1);
    }

    /**
     * [SUBROUTINE] ArrayList_ListIteratorAutomaton::_checkForComodification() -> void
     */
    private void _checkForComodification() {
        /* body */ {
            final int modCount = ((ArrayList) ((Object) this.parent)).modCount;
            if (modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::hasPrevious(ArrayList_ListIterator) -> boolean
     */
    public boolean hasPrevious() {
        boolean result = false;
        /* body */ {
            result = this.cursor != 0;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::nextIndex(ArrayList_ListIterator) -> int
     */
    public int nextIndex() {
        int result = 0;
        /* body */ {
            result = this.cursor;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::previousIndex(ArrayList_ListIterator) -> int
     */
    public int previousIndex() {
        int result = 0;
        /* body */ {
            result = this.cursor - 1;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::hasNext(ArrayList_ListIterator) -> boolean
     */
    public boolean hasNext() {
        boolean result = false;
        /* body */ {
            Engine.assume(this.parent != null);
            result = this.cursor != ((ArrayList) ((Object) this.parent)).length;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::next(ArrayList_ListIterator) -> Object
     */
    public Object next() {
        Object result = null;
        /* body */ {
            Engine.assume(this.parent != null);
            _checkForComodification();
            final SymbolicList<Object> parentStorage = ((ArrayList) ((Object) this.parent)).storage;
            final int i = this.cursor;
            if (i >= ((ArrayList) ((Object) this.parent)).length) {
                throw new NoSuchElementException();
            }
            if (i >= parentStorage.size()) {
                throw new ConcurrentModificationException();
            }
            this.cursor = i + 1;
            this.lastRet = i;
            result = parentStorage.get(i);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::previous(ArrayList_ListIterator) -> Object
     */
    public Object previous() {
        Object result = null;
        /* body */ {
            Engine.assume(this.parent != null);
            _checkForComodification();
            final SymbolicList<Object> parentStorage = ((ArrayList) ((Object) this.parent)).storage;
            final int i = this.cursor - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            if (i >= parentStorage.size()) {
                throw new ConcurrentModificationException();
            }
            this.cursor = i;
            this.lastRet = i;
            result = parentStorage.get(i);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::remove(ArrayList_ListIterator) -> void
     */
    public void remove() {
        /* body */ {
            Engine.assume(this.parent != null);
            if (this.lastRet < 0) {
                throw new IllegalStateException();
            }
            _checkForComodification();
            final SymbolicList<Object> pStorage = ((ArrayList) ((Object) this.parent)).storage;
            if (this.lastRet >= pStorage.size()) {
                throw new ConcurrentModificationException();
            } else {
                ((ArrayList) ((Object) this.parent)).modCount += 1;
                pStorage.remove(this.lastRet);
                ((ArrayList) ((Object) this.parent)).length -= 1;
            }
            this.cursor = this.lastRet;
            this.lastRet = -1;
            this.expectedModCount = ((ArrayList) ((Object) this.parent)).modCount;
        }
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::set(ArrayList_ListIterator, Object) -> void
     */
    public void set(Object e) {
        /* body */ {
            Engine.assume(this.parent != null);
            if (this.lastRet < 0) {
                throw new IllegalStateException();
            }
            _checkForComodification();
            final SymbolicList<Object> pStorage = ((ArrayList) ((Object) this.parent)).storage;
            if (this.lastRet >= pStorage.size()) {
                throw new ConcurrentModificationException();
            } else {
                pStorage.set(this.lastRet, e);
            }
        }
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::add(ArrayList_ListIterator, Object) -> void
     */
    public void add(Object e) {
        /* body */ {
            Engine.assume(this.parent != null);
            _checkForComodification();
            final int i = this.cursor;
            final SymbolicList<Object> pStorage = ((ArrayList) ((Object) this.parent)).storage;
            if (this.lastRet > pStorage.size()) {
                throw new ConcurrentModificationException();
            } else {
                ((ArrayList) ((Object) this.parent)).modCount += 1;
                pStorage.insert(i, e);
                ((ArrayList) ((Object) this.parent)).length += 1;
            }
            this.cursor = i + 1;
            this.lastRet = -1;
            this.expectedModCount = ((ArrayList) ((Object) this.parent)).modCount;
        }
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::forEachRemaining(ArrayList_ListIterator, Consumer) -> void
     */
    public void forEachRemaining(Consumer userAction) {
        /* body */ {
            Engine.assume(this.parent != null);
            if (userAction == null) {
                throw new NullPointerException();
            }
            int i = this.cursor;
            final int size = ((ArrayList) ((Object) this.parent)).length;
            if (i < size) {
                final SymbolicList<Object> es = ((ArrayList) ((Object) this.parent)).storage;
                if (i >= es.size()) {
                    throw new ConcurrentModificationException();
                }
                while ((i < size) && (((ArrayList) ((Object) this.parent)).modCount == this.expectedModCount)) {
                    final Object item = es.get(i);
                    userAction.accept(item);
                    i += 1;
                }
                ;
                this.cursor = i;
                this.lastRet = i - 1;
                _checkForComodification();
            }
        }
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(ArrayList_ListItr.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
