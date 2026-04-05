package tn;

import android.net.Uri;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ko.a0;
import on.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f87176f = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    public final int f87177a;

    /* renamed from: b, reason: collision with root package name */
    public hp.q f87178b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87179c;

    /* renamed from: d, reason: collision with root package name */
    public int f87180d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87181e;

    public d() {
        this(0, true);
    }

    public static void a(int i10, ArrayList arrayList) {
        if (rh.w.indexOf(f87176f, i10) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    @Override // tn.i
    public /* bridge */ /* synthetic */ k createExtractor(Uri uri, io.bidmachine.media3.common.b bVar, List list, u0 u0Var, Map map, a0 a0Var, f0 f0Var) throws IOException {
        return createExtractor(uri, bVar, (List<io.bidmachine.media3.common.b>) list, u0Var, (Map<String, List<String>>) map, a0Var, f0Var);
    }

    @Override // tn.i
    public io.bidmachine.media3.common.b getOutputTextFormat(io.bidmachine.media3.common.b bVar) {
        String str;
        if (!this.f87179c || !this.f87178b.supportsFormat(bVar)) {
            return bVar;
        }
        gn.w wVarBuildUpon = bVar.buildUpon();
        String str2 = bVar.f60661k;
        gn.w cueReplacementBehavior = wVarBuildUpon.setSampleMimeType("application/x-media3-cues").setCueReplacementBehavior(this.f87178b.getCueReplacementBehavior(bVar));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f60665o);
        if (str2 != null) {
            str = " " + str2;
        } else {
            str = "";
        }
        sb2.append(str);
        return cueReplacementBehavior.setCodecs(sb2.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
    }

    public d(int i10, boolean z10) {
        this.f87177a = i10;
        this.f87181e = z10;
        this.f87178b = new hp.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Type inference failed for: r6v10, types: [hp.q] */
    /* JADX WARN: Type inference failed for: r6v8, types: [hp.q] */
    @Override // tn.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tn.b createExtractor(android.net.Uri r24, io.bidmachine.media3.common.b r25, java.util.List<io.bidmachine.media3.common.b> r26, io.bidmachine.media3.common.util.u0 r27, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r28, ko.a0 r29, on.f0 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.d.createExtractor(android.net.Uri, io.bidmachine.media3.common.b, java.util.List, io.bidmachine.media3.common.util.u0, java.util.Map, ko.a0, on.f0):tn.b");
    }

    @Override // tn.i
    public d experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.f87179c = z10;
        return this;
    }

    @Override // tn.i
    public d experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        this.f87180d = i10;
        return this;
    }

    @Override // tn.i
    public d setSubtitleParserFactory(hp.q qVar) {
        this.f87178b = qVar;
        return this;
    }
}
