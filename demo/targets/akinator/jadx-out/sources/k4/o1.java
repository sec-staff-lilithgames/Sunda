package k4;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends o1 {

        /* renamed from: a, reason: collision with root package name */
        public final kv.p f70434a;

        /* renamed from: b, reason: collision with root package name */
        public final CompletableDeferred f70435b;

        /* renamed from: c, reason: collision with root package name */
        public final q2 f70436c;

        /* renamed from: d, reason: collision with root package name */
        public final zu.m f70437d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.p transform, CompletableDeferred<Object> ack, q2 q2Var, zu.m callerContext) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
            kotlin.jvm.internal.e0.checkNotNullParameter(ack, "ack");
            kotlin.jvm.internal.e0.checkNotNullParameter(callerContext, "callerContext");
            this.f70434a = transform;
            this.f70435b = ack;
            this.f70436c = q2Var;
            this.f70437d = callerContext;
        }

        public final CompletableDeferred<Object> getAck() {
            return this.f70435b;
        }

        public final zu.m getCallerContext() {
            return this.f70437d;
        }

        @Override // k4.o1
        public q2 getLastState() {
            return this.f70436c;
        }

        public final kv.p getTransform() {
            return this.f70434a;
        }
    }

    public o1(kotlin.jvm.internal.u uVar) {
    }

    public abstract q2 getLastState();
}
