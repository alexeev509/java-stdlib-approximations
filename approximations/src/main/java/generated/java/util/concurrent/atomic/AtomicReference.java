// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util.concurrent.atomic;

import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * AtomicReferenceAutomaton for LSLAtomicReference ~> java.util.concurrent.atomic.AtomicReference
 */
@Approximate(java.util.concurrent.atomic.AtomicReference.class)
public class AtomicReference implements LibSLRuntime.Automaton, Serializable {
    private static final long serialVersionUID = -1848883965231344442L;

    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    private volatile Object value;

    @LibSLRuntime.AutomatonConstructor
    public AtomicReference(Void __$lsl_token, final byte p0, final Object p1) {
        this.__$lsl_state = p0;
        this.value = p1;
    }

    @LibSLRuntime.AutomatonConstructor
    public AtomicReference(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null);
    }

    /**
     * [CONSTRUCTOR] AtomicReferenceAutomaton::LSLAtomicReference(LSLAtomicReference) -> LSLAtomicReference
     */
    public AtomicReference() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.value = null;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] AtomicReferenceAutomaton::LSLAtomicReference(LSLAtomicReference, Object) -> LSLAtomicReference
     */
    public AtomicReference(Object initialValue) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.value = initialValue;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::accumulateAndGet(LSLAtomicReference, Object, BinaryOperator) -> Object
     */
    public final Object accumulateAndGet(Object x, BinaryOperator accumulatorFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = accumulatorFunction.apply(this.value, x);
            this.value = result;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::compareAndExchange(LSLAtomicReference, Object, Object) -> Object
     */
    public final Object compareAndExchange(Object expectedValue, Object newValue) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            if (result == expectedValue) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::compareAndExchangeAcquire(LSLAtomicReference, Object, Object) -> Object
     */
    public final Object compareAndExchangeAcquire(Object expectedValue, Object newValue) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            if (result == expectedValue) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::compareAndExchangeRelease(LSLAtomicReference, Object, Object) -> Object
     */
    public final Object compareAndExchangeRelease(Object expectedValue, Object newValue) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            if (result == expectedValue) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::compareAndSet(LSLAtomicReference, Object, Object) -> boolean
     */
    public final boolean compareAndSet(Object expectedValue, Object newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::get(LSLAtomicReference) -> Object
     */
    public final Object get() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::getAcquire(LSLAtomicReference) -> Object
     */
    public final Object getAcquire() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::getAndAccumulate(LSLAtomicReference, Object, BinaryOperator) -> Object
     */
    public final Object getAndAccumulate(Object x, BinaryOperator accumulatorFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = accumulatorFunction.apply(result, x);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::getAndSet(LSLAtomicReference, Object) -> Object
     */
    public final Object getAndSet(Object newValue) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = newValue;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::getAndUpdate(LSLAtomicReference, UnaryOperator) -> Object
     */
    public final Object getAndUpdate(UnaryOperator updateFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = updateFunction.apply(result);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::getOpaque(LSLAtomicReference) -> Object
     */
    public final Object getOpaque() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::getPlain(LSLAtomicReference) -> Object
     */
    public final Object getPlain() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::lazySet(LSLAtomicReference, Object) -> void
     */
    public final void lazySet(Object newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::set(LSLAtomicReference, Object) -> void
     */
    public final void set(Object newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::setOpaque(LSLAtomicReference, Object) -> void
     */
    public final void setOpaque(Object newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::setPlain(LSLAtomicReference, Object) -> void
     */
    public final void setPlain(Object newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::setRelease(LSLAtomicReference, Object) -> void
     */
    public final void setRelease(Object newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::toString(LSLAtomicReference) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.toString(this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::updateAndGet(LSLAtomicReference, UnaryOperator) -> Object
     */
    public final Object updateAndGet(UnaryOperator updateFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = updateFunction.apply(this.value);
            this.value = result;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::weakCompareAndSet(LSLAtomicReference, Object, Object) -> boolean
     */
    public final boolean weakCompareAndSet(Object expectedValue, Object newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::weakCompareAndSetAcquire(LSLAtomicReference, Object, Object) -> boolean
     */
    public final boolean weakCompareAndSetAcquire(Object expectedValue, Object newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::weakCompareAndSetPlain(LSLAtomicReference, Object, Object) -> boolean
     */
    public final boolean weakCompareAndSetPlain(Object expectedValue, Object newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::weakCompareAndSetRelease(LSLAtomicReference, Object, Object) -> boolean
     */
    public final boolean weakCompareAndSetRelease(Object expectedValue, Object newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicReferenceAutomaton::weakCompareAndSetVolatile(LSLAtomicReference, Object, Object) -> boolean
     */
    public final boolean weakCompareAndSetVolatile(Object expectedValue, Object newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(AtomicReference.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
