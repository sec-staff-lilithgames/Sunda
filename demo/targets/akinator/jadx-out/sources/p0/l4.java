package p0;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l4 implements CoroutineScope, j4 {

    /* renamed from: g, reason: collision with root package name */
    public static final j f80317g;

    /* renamed from: b, reason: collision with root package name */
    public final zu.m f80318b;

    /* renamed from: c, reason: collision with root package name */
    public final zu.m f80319c;

    /* renamed from: e, reason: collision with root package name */
    public final l4 f80320e = this;

    /* renamed from: f, reason: collision with root package name */
    public volatile zu.m f80321f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends zu.a implements CoroutineExceptionHandler {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d1.g f80322e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l4 f80323f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, d1.g gVar, l4 l4Var) {
            super(key);
            this.f80322e = gVar;
            this.f80323f = l4Var;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(zu.m mVar, Throwable th2) throws Throwable {
            d1.g gVar = this.f80322e;
            l4 l4Var = this.f80323f;
            gVar.attachComposeStackTrace(th2, l4Var);
            zu.m mVar2 = l4Var.f80319c;
            CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) mVar2.get(key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(mVar, th2);
                return;
            }
            CoroutineExceptionHandler coroutineExceptionHandler2 = (CoroutineExceptionHandler) l4Var.f80318b.get(key);
            if (coroutineExceptionHandler2 == null) {
                throw th2;
            }
            coroutineExceptionHandler2.handleException(mVar, th2);
        }
    }

    static {
        new a(null);
        f80317g = new j();
    }

    public l4(zu.m mVar, zu.m mVar2) {
        this.f80318b = mVar;
        this.f80319c = mVar2;
    }

    public final void cancelIfCreated() {
        synchronized (this.f80320e) {
            try {
                zu.m mVar = this.f80321f;
                if (mVar == null) {
                    this.f80321f = f80317g;
                } else {
                    JobKt.cancel(mVar, (CancellationException) new l1());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public zu.m getCoroutineContext() {
        zu.m mVarPlus;
        zu.m mVar = this.f80321f;
        if (mVar == null || mVar == f80317g) {
            d1.g gVar = (d1.g) this.f80318b.get(d1.g.f51699c);
            zu.m bVar = gVar != null ? new b(CoroutineExceptionHandler.Key, gVar, this) : zu.n.f98854b;
            synchronized (this.f80320e) {
                try {
                    mVarPlus = this.f80321f;
                    if (mVarPlus == null) {
                        zu.m mVar2 = this.f80318b;
                        mVarPlus = mVar2.plus(JobKt.Job((Job) mVar2.get(Job.Key))).plus(this.f80319c).plus(bVar);
                    } else if (mVarPlus == f80317g) {
                        zu.m mVar3 = this.f80318b;
                        CompletableJob completableJobJob = JobKt.Job((Job) mVar3.get(Job.Key));
                        completableJobJob.cancel((CancellationException) new l1());
                        mVarPlus = mVar3.plus(completableJobJob).plus(this.f80319c).plus(bVar);
                    }
                    this.f80321f = mVarPlus;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = mVarPlus;
        }
        kotlin.jvm.internal.e0.checkNotNull(mVar);
        return mVar;
    }

    @Override // p0.j4
    public void onAbandoned() {
        cancelIfCreated();
    }

    @Override // p0.j4
    public void onForgotten() {
        cancelIfCreated();
    }

    @Override // p0.j4
    public void onRemembered() {
    }
}
