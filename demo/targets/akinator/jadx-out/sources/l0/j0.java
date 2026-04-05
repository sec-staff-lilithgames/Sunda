package l0;

import e0.h2;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j0 {
    public static final Object access$detectDragGesturesWithObserver(u1.k0 k0Var, z0 z0Var, zu.d dVar) {
        Object objDetectDragGestures = e0.d1.detectDragGestures(k0Var, new d0(z0Var), new e0(z0Var), new f0(z0Var), new g0(z0Var), dVar);
        return objDetectDragGestures == av.e.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : tu.x0.f87415a;
    }

    public static final Object access$detectPreDragGesturesWithObserver(u1.k0 k0Var, z0 z0Var, zu.d dVar) {
        Object objForEachGesture = h2.forEachGesture(k0Var, new i0(z0Var, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }

    public static final Object detectDownAndDragGesturesWithObserver(u1.k0 k0Var, z0 z0Var, zu.d<? super tu.x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new y(k0Var, z0Var, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : tu.x0.f87415a;
    }

    public static final Object detectDragGesturesAfterLongPressWithObserver(u1.k0 k0Var, z0 z0Var, zu.d<? super tu.x0> dVar) {
        Object objDetectDragGesturesAfterLongPress = e0.d1.detectDragGesturesAfterLongPress(k0Var, new z(z0Var), new a0(z0Var), new b0(z0Var), new c0(z0Var), dVar);
        return objDetectDragGesturesAfterLongPress == av.e.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPress : tu.x0.f87415a;
    }
}
