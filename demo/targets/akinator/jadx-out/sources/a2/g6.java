package a2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public ChannelIterator f3601i;

    /* renamed from: j, reason: collision with root package name */
    public int f3602j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3603k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f3604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f3605m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h6 f3606n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Channel f3607o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f3608p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(ContentResolver contentResolver, Uri uri, h6 h6Var, Channel channel, Context context, zu.d dVar) {
        super(2, dVar);
        this.f3604l = contentResolver;
        this.f3605m = uri;
        this.f3606n = h6Var;
        this.f3607o = channel;
        this.f3608p = context;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        g6 g6Var = new g6(this.f3604l, this.f3605m, this.f3606n, this.f3607o, this.f3608p, dVar);
        g6Var.f3603k = obj;
        return g6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r6.emit(r11, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:18:0x0044, B:22:0x0054, B:24:0x005c, B:14:0x002d, B:17:0x003e), top: B:31:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r10.f3602j
            r2 = 2
            r3 = 1
            a2.h6 r4 = r10.f3606n
            android.content.ContentResolver r5 = r10.f3604l
            if (r1 == 0) goto L31
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            kotlinx.coroutines.channels.ChannelIterator r1 = r10.f3601i
            java.lang.Object r6 = r10.f3603k
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L1d
        L1b:
            r11 = r6
            goto L44
        L1d:
            r11 = move-exception
            goto L84
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            kotlinx.coroutines.channels.ChannelIterator r1 = r10.f3601i
            java.lang.Object r6 = r10.f3603k
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L1d
            goto L54
        L31:
            tu.a0.throwOnFailure(r11)
            java.lang.Object r11 = r10.f3603k
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            android.net.Uri r1 = r10.f3605m
            r6 = 0
            r5.registerContentObserver(r1, r6, r4)
            kotlinx.coroutines.channels.Channel r1 = r10.f3607o     // Catch: java.lang.Throwable -> L1d
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        L44:
            r10.f3603k = r11     // Catch: java.lang.Throwable -> L1d
            r10.f3601i = r1     // Catch: java.lang.Throwable -> L1d
            r10.f3602j = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r6 = r1.hasNext(r10)     // Catch: java.lang.Throwable -> L1d
            if (r6 != r0) goto L51
            goto L7d
        L51:
            r9 = r6
            r6 = r11
            r11 = r9
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1d
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1d
            if (r11 == 0) goto L7e
            r1.next()     // Catch: java.lang.Throwable -> L1d
            android.content.Context r11 = r10.f3608p     // Catch: java.lang.Throwable -> L1d
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1d
            java.lang.Float r11 = bv.b.boxFloat(r11)     // Catch: java.lang.Throwable -> L1d
            r10.f3603k = r6     // Catch: java.lang.Throwable -> L1d
            r10.f3601i = r1     // Catch: java.lang.Throwable -> L1d
            r10.f3602j = r2     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r11 = r6.emit(r11, r10)     // Catch: java.lang.Throwable -> L1d
            if (r11 != r0) goto L1b
        L7d:
            return r0
        L7e:
            r5.unregisterContentObserver(r4)
            tu.x0 r11 = tu.x0.f87415a
            return r11
        L84:
            r5.unregisterContentObserver(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(FlowCollector<? super Float> flowCollector, zu.d<? super tu.x0> dVar) {
        return ((g6) create(flowCollector, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
