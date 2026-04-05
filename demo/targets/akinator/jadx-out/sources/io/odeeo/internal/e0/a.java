package io.odeeo.internal.e0;

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
import io.odeeo.internal.d0.a;
import io.odeeo.internal.d0.f;
import io.odeeo.internal.d0.h;
import io.odeeo.internal.d0.k;
import io.odeeo.internal.d0.l;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends c {

    /* renamed from: h, reason: collision with root package name */
    public final int f63746h;

    /* renamed from: i, reason: collision with root package name */
    public final int f63747i;

    /* renamed from: j, reason: collision with root package name */
    public final int f63748j;

    /* renamed from: k, reason: collision with root package name */
    public final long f63749k;

    /* renamed from: n, reason: collision with root package name */
    public List<io.odeeo.internal.d0.a> f63752n;

    /* renamed from: o, reason: collision with root package name */
    public List<io.odeeo.internal.d0.a> f63753o;

    /* renamed from: p, reason: collision with root package name */
    public int f63754p;

    /* renamed from: q, reason: collision with root package name */
    public int f63755q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f63756r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f63757s;

    /* renamed from: t, reason: collision with root package name */
    public byte f63758t;

    /* renamed from: u, reason: collision with root package name */
    public byte f63759u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f63761w;

    /* renamed from: x, reason: collision with root package name */
    public long f63762x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f63743y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f63744z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final x f63745g = new x();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<C0604a> f63750l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public C0604a f63751m = new C0604a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f63760v = 0;

    public a(String str, int i10, long j10) {
        this.f63749k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f63746h = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f63748j = 0;
            this.f63747i = 0;
        } else if (i10 == 2) {
            this.f63748j = 1;
            this.f63747i = 0;
        } else if (i10 == 3) {
            this.f63748j = 0;
            this.f63747i = 1;
        } else if (i10 != 4) {
            p.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f63748j = 0;
            this.f63747i = 0;
        } else {
            this.f63748j = 1;
            this.f63747i = 1;
        }
        a(0);
        g();
        this.f63761w = true;
        this.f63762x = C.TIME_UNSET;
    }

    public static int b(byte b10) {
        return (b10 >> 3) & 1;
    }

    public static boolean c(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public static boolean d(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean e(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean f(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean g(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean h(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean i(byte b10) {
        return (b10 & 240) == 16;
    }

    public static boolean j(byte b10) {
        return (b10 & 247) == 20;
    }

    public static boolean k(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    @Override // io.odeeo.internal.e0.c
    public f a() {
        List<io.odeeo.internal.d0.a> list = this.f63752n;
        this.f63753o = list;
        return new d((List) io.odeeo.internal.q0.a.checkNotNull(list));
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public /* bridge */ /* synthetic */ k dequeueInputBuffer() throws h {
        return super.dequeueInputBuffer();
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void flush() {
        super.flush();
        this.f63752n = null;
        this.f63753o = null;
        a(0);
        b(4);
        g();
        this.f63756r = false;
        this.f63757s = false;
        this.f63758t = (byte) 0;
        this.f63759u = (byte) 0;
        this.f63760v = 0;
        this.f63761w = true;
        this.f63762x = C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public String getName() {
        return "Cea608Decoder";
    }

    public final boolean l(byte b10) {
        if (h(b10)) {
            this.f63760v = b(b10);
        }
        return this.f63760v == this.f63748j;
    }

    @Override // io.odeeo.internal.e0.c
    public /* bridge */ /* synthetic */ void queueInputBuffer(k kVar) throws h {
        super.queueInputBuffer(kVar);
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    public static char c(byte b10) {
        return (char) D[b10 & 31];
    }

    public static boolean h(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public final void b(byte b10, byte b11) {
        int i10 = f63743y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f63751m.f63766d) {
            if (this.f63754p != 1 && !this.f63751m.isEmpty()) {
                C0604a c0604a = new C0604a(this.f63754p, this.f63755q);
                this.f63751m = c0604a;
                this.f63750l.add(c0604a);
            }
            this.f63751m.f63766d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f63751m.setStyle(z10 ? 8 : i11, z11);
        if (z10) {
            this.f63751m.f63767e = f63744z[i11];
        }
    }

    @Override // io.odeeo.internal.e0.c
    public boolean d() {
        return this.f63752n != this.f63753o;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public l dequeueOutputBuffer() throws h {
        l lVarB;
        l lVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (lVarDequeueOutputBuffer != null) {
            return lVarDequeueOutputBuffer;
        }
        if (!h() || (lVarB = b()) == null) {
            return null;
        }
        this.f63752n = Collections.EMPTY_LIST;
        this.f63762x = C.TIME_UNSET;
        lVarB.setContent(c(), a(), Long.MAX_VALUE);
        return lVarB;
    }

    public final void f(byte b10) {
        this.f63751m.append(' ');
        this.f63751m.setStyle((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    public final void g(byte b10) {
        if (b10 == 32) {
            a(2);
            return;
        }
        if (b10 == 41) {
            a(3);
            return;
        }
        switch (b10) {
            case 37:
                a(1);
                b(2);
                break;
            case 38:
                a(1);
                b(3);
                break;
            case 39:
                a(1);
                b(4);
                break;
            default:
                int i10 = this.f63754p;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.f63751m.backspace();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.f63752n = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    g();
                                    break;
                                }
                            case 45:
                                if (i10 == 1 && !this.f63751m.isEmpty()) {
                                    this.f63751m.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                g();
                                break;
                            case 47:
                                this.f63752n = f();
                                g();
                                break;
                        }
                    }
                }
                break;
        }
    }

    public final void i(byte b10, byte b11) {
        if (k(b10)) {
            this.f63761w = false;
            return;
        }
        if (j(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f63761w = false;
                                break;
                        }
                        return;
                }
            }
            this.f63761w = true;
        }
    }

    public static char d(byte b10) {
        return (char) E[b10 & 31];
    }

    public static char e(byte b10) {
        return (char) C[b10 & 15];
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // io.odeeo.internal.e0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(io.odeeo.internal.d0.k r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.e0.a.a(io.odeeo.internal.d0.k):void");
    }

    public final boolean h() {
        return (this.f63749k == C.TIME_UNSET || this.f63762x == C.TIME_UNSET || c() - this.f63762x < this.f63749k) ? false : true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.e0.a$a, reason: collision with other inner class name */
    public static final class C0604a {

        /* renamed from: a, reason: collision with root package name */
        public final List<C0605a> f63763a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List<SpannableString> f63764b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f63765c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        public int f63766d;

        /* renamed from: e, reason: collision with root package name */
        public int f63767e;

        /* renamed from: f, reason: collision with root package name */
        public int f63768f;

        /* renamed from: g, reason: collision with root package name */
        public int f63769g;

        /* renamed from: h, reason: collision with root package name */
        public int f63770h;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.e0.a$a$a, reason: collision with other inner class name */
        public static class C0605a {

            /* renamed from: a, reason: collision with root package name */
            public final int f63771a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f63772b;

            /* renamed from: c, reason: collision with root package name */
            public int f63773c;

            public C0605a(int i10, boolean z10, int i11) {
                this.f63771a = i10;
                this.f63772b = z10;
                this.f63773c = i11;
            }
        }

        public C0604a(int i10, int i11) {
            reset(i10);
            this.f63770h = i11;
        }

        public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            g.s(2, spannableStringBuilder, i10, i11, 33);
        }

        public static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            g.u(spannableStringBuilder, i10, i11, 33);
        }

        public void append(char c10) {
            if (this.f63765c.length() < 32) {
                this.f63765c.append(c10);
            }
        }

        public void backspace() {
            int length = this.f63765c.length();
            if (length > 0) {
                this.f63765c.delete(length - 1, length);
                for (int size = this.f63763a.size() - 1; size >= 0; size--) {
                    C0605a c0605a = this.f63763a.get(size);
                    int i10 = c0605a.f63773c;
                    if (i10 != length) {
                        return;
                    }
                    c0605a.f63773c = i10 - 1;
                }
            }
        }

        public io.odeeo.internal.d0.a build(int i10) {
            float f10;
            int i11 = this.f63767e + this.f63768f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f63764b.size(); i13++) {
                spannableStringBuilder.append(g0.truncateAscii(this.f63764b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(g0.truncateAscii(a(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f63769g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f63769g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f63766d;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.f63769g == 1) {
                i15 -= this.f63770h - 1;
            }
            return new a.b().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i15, 1).setPosition(f10).setPositionAnchor(i10).build();
        }

        public boolean isEmpty() {
            return this.f63763a.isEmpty() && this.f63764b.isEmpty() && this.f63765c.length() == 0;
        }

        public void reset(int i10) {
            this.f63769g = i10;
            this.f63763a.clear();
            this.f63764b.clear();
            this.f63765c.setLength(0);
            this.f63766d = 15;
            this.f63767e = 0;
            this.f63768f = 0;
        }

        public void rollUp() {
            this.f63764b.add(a());
            this.f63765c.setLength(0);
            this.f63763a.clear();
            int iMin = Math.min(this.f63770h, this.f63766d);
            while (this.f63764b.size() >= iMin) {
                this.f63764b.remove(0);
            }
        }

        public void setCaptionMode(int i10) {
            this.f63769g = i10;
        }

        public void setCaptionRowCount(int i10) {
            this.f63770h = i10;
        }

        public void setStyle(int i10, boolean z10) {
            this.f63763a.add(new C0605a(i10, z10, this.f63765c.length()));
        }

        public final SpannableString a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f63765c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f63763a.size()) {
                C0605a c0605a = this.f63763a.get(i14);
                boolean z11 = c0605a.f63772b;
                int i16 = c0605a.f63771a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0605a.f63773c;
                i14++;
                if (i17 != (i14 < this.f63763a.size() ? this.f63763a.get(i14).f63773c : length)) {
                    if (i10 != -1 && !z11) {
                        b(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        a(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        a(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                b(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                a(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                a(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }
    }

    public final List<io.odeeo.internal.d0.a> f() {
        int size = this.f63750l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            io.odeeo.internal.d0.a aVarBuild = this.f63750l.get(i10).build(Integer.MIN_VALUE);
            arrayList.add(aVarBuild);
            if (aVarBuild != null) {
                iMin = Math.min(iMin, aVarBuild.f63554i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            io.odeeo.internal.d0.a aVar = (io.odeeo.internal.d0.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f63554i != iMin) {
                    aVar = (io.odeeo.internal.d0.a) io.odeeo.internal.q0.a.checkNotNull(this.f63750l.get(i11).build(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    public final void b(int i10) {
        this.f63755q = i10;
        this.f63751m.setCaptionRowCount(i10);
    }

    public final void g() {
        this.f63751m.reset(this.f63754p);
        this.f63750l.clear();
        this.f63750l.add(this.f63751m);
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void release() {
    }

    public final boolean a(boolean z10, byte b10, byte b11) {
        if (z10 && i(b10)) {
            if (this.f63757s && this.f63758t == b10 && this.f63759u == b11) {
                this.f63757s = false;
                return true;
            }
            this.f63757s = true;
            this.f63758t = b10;
            this.f63759u = b11;
        } else {
            this.f63757s = false;
        }
        return false;
    }

    public final void a(int i10) {
        int i11 = this.f63754p;
        if (i11 == i10) {
            return;
        }
        this.f63754p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f63750l.size(); i12++) {
                this.f63750l.get(i12).setCaptionMode(i10);
            }
            return;
        }
        g();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f63752n = Collections.EMPTY_LIST;
        }
    }

    public static char a(byte b10) {
        return (char) B[(b10 & AbstractJsonLexerKt.TC_INVALID) - 32];
    }

    public static char a(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return c(b11);
        }
        return d(b11);
    }
}
