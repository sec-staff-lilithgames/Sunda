package fk;

import ek.k1;
import ek.l1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f55716a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static l1 f55717b;

    public static final void notifyCrashOccurred() {
        try {
            l1 l1Var = f55717b;
            a aVar = f55716a;
            if (l1Var == null) {
                aVar.setSharedSessionRepository$com_google_firebase_firebase_sessions(k1.f54580a.getInstance());
            }
            if (aVar.getSharedSessionRepository$com_google_firebase_firebase_sessions().isInForeground()) {
                aVar.getSharedSessionRepository$com_google_firebase_firebase_sessions().appBackground();
            }
        } catch (Exception unused) {
        }
    }

    public final l1 getSharedSessionRepository$com_google_firebase_firebase_sessions() {
        l1 l1Var = f55717b;
        if (l1Var != null) {
            return l1Var;
        }
        e0.throwUninitializedPropertyAccessException("sharedSessionRepository");
        return null;
    }

    public final void setSharedSessionRepository$com_google_firebase_firebase_sessions(l1 l1Var) {
        e0.checkNotNullParameter(l1Var, "<set-?>");
        f55717b = l1Var;
    }

    public static /* synthetic */ void getSharedSessionRepository$com_google_firebase_firebase_sessions$annotations() {
    }
}
