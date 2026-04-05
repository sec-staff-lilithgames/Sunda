package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ie, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractRunnableC3273ie implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36945a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.ie$a */
    public static final class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.ie$a$a, reason: collision with other inner class name */
        public static final class C0229a extends AbstractRunnableC3273ie {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kv.a f36946b;

            public C0229a(kv.a aVar) {
                this.f36946b = aVar;
            }

            @Override // com.ironsource.AbstractRunnableC3273ie
            public void a() {
                this.f36946b.invoke();
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final AbstractRunnableC3273ie a(kv.a block) {
            kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
            return new C0229a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(Throwable t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "t");
        C3518wf.a(t10);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            try {
                a(th2);
            } catch (Throwable th3) {
                C3422r4.d().a(th3);
            }
        }
    }
}
