// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util.stream;

import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.Void;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * IntStreamIteratorAutomaton for IntStreamLSLIterator ~> java.util.stream.IntStreamLSLIterator
 */
@Approximate(stub.java.util.stream.IntStreamLSLIterator.class)
public class IntStreamLSLIterator implements LibSLRuntime.Automaton, PrimitiveIterator.OfInt {
    static {
        Engine.assume(true);
    }

    public IntStreamLSL parent;

    public int cursor;

    @LibSLRuntime.AutomatonConstructor
    public IntStreamLSLIterator(Void __$lsl_token, final byte p0, final IntStreamLSL p1,
            final int p2) {
        this.parent = p1;
        this.cursor = p2;
    }

    @LibSLRuntime.AutomatonConstructor
    public IntStreamLSLIterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, 0);
    }

    /**
     * [FUNCTION] IntStreamIteratorAutomaton::hasNext(IntStreamLSLIterator) -> boolean
     */
    public boolean hasNext() {
        boolean result = false;
        /* body */ {
            Engine.assume(this.parent != null);
            result = this.cursor != ((IntStreamLSL) ((Object) this.parent)).length;
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamIteratorAutomaton::next(IntStreamLSLIterator) -> Integer
     */
    public Integer next() {
        Integer result = null;
        /* body */ {
            Engine.assume(this.parent != null);
            final int[] parentStorage = ((IntStreamLSL) ((Object) this.parent)).storage;
            final int i = this.cursor;
            if (i >= ((IntStreamLSL) ((Object) this.parent)).length) {
                throw new NoSuchElementException();
            }
            this.cursor = i + 1;
            result = parentStorage[i];
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamIteratorAutomaton::nextInt(IntStreamLSLIterator) -> int
     */
    public int nextInt() {
        int result = 0;
        /* body */ {
            Engine.assume(this.parent != null);
            final int[] parentStorage = ((IntStreamLSL) ((Object) this.parent)).storage;
            final int i = this.cursor;
            if (i >= ((IntStreamLSL) ((Object) this.parent)).length) {
                throw new NoSuchElementException();
            }
            this.cursor = i + 1;
            result = parentStorage[i];
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamIteratorAutomaton::remove(IntStreamLSLIterator) -> void
     */
    public void remove() {
        /* body */ {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * [FUNCTION] IntStreamIteratorAutomaton::forEachRemaining(IntStreamLSLIterator, Consumer) -> void
     */
    public void forEachRemaining(Consumer userAction) {
        /* body */ {
            Engine.assume(this.parent != null);
            if (userAction == null) {
                throw new NullPointerException();
            }
            int i = this.cursor;
            final int size = ((IntStreamLSL) ((Object) this.parent)).length;
            if (i != size) {
                final int[] pStorage = ((IntStreamLSL) ((Object) this.parent)).storage;
                while (i < size) {
                    final int item = pStorage[i];
                    userAction.accept(item);
                    i += 1;
                }
                ;
                this.cursor = i;
            }
        }
    }

    /**
     * [FUNCTION] IntStreamIteratorAutomaton::forEachRemaining(IntStreamLSLIterator, IntConsumer) -> void
     */
    public void forEachRemaining(IntConsumer userAction) {
        /* body */ {
            Engine.assume(this.parent != null);
            if (userAction == null) {
                throw new NullPointerException();
            }
            int i = this.cursor;
            final int size = ((IntStreamLSL) ((Object) this.parent)).length;
            if (i != size) {
                final int[] pStorage = ((IntStreamLSL) ((Object) this.parent)).storage;
                while (i < size) {
                    final int item = pStorage[i];
                    userAction.accept(item);
                    i += 1;
                }
                ;
                this.cursor = i;
            }
        }
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(IntStreamLSLIterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
