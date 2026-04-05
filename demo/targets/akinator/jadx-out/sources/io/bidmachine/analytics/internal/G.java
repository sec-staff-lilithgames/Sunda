package io.bidmachine.analytics.internal;

import com.applovin.shadow.okio.Segment;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final J f59890a;

    /* renamed from: b, reason: collision with root package name */
    private final K f59891b;

    /* renamed from: c, reason: collision with root package name */
    private final CoroutineScope f59892c;

    /* renamed from: d, reason: collision with root package name */
    private Job f59893d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        G a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f59894a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f59895b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f59897d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, zu.d dVar) {
            super(2, dVar);
            this.f59897d = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            b bVar = G.this.new b(this.f59897d, dVar);
            bVar.f59895b = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f59894a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            K k10 = G.this.f59891b;
            G g8 = G.this;
            String str = this.f59897d;
            synchronized (k10) {
                try {
                    int i10 = tu.z.f87419c;
                    InputStream inputStreamA = g8.f59891b.a(sv.n0.split$default((CharSequence) s0.b(str), new String[]{" "}, false, 0, 6, (Object) null));
                    x0 x0Var = null;
                    BufferedReader bufferedReader = inputStreamA != null ? new BufferedReader(new InputStreamReader(inputStreamA, sv.g.f86134b), Segment.SIZE) : null;
                    if (bufferedReader != null) {
                        try {
                            g8.a(str, gv.y.lineSequence(bufferedReader));
                            gv.d.closeFinally(bufferedReader, null);
                        } finally {
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        x0Var = x0.f87415a;
                    }
                    tu.z.m7131constructorimpl(x0Var);
                } catch (Throwable th2) {
                    int i11 = tu.z.f87419c;
                    tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                }
            }
            return x0.f87415a;
        }
    }

    public G(J j10, K k10, CoroutineScope coroutineScope) {
        this.f59890a = j10;
        this.f59891b = k10;
        this.f59892c = coroutineScope;
    }

    private final boolean b() {
        Job job = this.f59893d;
        return job != null && job.isActive();
    }

    public final void a(String str) {
        Job job = this.f59893d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f59893d = BuildersKt__Builders_commonKt.launch$default(this.f59892c, null, null, new b(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, rv.t tVar) {
        Iterator<Object> it = tVar.iterator();
        while (b() && it.hasNext()) {
            this.f59890a.a(str, (String) it.next());
        }
    }

    public final void a() {
        Job job = this.f59893d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f59893d = null;
        synchronized (this.f59891b) {
            try {
                int i10 = tu.z.f87419c;
                this.f59891b.a();
                tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
    }
}
