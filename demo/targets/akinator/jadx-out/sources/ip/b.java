package ip;

import af.i;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import e3.g;
import hp.k;
import hp.n;
import hp.o;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.h;
import io.bidmachine.media3.common.util.l0;
import io.bidmachine.media3.common.util.m0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends d {

    /* renamed from: h, reason: collision with root package name */
    public final m0 f68299h = new m0();

    /* renamed from: i, reason: collision with root package name */
    public final l0 f68300i = new l0();

    /* renamed from: j, reason: collision with root package name */
    public int f68301j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final int f68302k;

    /* renamed from: l, reason: collision with root package name */
    public final C0706b[] f68303l;

    /* renamed from: m, reason: collision with root package name */
    public C0706b f68304m;

    /* renamed from: n, reason: collision with root package name */
    public List f68305n;

    /* renamed from: o, reason: collision with root package name */
    public List f68306o;

    /* renamed from: p, reason: collision with root package name */
    public c f68307p;

    /* renamed from: q, reason: collision with root package name */
    public int f68308q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final i f68309c = new i(27);

        /* renamed from: a, reason: collision with root package name */
        public final in.b f68310a;

        /* renamed from: b, reason: collision with root package name */
        public final int f68311b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            in.a size = new in.a().setText(charSequence).setTextAlignment(alignment).setLine(f10, i10).setLineAnchor(i11).setPosition(f11).setPositionAnchor(i12).setSize(f12);
            if (z10) {
                size.setWindowColor(i13);
            }
            this.f68310a = size.build();
            this.f68311b = i14;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ip.b$b, reason: collision with other inner class name */
    public static final class C0706b {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;

        /* renamed from: v, reason: collision with root package name */
        public static final int f68312v = getArgbColorFromCeaColor(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f68313w;

        /* renamed from: x, reason: collision with root package name */
        public static final int f68314x;

        /* renamed from: y, reason: collision with root package name */
        public static final int[] f68315y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f68316z;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f68317a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f68318b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f68319c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f68320d;

        /* renamed from: e, reason: collision with root package name */
        public int f68321e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f68322f;

        /* renamed from: g, reason: collision with root package name */
        public int f68323g;

        /* renamed from: h, reason: collision with root package name */
        public int f68324h;

        /* renamed from: i, reason: collision with root package name */
        public int f68325i;

        /* renamed from: j, reason: collision with root package name */
        public int f68326j;

        /* renamed from: k, reason: collision with root package name */
        public int f68327k;

        /* renamed from: l, reason: collision with root package name */
        public int f68328l;

        /* renamed from: m, reason: collision with root package name */
        public int f68329m;

        /* renamed from: n, reason: collision with root package name */
        public int f68330n;

        /* renamed from: o, reason: collision with root package name */
        public int f68331o;

        /* renamed from: p, reason: collision with root package name */
        public int f68332p;

        /* renamed from: q, reason: collision with root package name */
        public int f68333q;

        /* renamed from: r, reason: collision with root package name */
        public int f68334r;

        /* renamed from: s, reason: collision with root package name */
        public int f68335s;

        /* renamed from: t, reason: collision with root package name */
        public int f68336t;

        /* renamed from: u, reason: collision with root package name */
        public int f68337u;

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            f68313w = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            f68314x = argbColorFromCeaColor2;
            f68315y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f68316z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public C0706b() {
            reset();
        }

        public static int getArgbColorFromCeaColor(int i10, int i11, int i12) {
            return getArgbColorFromCeaColor(i10, i11, i12, 0);
        }

        public void append(char c10) {
            SpannableStringBuilder spannableStringBuilder = this.f68318b;
            if (c10 != '\n') {
                spannableStringBuilder.append(c10);
                return;
            }
            SpannableString spannableStringBuildSpannableString = buildSpannableString();
            ArrayList arrayList = this.f68317a;
            arrayList.add(spannableStringBuildSpannableString);
            spannableStringBuilder.clear();
            if (this.f68331o != -1) {
                this.f68331o = 0;
            }
            if (this.f68332p != -1) {
                this.f68332p = 0;
            }
            if (this.f68333q != -1) {
                this.f68333q = 0;
            }
            if (this.f68335s != -1) {
                this.f68335s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f68326j && arrayList.size() < 15) {
                    this.f68337u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public void backspace() {
            SpannableStringBuilder spannableStringBuilder = this.f68318b;
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
                ArrayList arrayList = this.f68317a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i12));
                spannableStringBuilder.append('\n');
                i12++;
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i13 = this.f68327k;
            int i14 = 2;
            if (i13 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f68327k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f68322f) {
                f10 = this.f68324h / 99.0f;
                f11 = this.f68323g / 99.0f;
            } else {
                f10 = this.f68324h / 209.0f;
                f11 = this.f68323g / 74.0f;
            }
            float f13 = (f10 * 0.9f) + 0.05f;
            float f14 = (f11 * 0.9f) + 0.05f;
            int i15 = this.f68325i;
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
            int i18 = this.f68330n;
            return new a(spannableStringBuilder, alignment, f14, 0, i11, f12, i14, -3.4028235E38f, i18 != f68313w, i18, this.f68321e);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f68318b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f68331o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f68331o, length, 33);
                }
                if (this.f68332p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f68332p, length, 33);
                }
                if (this.f68333q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f68334r), this.f68333q, length, 33);
                }
                if (this.f68335s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f68336t), this.f68335s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.f68317a.clear();
            this.f68318b.clear();
            this.f68331o = -1;
            this.f68332p = -1;
            this.f68333q = -1;
            this.f68335s = -1;
            this.f68337u = 0;
        }

        public void defineWindow(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f68319c = true;
            this.f68320d = z10;
            this.f68321e = i10;
            this.f68322f = z11;
            this.f68323g = i11;
            this.f68324h = i12;
            this.f68325i = i14;
            int i17 = i13 + 1;
            if (this.f68326j != i17) {
                this.f68326j = i17;
                while (true) {
                    ArrayList arrayList = this.f68317a;
                    if (arrayList.size() < this.f68326j && arrayList.size() < 15) {
                        break;
                    } else {
                        arrayList.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f68328l != i15) {
                this.f68328l = i15;
                int i18 = i15 - 1;
                setWindowAttributes(C[i18], f68314x, B[i18], 0, f68316z[i18], A[i18], f68315y[i18]);
            }
            if (i16 == 0 || this.f68329m == i16) {
                return;
            }
            this.f68329m = i16;
            int i19 = i16 - 1;
            setPenAttributes(0, 1, 1, false, false, E[i19], D[i19]);
            setPenColor(f68312v, F[i19], f68313w);
        }

        public boolean isDefined() {
            return this.f68319c;
        }

        public boolean isEmpty() {
            if (isDefined()) {
                return this.f68317a.isEmpty() && this.f68318b.length() == 0;
            }
            return true;
        }

        public boolean isVisible() {
            return this.f68320d;
        }

        public void reset() {
            clear();
            this.f68319c = false;
            this.f68320d = false;
            this.f68321e = 4;
            this.f68322f = false;
            this.f68323g = 0;
            this.f68324h = 0;
            this.f68325i = 0;
            this.f68326j = 15;
            this.f68327k = 0;
            this.f68328l = 0;
            this.f68329m = 0;
            int i10 = f68313w;
            this.f68330n = i10;
            this.f68334r = f68312v;
            this.f68336t = i10;
        }

        public void setPenAttributes(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            int i15 = this.f68331o;
            SpannableStringBuilder spannableStringBuilder = this.f68318b;
            if (i15 != -1) {
                if (!z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f68331o, spannableStringBuilder.length(), 33);
                    this.f68331o = -1;
                }
            } else if (z10) {
                this.f68331o = spannableStringBuilder.length();
            }
            if (this.f68332p == -1) {
                if (z11) {
                    this.f68332p = spannableStringBuilder.length();
                }
            } else {
                if (z11) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f68332p, spannableStringBuilder.length(), 33);
                this.f68332p = -1;
            }
        }

        public void setPenColor(int i10, int i11, int i12) {
            int i13 = this.f68333q;
            SpannableStringBuilder spannableStringBuilder = this.f68318b;
            if (i13 != -1 && this.f68334r != i10) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f68334r), this.f68333q, spannableStringBuilder.length(), 33);
            }
            if (i10 != f68312v) {
                this.f68333q = spannableStringBuilder.length();
                this.f68334r = i10;
            }
            if (this.f68335s != -1 && this.f68336t != i11) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f68336t), this.f68335s, spannableStringBuilder.length(), 33);
            }
            if (i11 != f68313w) {
                this.f68335s = spannableStringBuilder.length();
                this.f68336t = i11;
            }
        }

        public void setPenLocation(int i10, int i11) {
            if (this.f68337u != i10) {
                append('\n');
            }
            this.f68337u = i10;
        }

        public void setVisibility(boolean z10) {
            this.f68320d = z10;
        }

        public void setWindowAttributes(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f68330n = i10;
            this.f68327k = i15;
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
                io.bidmachine.media3.common.util.a.checkIndex(r4, r0, r1)
                io.bidmachine.media3.common.util.a.checkIndex(r5, r0, r1)
                io.bidmachine.media3.common.util.a.checkIndex(r6, r0, r1)
                io.bidmachine.media3.common.util.a.checkIndex(r7, r0, r1)
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
            throw new UnsupportedOperationException("Method not decompiled: ip.b.C0706b.getArgbColorFromCeaColor(int, int, int, int):int");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f68338a;

        /* renamed from: b, reason: collision with root package name */
        public final int f68339b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f68340c;

        /* renamed from: d, reason: collision with root package name */
        public int f68341d = 0;

        public c(int i10, int i11) {
            this.f68338a = i10;
            this.f68339b = i11;
            this.f68340c = new byte[(i11 * 2) - 1];
        }
    }

    public b(int i10, List<byte[]> list) {
        this.f68302k = i10 == -1 ? 1 : i10;
        if (list != null) {
            h.parseCea708InitializationData(list);
        }
        this.f68303l = new C0706b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f68303l[i11] = new C0706b();
        }
        this.f68304m = this.f68303l[0];
    }

    @Override // ip.d
    public final e a() {
        List list = this.f68305n;
        this.f68306o = list;
        return new e((List) io.bidmachine.media3.common.util.a.checkNotNull(list));
    }

    @Override // ip.d
    public final void b(ip.c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) io.bidmachine.media3.common.util.a.checkNotNull(cVar.f77080f);
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        m0 m0Var = this.f68299h;
        m0Var.reset(bArrArray, iLimit);
        while (m0Var.bytesLeft() >= 3) {
            int unsignedByte = m0Var.readUnsignedByte();
            int i10 = unsignedByte & 3;
            boolean z10 = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) m0Var.readUnsignedByte();
            byte unsignedByte3 = (byte) m0Var.readUnsignedByte();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        d();
                        int i11 = (unsignedByte2 & 192) >> 6;
                        int i12 = this.f68301j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            f();
                            b0.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f68301j + " current=" + i11);
                        }
                        this.f68301j = i11;
                        int i13 = unsignedByte2 & Utf8.REPLACEMENT_BYTE;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar2 = new c(i11, i13);
                        this.f68307p = cVar2;
                        int i14 = cVar2.f68341d;
                        cVar2.f68341d = i14 + 1;
                        cVar2.f68340c[i14] = unsignedByte3;
                    } else {
                        io.bidmachine.media3.common.util.a.checkArgument(i10 == 2);
                        c cVar3 = this.f68307p;
                        if (cVar3 == null) {
                            b0.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = cVar3.f68340c;
                            int i15 = cVar3.f68341d;
                            int i16 = i15 + 1;
                            cVar3.f68341d = i16;
                            bArr[i15] = unsignedByte2;
                            cVar3.f68341d = i15 + 2;
                            bArr[i16] = unsignedByte3;
                        }
                    }
                    c cVar4 = this.f68307p;
                    if (cVar4.f68341d == (cVar4.f68339b * 2) - 1) {
                        d();
                    }
                }
            }
        }
    }

    @Override // ip.d
    public final boolean c() {
        return this.f68305n != this.f68306o;
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
        c cVar = this.f68307p;
        if (cVar == null) {
            return;
        }
        boolean z13 = true;
        if (cVar.f68341d != (cVar.f68339b * 2) - 1) {
            b0.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f68307p.f68339b * 2) - 1) + ", but current index is " + this.f68307p.f68341d + " (sequence number " + this.f68307p.f68338a + ");");
        }
        c cVar2 = this.f68307p;
        byte[] bArr = cVar2.f68340c;
        int i10 = cVar2.f68341d;
        l0 l0Var = this.f68300i;
        l0Var.reset(bArr, i10);
        boolean z14 = false;
        while (true) {
            if (l0Var.bitsLeft() > 0) {
                int bits = l0Var.readBits(3);
                int bits2 = l0Var.readBits(5);
                if (bits == 7) {
                    l0Var.skipBits(2);
                    bits = l0Var.readBits(6);
                    if (bits < 7) {
                        g.t(bits, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (bits2 == 0) {
                    if (bits != 0) {
                        b0.w("Cea708Decoder", "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                    }
                } else if (bits != this.f68302k) {
                    l0Var.skipBytes(bits2);
                } else {
                    int position = (bits2 * 8) + l0Var.getPosition();
                    while (l0Var.getPosition() < position) {
                        int bits3 = l0Var.readBits(8);
                        boolean z15 = z13;
                        if (bits3 != 16) {
                            if (bits3 <= 31) {
                                if (bits3 != 0) {
                                    if (bits3 == 3) {
                                        this.f68305n = e();
                                    } else if (bits3 != 8) {
                                        switch (bits3) {
                                            case 12:
                                                f();
                                                break;
                                            case 13:
                                                this.f68304m.append('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (bits3 < 17 || bits3 > 23) {
                                                    if (bits3 < 24 || bits3 > 31) {
                                                        g.t(bits3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        b0.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + bits3);
                                                        l0Var.skipBits(16);
                                                        break;
                                                    }
                                                } else {
                                                    b0.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + bits3);
                                                    l0Var.skipBits(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        this.f68304m.backspace();
                                    }
                                }
                            } else if (bits3 <= 127) {
                                if (bits3 == 127) {
                                    this.f68304m.append((char) 9835);
                                } else {
                                    this.f68304m.append((char) (bits3 & 255));
                                }
                                z14 = z15;
                            } else {
                                if (bits3 <= 159) {
                                    C0706b[] c0706bArr = this.f68303l;
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
                                            if (this.f68308q != i11) {
                                                this.f68308q = i11;
                                                this.f68304m = c0706bArr[i11];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            z10 = z15;
                                            z11 = false;
                                            for (?? r12 = z10; r12 <= 8; r12++) {
                                                if (l0Var.readBit()) {
                                                    c0706bArr[8 - r12].clear();
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            z11 = false;
                                            for (?? r13 = z15; r13 <= 8; r13++) {
                                                if (l0Var.readBit()) {
                                                    z12 = z15;
                                                    c0706bArr[8 - r13].setVisibility(z12);
                                                } else {
                                                    z12 = z15;
                                                }
                                                z15 = z12;
                                            }
                                            z10 = z15;
                                            break;
                                        case 138:
                                            for (?? r14 = z15; r14 <= 8; r14++) {
                                                if (l0Var.readBit()) {
                                                    c0706bArr[8 - r14].setVisibility(false);
                                                }
                                            }
                                            z11 = false;
                                            z10 = z15;
                                            break;
                                        case 139:
                                            for (?? r15 = z15; r15 <= 8; r15++) {
                                                if (l0Var.readBit()) {
                                                    c0706bArr[8 - r15].setVisibility(!r2.isVisible());
                                                }
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 140:
                                            for (?? r16 = z15; r16 <= 8; r16++) {
                                                if (l0Var.readBit()) {
                                                    c0706bArr[8 - r16].reset();
                                                }
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 141:
                                            l0Var.skipBits(8);
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
                                            if (this.f68304m.isDefined()) {
                                                this.f68304m.setPenAttributes(l0Var.readBits(4), l0Var.readBits(2), l0Var.readBits(2), l0Var.readBit(), l0Var.readBit(), l0Var.readBits(3), l0Var.readBits(3));
                                            } else {
                                                l0Var.skipBits(16);
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 145:
                                            if (this.f68304m.isDefined()) {
                                                int argbColorFromCeaColor = C0706b.getArgbColorFromCeaColor(l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2));
                                                int argbColorFromCeaColor2 = C0706b.getArgbColorFromCeaColor(l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2));
                                                l0Var.skipBits(2);
                                                this.f68304m.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, C0706b.getArgbColorFromCeaColor(l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2)));
                                            } else {
                                                l0Var.skipBits(24);
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 146:
                                            if (this.f68304m.isDefined()) {
                                                l0Var.skipBits(4);
                                                int bits4 = l0Var.readBits(4);
                                                l0Var.skipBits(2);
                                                this.f68304m.setPenLocation(bits4, l0Var.readBits(6));
                                            } else {
                                                l0Var.skipBits(16);
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            g.t(bits3, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                        case 151:
                                            if (this.f68304m.isDefined()) {
                                                int argbColorFromCeaColor3 = C0706b.getArgbColorFromCeaColor(l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2));
                                                int bits5 = l0Var.readBits(2);
                                                int argbColorFromCeaColor4 = C0706b.getArgbColorFromCeaColor(l0Var.readBits(2), l0Var.readBits(2), l0Var.readBits(2));
                                                if (l0Var.readBit()) {
                                                    bits5 |= 4;
                                                }
                                                boolean bit = l0Var.readBit();
                                                int bits6 = l0Var.readBits(2);
                                                int bits7 = l0Var.readBits(2);
                                                int bits8 = l0Var.readBits(2);
                                                l0Var.skipBits(8);
                                                this.f68304m.setWindowAttributes(argbColorFromCeaColor3, argbColorFromCeaColor4, bit, bits5, bits6, bits7, bits8);
                                            } else {
                                                l0Var.skipBits(32);
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
                                            C0706b c0706b = c0706bArr[i12];
                                            l0Var.skipBits(2);
                                            boolean bit2 = l0Var.readBit();
                                            l0Var.skipBits(2);
                                            int bits9 = l0Var.readBits(3);
                                            boolean bit3 = l0Var.readBit();
                                            int bits10 = l0Var.readBits(7);
                                            int bits11 = l0Var.readBits(8);
                                            int bits12 = l0Var.readBits(4);
                                            int bits13 = l0Var.readBits(4);
                                            l0Var.skipBits(2);
                                            l0Var.skipBits(6);
                                            l0Var.skipBits(2);
                                            c0706b.defineWindow(bit2, bits9, bit3, bits10, bits11, bits13, bits12, l0Var.readBits(3), l0Var.readBits(3));
                                            if (this.f68308q != i12) {
                                                this.f68308q = i12;
                                                this.f68304m = c0706bArr[i12];
                                            }
                                            z10 = z15;
                                            z11 = false;
                                            break;
                                    }
                                } else {
                                    z10 = z15;
                                    z11 = false;
                                    if (bits3 <= 255) {
                                        this.f68304m.append((char) (bits3 & 255));
                                    } else {
                                        g.t(bits3, "Invalid base command: ", "Cea708Decoder");
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
                            int bits14 = l0Var.readBits(8);
                            if (bits14 <= 31) {
                                if (bits14 > 7) {
                                    if (bits14 <= 15) {
                                        l0Var.skipBits(8);
                                    } else if (bits14 <= 23) {
                                        l0Var.skipBits(16);
                                    } else if (bits14 <= 31) {
                                        l0Var.skipBits(24);
                                    }
                                }
                            } else if (bits14 <= 127) {
                                if (bits14 == 32) {
                                    this.f68304m.append(' ');
                                } else if (bits14 == 33) {
                                    this.f68304m.append((char) 160);
                                } else if (bits14 == 37) {
                                    this.f68304m.append((char) 8230);
                                } else if (bits14 == 42) {
                                    this.f68304m.append((char) 352);
                                } else if (bits14 == 44) {
                                    this.f68304m.append((char) 338);
                                } else if (bits14 == 63) {
                                    this.f68304m.append((char) 376);
                                } else if (bits14 == 57) {
                                    this.f68304m.append((char) 8482);
                                } else if (bits14 == 58) {
                                    this.f68304m.append((char) 353);
                                } else if (bits14 == 60) {
                                    this.f68304m.append((char) 339);
                                } else if (bits14 != 61) {
                                    switch (bits14) {
                                        case 48:
                                            this.f68304m.append((char) 9608);
                                            break;
                                        case 49:
                                            this.f68304m.append((char) 8216);
                                            break;
                                        case 50:
                                            this.f68304m.append((char) 8217);
                                            break;
                                        case 51:
                                            this.f68304m.append((char) 8220);
                                            break;
                                        case 52:
                                            this.f68304m.append((char) 8221);
                                            break;
                                        case 53:
                                            this.f68304m.append((char) 8226);
                                            break;
                                        default:
                                            switch (bits14) {
                                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                    this.f68304m.append((char) 8539);
                                                    break;
                                                case JSON_ENCODE_ERROR_VALUE:
                                                    this.f68304m.append((char) 8540);
                                                    break;
                                                case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                                                    this.f68304m.append((char) 8541);
                                                    break;
                                                case TPAT_ERROR_VALUE:
                                                    this.f68304m.append((char) 8542);
                                                    break;
                                                case INVALID_ADS_ENDPOINT_VALUE:
                                                    this.f68304m.append((char) 9474);
                                                    break;
                                                case INVALID_RI_ENDPOINT_VALUE:
                                                    this.f68304m.append((char) 9488);
                                                    break;
                                                case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                    this.f68304m.append((char) 9492);
                                                    break;
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                    this.f68304m.append((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f68304m.append((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f68304m.append((char) 9484);
                                                    break;
                                                default:
                                                    g.t(bits14, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f68304m.append((char) 8480);
                                }
                                z14 = z15;
                            } else if (bits14 > 159) {
                                c10 = 6;
                                if (bits14 <= 255) {
                                    if (bits14 == 160) {
                                        this.f68304m.append((char) 13252);
                                    } else {
                                        g.t(bits14, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f68304m.append('_');
                                    }
                                    z14 = z15;
                                } else {
                                    g.t(bits14, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (bits14 <= 135) {
                                l0Var.skipBits(32);
                            } else if (bits14 <= 143) {
                                l0Var.skipBits(40);
                            } else if (bits14 <= 159) {
                                l0Var.skipBits(2);
                                c10 = 6;
                                l0Var.skipBits(l0Var.readBits(6) * 8);
                            }
                            c10 = 6;
                        }
                        z13 = z15;
                    }
                }
            }
        }
        if (z14) {
            this.f68305n = e();
        }
        this.f68307p = null;
    }

    @Override // ip.d, hp.j, nn.e
    public /* bridge */ /* synthetic */ n dequeueInputBuffer() throws k {
        return super.dequeueInputBuffer();
    }

    @Override // ip.d, hp.j, nn.e
    public /* bridge */ /* synthetic */ o dequeueOutputBuffer() throws k {
        return super.dequeueOutputBuffer();
    }

    public final List e() {
        a aVarBuild;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            C0706b[] c0706bArr = this.f68303l;
            if (!c0706bArr[i10].isEmpty() && c0706bArr[i10].isVisible() && (aVarBuild = c0706bArr[i10].build()) != null) {
                arrayList.add(aVarBuild);
            }
        }
        Collections.sort(arrayList, a.f68309c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f68310a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void f() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f68303l[i10].reset();
        }
    }

    @Override // ip.d, hp.j, nn.e
    public void flush() {
        super.flush();
        this.f68305n = null;
        this.f68306o = null;
        this.f68308q = 0;
        this.f68304m = this.f68303l[0];
        f();
        this.f68307p = null;
    }

    @Override // ip.d, hp.j
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // ip.d
    public /* bridge */ /* synthetic */ void queueInputBuffer(n nVar) throws k {
        super.queueInputBuffer(nVar);
    }

    @Override // ip.d, hp.j, nn.e
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // ip.d, hp.j
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }
}
