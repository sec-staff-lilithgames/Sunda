package ff;

import af.i;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.shadow.okio.Utf8;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import ef.l;
import ef.p;
import ef.q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: g, reason: collision with root package name */
    public final v0 f55654g = new v0();

    /* renamed from: h, reason: collision with root package name */
    public final u0 f55655h = new u0();

    /* renamed from: i, reason: collision with root package name */
    public int f55656i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f55657j;

    /* renamed from: k, reason: collision with root package name */
    public final C0564b[] f55658k;

    /* renamed from: l, reason: collision with root package name */
    public C0564b f55659l;

    /* renamed from: m, reason: collision with root package name */
    public List f55660m;

    /* renamed from: n, reason: collision with root package name */
    public List f55661n;

    /* renamed from: o, reason: collision with root package name */
    public c f55662o;

    /* renamed from: p, reason: collision with root package name */
    public int f55663p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final i f55664c = new i(11);

        /* renamed from: a, reason: collision with root package name */
        public final ef.b f55665a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55666b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            ef.a size = new ef.a().setText(charSequence).setTextAlignment(alignment).setLine(f10, i10).setLineAnchor(i11).setPosition(f11).setPositionAnchor(i12).setSize(f12);
            if (z10) {
                size.setWindowColor(i13);
            }
            this.f55665a = size.build();
            this.f55666b = i14;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ff.b$b, reason: collision with other inner class name */
    public static final class C0564b {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;

        /* renamed from: w, reason: collision with root package name */
        public static final int f55667w = getArgbColorFromCeaColor(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f55668x;

        /* renamed from: y, reason: collision with root package name */
        public static final int f55669y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f55670z;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f55671a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f55672b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f55673c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f55674d;

        /* renamed from: e, reason: collision with root package name */
        public int f55675e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f55676f;

        /* renamed from: g, reason: collision with root package name */
        public int f55677g;

        /* renamed from: h, reason: collision with root package name */
        public int f55678h;

        /* renamed from: i, reason: collision with root package name */
        public int f55679i;

        /* renamed from: j, reason: collision with root package name */
        public int f55680j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f55681k;

        /* renamed from: l, reason: collision with root package name */
        public int f55682l;

        /* renamed from: m, reason: collision with root package name */
        public int f55683m;

        /* renamed from: n, reason: collision with root package name */
        public int f55684n;

        /* renamed from: o, reason: collision with root package name */
        public int f55685o;

        /* renamed from: p, reason: collision with root package name */
        public int f55686p;

        /* renamed from: q, reason: collision with root package name */
        public int f55687q;

        /* renamed from: r, reason: collision with root package name */
        public int f55688r;

        /* renamed from: s, reason: collision with root package name */
        public int f55689s;

        /* renamed from: t, reason: collision with root package name */
        public int f55690t;

        /* renamed from: u, reason: collision with root package name */
        public int f55691u;

        /* renamed from: v, reason: collision with root package name */
        public int f55692v;

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            f55668x = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            f55669y = argbColorFromCeaColor2;
            f55670z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public C0564b() {
            reset();
        }

        public static int getArgbColorFromCeaColor(int i10, int i11, int i12) {
            return getArgbColorFromCeaColor(i10, i11, i12, 0);
        }

        public void append(char c10) {
            SpannableStringBuilder spannableStringBuilder = this.f55672b;
            if (c10 != '\n') {
                spannableStringBuilder.append(c10);
                return;
            }
            SpannableString spannableStringBuildSpannableString = buildSpannableString();
            ArrayList arrayList = this.f55671a;
            arrayList.add(spannableStringBuildSpannableString);
            spannableStringBuilder.clear();
            if (this.f55686p != -1) {
                this.f55686p = 0;
            }
            if (this.f55687q != -1) {
                this.f55687q = 0;
            }
            if (this.f55688r != -1) {
                this.f55688r = 0;
            }
            if (this.f55690t != -1) {
                this.f55690t = 0;
            }
            while (true) {
                if ((!this.f55681k || arrayList.size() < this.f55680j) && arrayList.size() < 15) {
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
        }

        public void backspace() {
            SpannableStringBuilder spannableStringBuilder = this.f55672b;
            int length = spannableStringBuilder.length();
            if (length > 0) {
                spannableStringBuilder.delete(length - 1, length);
            }
        }

        public a build() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            int i10;
            float f12;
            int i11;
            if (isEmpty()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f55671a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i12));
                spannableStringBuilder.append('\n');
                i12++;
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i13 = this.f55682l;
            int i14 = 2;
            if (i13 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f55682l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f55676f) {
                f10 = this.f55678h / 99.0f;
                f11 = this.f55677g / 99.0f;
            } else {
                f10 = this.f55678h / 209.0f;
                f11 = this.f55677g / 74.0f;
            }
            float f13 = (f10 * 0.9f) + 0.05f;
            float f14 = (f11 * 0.9f) + 0.05f;
            int i15 = this.f55679i;
            int i16 = i15 / 3;
            if (i16 == 0) {
                i10 = i15;
                f12 = f13;
                i11 = 0;
            } else if (i16 == 1) {
                i10 = i15;
                f12 = f13;
                i11 = 1;
            } else {
                i10 = i15;
                f12 = f13;
                i11 = 2;
            }
            int i17 = i10 % 3;
            if (i17 == 0) {
                i14 = 0;
            } else if (i17 == 1) {
                i14 = 1;
            }
            int i18 = this.f55685o;
            return new a(spannableStringBuilder, alignment, f14, 0, i11, f12, i14, -3.4028235E38f, i18 != f55668x, i18, this.f55675e);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f55672b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f55686p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f55686p, length, 33);
                }
                if (this.f55687q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f55687q, length, 33);
                }
                if (this.f55688r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f55689s), this.f55688r, length, 33);
                }
                if (this.f55690t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f55691u), this.f55690t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.f55671a.clear();
            this.f55672b.clear();
            this.f55686p = -1;
            this.f55687q = -1;
            this.f55688r = -1;
            this.f55690t = -1;
            this.f55692v = 0;
        }

        public void defineWindow(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f55673c = true;
            this.f55674d = z10;
            this.f55681k = z11;
            this.f55675e = i10;
            this.f55676f = z13;
            this.f55677g = i11;
            this.f55678h = i12;
            this.f55679i = i15;
            int i18 = i13 + 1;
            if (this.f55680j != i18) {
                this.f55680j = i18;
                while (true) {
                    ArrayList arrayList = this.f55671a;
                    if ((!z11 || arrayList.size() < this.f55680j) && arrayList.size() < 15) {
                        break;
                    } else {
                        arrayList.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f55683m != i16) {
                this.f55683m = i16;
                int i19 = i16 - 1;
                setWindowAttributes(D[i19], f55669y, C[i19], 0, A[i19], B[i19], f55670z[i19]);
            }
            if (i17 == 0 || this.f55684n == i17) {
                return;
            }
            this.f55684n = i17;
            int i20 = i17 - 1;
            setPenAttributes(0, 1, 1, false, false, F[i20], E[i20]);
            setPenColor(f55667w, G[i20], f55668x);
        }

        public boolean isDefined() {
            return this.f55673c;
        }

        public boolean isEmpty() {
            if (isDefined()) {
                return this.f55671a.isEmpty() && this.f55672b.length() == 0;
            }
            return true;
        }

        public boolean isVisible() {
            return this.f55674d;
        }

        public void reset() {
            clear();
            this.f55673c = false;
            this.f55674d = false;
            this.f55675e = 4;
            this.f55676f = false;
            this.f55677g = 0;
            this.f55678h = 0;
            this.f55679i = 0;
            this.f55680j = 15;
            this.f55681k = true;
            this.f55682l = 0;
            this.f55683m = 0;
            this.f55684n = 0;
            int i10 = f55668x;
            this.f55685o = i10;
            this.f55689s = f55667w;
            this.f55691u = i10;
        }

        public void setPenAttributes(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            int i15 = this.f55686p;
            SpannableStringBuilder spannableStringBuilder = this.f55672b;
            if (i15 != -1) {
                if (!z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f55686p, spannableStringBuilder.length(), 33);
                    this.f55686p = -1;
                }
            } else if (z10) {
                this.f55686p = spannableStringBuilder.length();
            }
            if (this.f55687q == -1) {
                if (z11) {
                    this.f55687q = spannableStringBuilder.length();
                }
            } else {
                if (z11) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f55687q, spannableStringBuilder.length(), 33);
                this.f55687q = -1;
            }
        }

        public void setPenColor(int i10, int i11, int i12) {
            int i13 = this.f55688r;
            SpannableStringBuilder spannableStringBuilder = this.f55672b;
            if (i13 != -1 && this.f55689s != i10) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f55689s), this.f55688r, spannableStringBuilder.length(), 33);
            }
            if (i10 != f55667w) {
                this.f55688r = spannableStringBuilder.length();
                this.f55689s = i10;
            }
            if (this.f55690t != -1 && this.f55691u != i11) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f55691u), this.f55690t, spannableStringBuilder.length(), 33);
            }
            if (i11 != f55668x) {
                this.f55690t = spannableStringBuilder.length();
                this.f55691u = i11;
            }
        }

        public void setPenLocation(int i10, int i11) {
            if (this.f55692v != i10) {
                append('\n');
            }
            this.f55692v = i10;
        }

        public void setVisibility(boolean z10) {
            this.f55674d = z10;
        }

        public void setWindowAttributes(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f55685o = i10;
            this.f55682l = i15;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getArgbColorFromCeaColor(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.google.android.exoplayer2.util.a.checkIndex(r4, r0, r1)
                com.google.android.exoplayer2.util.a.checkIndex(r5, r0, r1)
                com.google.android.exoplayer2.util.a.checkIndex(r6, r0, r1)
                com.google.android.exoplayer2.util.a.checkIndex(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ff.b.C0564b.getArgbColorFromCeaColor(int, int, int, int):int");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f55693a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55694b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f55695c;

        /* renamed from: d, reason: collision with root package name */
        public int f55696d = 0;

        public c(int i10, int i11) {
            this.f55693a = i10;
            this.f55694b = i11;
            this.f55695c = new byte[(i11 * 2) - 1];
        }
    }

    public b(int i10, List<byte[]> list) {
        this.f55657j = i10 == -1 ? 1 : i10;
        if (list != null) {
            com.google.android.exoplayer2.util.e.parseCea708InitializationData(list);
        }
        this.f55658k = new C0564b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f55658k[i11] = new C0564b();
        }
        this.f55659l = this.f55658k[0];
    }

    @Override // ff.d
    public final e a() {
        List list = this.f55660m;
        this.f55661n = list;
        return new e((List) com.google.android.exoplayer2.util.a.checkNotNull(list));
    }

    @Override // ff.d
    public final void b(ff.c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.checkNotNull(cVar.f12237e);
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        v0 v0Var = this.f55654g;
        v0Var.reset(bArrArray, iLimit);
        while (v0Var.bytesLeft() >= 3) {
            int unsignedByte = v0Var.readUnsignedByte();
            int i10 = unsignedByte & 3;
            boolean z10 = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) v0Var.readUnsignedByte();
            byte unsignedByte3 = (byte) v0Var.readUnsignedByte();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        d();
                        int i11 = (unsignedByte2 & 192) >> 6;
                        int i12 = this.f55656i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            f();
                            f0.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f55656i + " current=" + i11);
                        }
                        this.f55656i = i11;
                        int i13 = unsignedByte2 & Utf8.REPLACEMENT_BYTE;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar2 = new c(i11, i13);
                        this.f55662o = cVar2;
                        int i14 = cVar2.f55696d;
                        cVar2.f55696d = i14 + 1;
                        cVar2.f55695c[i14] = unsignedByte3;
                    } else {
                        com.google.android.exoplayer2.util.a.checkArgument(i10 == 2);
                        c cVar3 = this.f55662o;
                        if (cVar3 == null) {
                            f0.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = cVar3.f55695c;
                            int i15 = cVar3.f55696d;
                            int i16 = i15 + 1;
                            cVar3.f55696d = i16;
                            bArr[i15] = unsignedByte2;
                            cVar3.f55696d = i15 + 2;
                            bArr[i16] = unsignedByte3;
                        }
                    }
                    c cVar4 = this.f55662o;
                    if (cVar4.f55696d == (cVar4.f55694b * 2) - 1) {
                        d();
                    }
                }
            }
        }
    }

    @Override // ff.d
    public final boolean c() {
        return this.f55660m != this.f55661n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61, types: [int] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [int] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [int] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [int] */
    public final void d() {
        char c10;
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar = this.f55662o;
        if (cVar == null) {
            return;
        }
        boolean z13 = true;
        if (cVar.f55696d != (cVar.f55694b * 2) - 1) {
            f0.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f55662o.f55694b * 2) - 1) + ", but current index is " + this.f55662o.f55696d + " (sequence number " + this.f55662o.f55693a + ");");
        }
        c cVar2 = this.f55662o;
        byte[] bArr = cVar2.f55695c;
        int i10 = cVar2.f55696d;
        u0 u0Var = this.f55655h;
        u0Var.reset(bArr, i10);
        boolean z14 = false;
        while (true) {
            if (u0Var.bitsLeft() > 0) {
                int bits = u0Var.readBits(3);
                int bits2 = u0Var.readBits(5);
                if (bits == 7) {
                    u0Var.skipBits(2);
                    bits = u0Var.readBits(6);
                    if (bits < 7) {
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (bits2 == 0) {
                    if (bits != 0) {
                        f0.w("Cea708Decoder", "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                    }
                } else if (bits != this.f55657j) {
                    u0Var.skipBytes(bits2);
                } else {
                    int position = (bits2 * 8) + u0Var.getPosition();
                    while (u0Var.getPosition() < position) {
                        int bits3 = u0Var.readBits(8);
                        boolean z15 = z13;
                        if (bits3 != 16) {
                            if (bits3 <= 31) {
                                if (bits3 != 0) {
                                    if (bits3 == 3) {
                                        this.f55660m = e();
                                    } else if (bits3 != 8) {
                                        switch (bits3) {
                                            case 12:
                                                f();
                                                break;
                                            case 13:
                                                this.f55659l.append('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (bits3 < 17 || bits3 > 23) {
                                                    if (bits3 < 24 || bits3 > 31) {
                                                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        f0.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + bits3);
                                                        u0Var.skipBits(16);
                                                        break;
                                                    }
                                                } else {
                                                    f0.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + bits3);
                                                    u0Var.skipBits(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        this.f55659l.backspace();
                                    }
                                }
                            } else if (bits3 <= 127) {
                                if (bits3 == 127) {
                                    this.f55659l.append((char) 9835);
                                } else {
                                    this.f55659l.append((char) (bits3 & 255));
                                }
                                z14 = z15;
                            } else {
                                if (bits3 <= 159) {
                                    C0564b[] c0564bArr = this.f55658k;
                                    switch (bits3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case 134:
                                        case 135:
                                            z10 = z15;
                                            z11 = false;
                                            int i11 = bits3 - 128;
                                            if (this.f55663p != i11) {
                                                this.f55663p = i11;
                                                this.f55659l = c0564bArr[i11];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            z10 = z15;
                                            z11 = false;
                                            for (?? r12 = z10; r12 <= 8; r12++) {
                                                if (u0Var.readBit()) {
                                                    c0564bArr[8 - r12].clear();
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            z11 = false;
                                            for (?? r13 = z15; r13 <= 8; r13++) {
                                                if (u0Var.readBit()) {
                                                    z12 = z15;
                                                    c0564bArr[8 - r13].setVisibility(z12);
                                                } else {
                                                    z12 = z15;
                                                }
                                                z15 = z12;
                                            }
                                            z10 = z15;
                                            break;
                                        case 138:
                                            for (?? r14 = z15; r14 <= 8; r14++) {
                                                if (u0Var.readBit()) {
                                                    c0564bArr[8 - r14].setVisibility(false);
                                                }
                                            }
                                            z11 = false;
                                            z10 = z15;
                                            break;
                                        case 139:
                                            for (?? r15 = z15; r15 <= 8; r15++) {
                                                if (u0Var.readBit()) {
                                                    c0564bArr[8 - r15].setVisibility(!r2.isVisible());
                                                }
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 140:
                                            for (?? r16 = z15; r16 <= 8; r16++) {
                                                if (u0Var.readBit()) {
                                                    c0564bArr[8 - r16].reset();
                                                }
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 141:
                                            u0Var.skipBits(8);
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 142:
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 143:
                                            f();
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 144:
                                            if (this.f55659l.isDefined()) {
                                                this.f55659l.setPenAttributes(u0Var.readBits(4), u0Var.readBits(2), u0Var.readBits(2), u0Var.readBit(), u0Var.readBit(), u0Var.readBits(3), u0Var.readBits(3));
                                            } else {
                                                u0Var.skipBits(16);
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 145:
                                            if (this.f55659l.isDefined()) {
                                                int argbColorFromCeaColor = C0564b.getArgbColorFromCeaColor(u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2));
                                                int argbColorFromCeaColor2 = C0564b.getArgbColorFromCeaColor(u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2));
                                                u0Var.skipBits(2);
                                                this.f55659l.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, C0564b.getArgbColorFromCeaColor(u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2)));
                                            } else {
                                                u0Var.skipBits(24);
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 146:
                                            if (this.f55659l.isDefined()) {
                                                u0Var.skipBits(4);
                                                int bits4 = u0Var.readBits(4);
                                                u0Var.skipBits(2);
                                                this.f55659l.setPenLocation(bits4, u0Var.readBits(6));
                                            } else {
                                                u0Var.skipBits(16);
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits3, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 151:
                                            if (this.f55659l.isDefined()) {
                                                int argbColorFromCeaColor3 = C0564b.getArgbColorFromCeaColor(u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2));
                                                int bits5 = u0Var.readBits(2);
                                                int argbColorFromCeaColor4 = C0564b.getArgbColorFromCeaColor(u0Var.readBits(2), u0Var.readBits(2), u0Var.readBits(2));
                                                if (u0Var.readBit()) {
                                                    bits5 |= 4;
                                                }
                                                boolean bit = u0Var.readBit();
                                                int bits6 = u0Var.readBits(2);
                                                int bits7 = u0Var.readBits(2);
                                                int bits8 = u0Var.readBits(2);
                                                u0Var.skipBits(8);
                                                this.f55659l.setWindowAttributes(argbColorFromCeaColor3, argbColorFromCeaColor4, bit, bits5, bits6, bits7, bits8);
                                            } else {
                                                u0Var.skipBits(32);
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i12 = bits3 - 152;
                                            C0564b c0564b = c0564bArr[i12];
                                            u0Var.skipBits(2);
                                            boolean bit2 = u0Var.readBit();
                                            boolean bit3 = u0Var.readBit();
                                            boolean bit4 = u0Var.readBit();
                                            int bits9 = u0Var.readBits(3);
                                            boolean bit5 = u0Var.readBit();
                                            int bits10 = u0Var.readBits(7);
                                            int bits11 = u0Var.readBits(8);
                                            int bits12 = u0Var.readBits(4);
                                            int bits13 = u0Var.readBits(4);
                                            u0Var.skipBits(2);
                                            int bits14 = u0Var.readBits(6);
                                            u0Var.skipBits(2);
                                            c0564b.defineWindow(bit2, bit3, bit4, bits9, bit5, bits10, bits11, bits13, bits14, bits12, u0Var.readBits(3), u0Var.readBits(3));
                                            if (this.f55663p != i12) {
                                                this.f55663p = i12;
                                                this.f55659l = c0564bArr[i12];
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                    }
                                } else {
                                    z10 = z15;
                                    z11 = false;
                                    if (bits3 <= 255) {
                                        this.f55659l.append((char) (bits3 & 255));
                                    } else {
                                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits3, "Invalid base command: ", "Cea708Decoder");
                                        z15 = z10;
                                        c10 = 6;
                                    }
                                }
                                z14 = z10;
                                z15 = z14;
                                c10 = 6;
                            }
                            c10 = 6;
                        } else {
                            int bits15 = u0Var.readBits(8);
                            if (bits15 <= 31) {
                                if (bits15 > 7) {
                                    if (bits15 <= 15) {
                                        u0Var.skipBits(8);
                                    } else if (bits15 <= 23) {
                                        u0Var.skipBits(16);
                                    } else if (bits15 <= 31) {
                                        u0Var.skipBits(24);
                                    }
                                }
                            } else if (bits15 <= 127) {
                                if (bits15 == 32) {
                                    this.f55659l.append(' ');
                                } else if (bits15 == 33) {
                                    this.f55659l.append((char) 160);
                                } else if (bits15 == 37) {
                                    this.f55659l.append((char) 8230);
                                } else if (bits15 == 42) {
                                    this.f55659l.append((char) 352);
                                } else if (bits15 == 44) {
                                    this.f55659l.append((char) 338);
                                } else if (bits15 == 63) {
                                    this.f55659l.append((char) 376);
                                } else if (bits15 == 57) {
                                    this.f55659l.append((char) 8482);
                                } else if (bits15 == 58) {
                                    this.f55659l.append((char) 353);
                                } else if (bits15 == 60) {
                                    this.f55659l.append((char) 339);
                                } else if (bits15 != 61) {
                                    switch (bits15) {
                                        case 48:
                                            this.f55659l.append((char) 9608);
                                            break;
                                        case 49:
                                            this.f55659l.append((char) 8216);
                                            break;
                                        case 50:
                                            this.f55659l.append((char) 8217);
                                            break;
                                        case 51:
                                            this.f55659l.append((char) 8220);
                                            break;
                                        case 52:
                                            this.f55659l.append((char) 8221);
                                            break;
                                        case 53:
                                            this.f55659l.append((char) 8226);
                                            break;
                                        default:
                                            switch (bits15) {
                                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                    this.f55659l.append((char) 8539);
                                                    break;
                                                case JSON_ENCODE_ERROR_VALUE:
                                                    this.f55659l.append((char) 8540);
                                                    break;
                                                case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                                                    this.f55659l.append((char) 8541);
                                                    break;
                                                case TPAT_ERROR_VALUE:
                                                    this.f55659l.append((char) 8542);
                                                    break;
                                                case INVALID_ADS_ENDPOINT_VALUE:
                                                    this.f55659l.append((char) 9474);
                                                    break;
                                                case INVALID_RI_ENDPOINT_VALUE:
                                                    this.f55659l.append((char) 9488);
                                                    break;
                                                case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                    this.f55659l.append((char) 9492);
                                                    break;
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                    this.f55659l.append((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f55659l.append((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f55659l.append((char) 9484);
                                                    break;
                                                default:
                                                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits15, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f55659l.append((char) 8480);
                                }
                                z14 = z15;
                            } else if (bits15 > 159) {
                                c10 = 6;
                                if (bits15 <= 255) {
                                    if (bits15 == 160) {
                                        this.f55659l.append((char) 13252);
                                    } else {
                                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits15, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f55659l.append('_');
                                    }
                                    z14 = z15;
                                } else {
                                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits15, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (bits15 <= 135) {
                                u0Var.skipBits(32);
                            } else if (bits15 <= 143) {
                                u0Var.skipBits(40);
                            } else if (bits15 <= 159) {
                                u0Var.skipBits(2);
                                c10 = 6;
                                u0Var.skipBits(u0Var.readBits(6) * 8);
                            }
                            c10 = 6;
                        }
                        z13 = z15;
                    }
                }
            }
        }
        if (z14) {
            this.f55660m = e();
        }
        this.f55662o = null;
    }

    @Override // ff.d, ef.k, ce.e
    public /* bridge */ /* synthetic */ p dequeueInputBuffer() throws l {
        return super.dequeueInputBuffer();
    }

    @Override // ff.d, ef.k, ce.e
    public /* bridge */ /* synthetic */ q dequeueOutputBuffer() throws l {
        return super.dequeueOutputBuffer();
    }

    public final List e() {
        a aVarBuild;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            C0564b[] c0564bArr = this.f55658k;
            if (!c0564bArr[i10].isEmpty() && c0564bArr[i10].isVisible() && (aVarBuild = c0564bArr[i10].build()) != null) {
                arrayList.add(aVarBuild);
            }
        }
        Collections.sort(arrayList, a.f55664c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f55665a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void f() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f55658k[i10].reset();
        }
    }

    @Override // ff.d, ef.k, ce.e
    public void flush() {
        super.flush();
        this.f55660m = null;
        this.f55661n = null;
        this.f55663p = 0;
        this.f55659l = this.f55658k[0];
        f();
        this.f55662o = null;
    }

    @Override // ff.d, ef.k, ce.e
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // ff.d
    public /* bridge */ /* synthetic */ void queueInputBuffer(p pVar) throws l {
        super.queueInputBuffer(pVar);
    }

    @Override // ff.d, ef.k, ce.e
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // ff.d, ef.k
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }
}
