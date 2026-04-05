package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface a2 {
    Object getInitialState();

    Object getTargetState();

    default boolean isTransitioningTo(Object obj, Object obj2) {
        return kotlin.jvm.internal.e0.areEqual(obj, getInitialState()) && kotlin.jvm.internal.e0.areEqual(obj2, getTargetState());
    }
}
