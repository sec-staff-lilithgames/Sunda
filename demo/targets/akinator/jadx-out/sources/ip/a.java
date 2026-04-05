package ip;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.explorestack.protobuf.openrtb.LossReason;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import e3.g;
import hp.k;
import hp.n;
import hp.o;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends d {

    /* renamed from: i, reason: collision with root package name */
    public final int f68271i;

    /* renamed from: j, reason: collision with root package name */
    public final int f68272j;

    /* renamed from: k, reason: collision with root package name */
    public final int f68273k;

    /* renamed from: l, reason: collision with root package name */
    public final long f68274l;

    /* renamed from: o, reason: collision with root package name */
    public List f68277o;

    /* renamed from: p, reason: collision with root package name */
    public List f68278p;

    /* renamed from: q, reason: collision with root package name */
    public int f68279q;

    /* renamed from: r, reason: collision with root package name */
    public int f68280r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f68281s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f68282t;

    /* renamed from: u, reason: collision with root package name */
    public byte f68283u;

    /* renamed from: v, reason: collision with root package name */
    public byte f68284v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f68286x;

    /* renamed from: y, reason: collision with root package name */
    public long f68287y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f68269z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] E = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final m0 f68270h = new m0();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f68275m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public C0704a f68276n = new C0704a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f68285w = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ip.a$a, reason: collision with other inner class name */
    public static final class C0704a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f68288a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f68289b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f68290c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        public int f68291d;

        /* renamed from: e, reason: collision with root package name */
        public int f68292e;

        /* renamed from: f, reason: collision with root package name */
        public int f68293f;

        /* renamed from: g, reason: collision with root package name */
        public int f68294g;

        /* renamed from: h, reason: collision with root package name */
        public int f68295h;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: ip.a$a$a, reason: collision with other inner class name */
        public static class C0705a {

            /* renamed from: a, reason: collision with root package name */
            public final int f68296a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f68297b;

            /* renamed from: c, reason: collision with root package name */
            public int f68298c;

            public C0705a(int i10, boolean z10, int i11) {
                this.f68296a = i10;
                this.f68297b = z10;
                this.f68298c = i11;
            }
        }

        public C0704a(int i10, int i11) {
            reset(i10);
            this.f68295h = i11;
        }

        public final SpannableString a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f68290c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList arrayList = this.f68288a;
                if (i14 >= arrayList.size()) {
                    break;
                }
                C0705a c0705a = (C0705a) arrayList.get(i14);
                boolean z11 = c0705a.f68297b;
                int i16 = c0705a.f68296a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0705a.f68298c;
                i14++;
                if (i17 != (i14 < arrayList.size() ? ((C0705a) arrayList.get(i14)).f68298c : length)) {
                    if (i10 != -1 && !z11) {
                        g.u(spannableStringBuilder, i10, i17, 33);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        g.s(2, spannableStringBuilder, i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        if (i12 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                        }
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                g.u(spannableStringBuilder, i10, length, 33);
            }
            if (i11 != -1 && i11 != length) {
                g.s(2, spannableStringBuilder, i11, length, 33);
            }
            if (i15 != length && i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void append(char c10) {
            StringBuilder sb2 = this.f68290c;
            if (sb2.length() < 32) {
                sb2.append(c10);
            }
        }

        public void backspace() {
            StringBuilder sb2 = this.f68290c;
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 1, length);
                ArrayList arrayList = this.f68288a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0705a c0705a = (C0705a) arrayList.get(size);
                    int i10 = c0705a.f68298c;
                    if (i10 != length) {
                        return;
                    }
                    c0705a.f68298c = i10 - 1;
                }
            }
        }

        public in.b build(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f68289b;
                if (i11 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i11));
                spannableStringBuilder.append('\n');
                i11++;
            }
            spannableStringBuilder.append((CharSequence) a());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f68292e + this.f68293f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f68294g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f68294g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f68291d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f68294g == 1) {
                i14 -= this.f68295h - 1;
            }
            return new in.a().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i14, 1).setPosition(f10).setPositionAnchor(i10).build();
        }

        public boolean isEmpty() {
            return this.f68288a.isEmpty() && this.f68289b.isEmpty() && this.f68290c.length() == 0;
        }

        public void reset(int i10) {
            this.f68294g = i10;
            this.f68288a.clear();
            this.f68289b.clear();
            this.f68290c.setLength(0);
            this.f68291d = 15;
            this.f68292e = 0;
            this.f68293f = 0;
        }

        public void rollUp() {
            SpannableString spannableStringA = a();
            ArrayList arrayList = this.f68289b;
            arrayList.add(spannableStringA);
            this.f68290c.setLength(0);
            this.f68288a.clear();
            int iMin = Math.min(this.f68295h, this.f68291d);
            while (arrayList.size() >= iMin) {
                arrayList.remove(0);
            }
        }

        public void setCaptionMode(int i10) {
            this.f68294g = i10;
        }

        public void setCaptionRowCount(int i10) {
            this.f68295h = i10;
        }

        public void setStyle(int i10, boolean z10) {
            this.f68288a.add(new C0705a(i10, z10, this.f68290c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != C.TIME_UNSET) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 >= 16000);
            this.f68274l = j10 * 1000;
        } else {
            this.f68274l = C.TIME_UNSET;
        }
        this.f68271i = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f68273k = 0;
            this.f68272j = 0;
        } else if (i10 == 2) {
            this.f68273k = 1;
            this.f68272j = 0;
        } else if (i10 == 3) {
            this.f68273k = 0;
            this.f68272j = 1;
        } else if (i10 != 4) {
            b0.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f68273k = 0;
            this.f68272j = 0;
        } else {
            this.f68273k = 1;
            this.f68272j = 1;
        }
        f(0);
        e();
        this.f68286x = true;
        this.f68287y = C.TIME_UNSET;
    }

    @Override // ip.d
    public final e a() {
        List list = this.f68277o;
        this.f68278p = list;
        return new e((List) io.bidmachine.media3.common.util.a.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9 A[FALL_THROUGH] */
    @Override // ip.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(ip.c r15) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.a.b(ip.c):void");
    }

    @Override // ip.d
    public final boolean c() {
        return this.f68277o != this.f68278p;
    }

    public final ArrayList d() {
        ArrayList arrayList = this.f68275m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            in.b bVarBuild = ((C0704a) arrayList.get(i10)).build(Integer.MIN_VALUE);
            arrayList2.add(bVarBuild);
            if (bVarBuild != null) {
                iMin = Math.min(iMin, bVarBuild.f59786i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            in.b bVar = (in.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.f59786i != iMin) {
                    bVar = (in.b) io.bidmachine.media3.common.util.a.checkNotNull(((C0704a) arrayList.get(i11)).build(iMin));
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    @Override // ip.d, hp.j, nn.e
    public /* bridge */ /* synthetic */ n dequeueInputBuffer() throws k {
        return super.dequeueInputBuffer();
    }

    public final void e() {
        this.f68276n.reset(this.f68279q);
        ArrayList arrayList = this.f68275m;
        arrayList.clear();
        arrayList.add(this.f68276n);
    }

    public final void f(int i10) {
        int i11 = this.f68279q;
        if (i11 == i10) {
            return;
        }
        this.f68279q = i10;
        if (i10 != 3) {
            e();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f68277o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f68275m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((C0704a) arrayList.get(i12)).setCaptionMode(i10);
            i12++;
        }
    }

    @Override // ip.d, hp.j, nn.e
    public void flush() {
        super.flush();
        this.f68277o = null;
        this.f68278p = null;
        f(0);
        this.f68280r = 4;
        this.f68276n.setCaptionRowCount(4);
        e();
        this.f68281s = false;
        this.f68282t = false;
        this.f68283u = (byte) 0;
        this.f68284v = (byte) 0;
        this.f68285w = 0;
        this.f68286x = true;
        this.f68287y = C.TIME_UNSET;
    }

    @Override // ip.d, hp.j
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // ip.d
    public /* bridge */ /* synthetic */ void queueInputBuffer(n nVar) throws k {
        super.queueInputBuffer(nVar);
    }

    @Override // ip.d, hp.j
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    @Override // ip.d, hp.j, nn.e
    public o dequeueOutputBuffer() throws k {
        o oVar;
        o oVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (oVarDequeueOutputBuffer != null) {
            return oVarDequeueOutputBuffer;
        }
        long j10 = this.f68274l;
        if (j10 == C.TIME_UNSET) {
            return null;
        }
        long j11 = this.f68287y;
        if (j11 == C.TIME_UNSET || this.f68347e - j11 < j10 || (oVar = (o) this.f68344b.pollFirst()) == null) {
            return null;
        }
        this.f68277o = Collections.EMPTY_LIST;
        this.f68287y = C.TIME_UNSET;
        oVar.setContent(this.f68347e, a(), Long.MAX_VALUE);
        return oVar;
    }

    @Override // ip.d, hp.j, nn.e
    public void release() {
    }
}
