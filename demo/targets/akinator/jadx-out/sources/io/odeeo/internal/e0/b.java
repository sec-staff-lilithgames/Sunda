package io.odeeo.internal.e0;

import android.graphics.Color;
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
import io.odeeo.internal.d0.a;
import io.odeeo.internal.d0.f;
import io.odeeo.internal.d0.h;
import io.odeeo.internal.d0.k;
import io.odeeo.internal.d0.l;
import io.odeeo.internal.q0.e;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.w;
import io.odeeo.internal.q0.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends io.odeeo.internal.e0.c {

    /* renamed from: g, reason: collision with root package name */
    public final x f63774g = new x();

    /* renamed from: h, reason: collision with root package name */
    public final w f63775h = new w();

    /* renamed from: i, reason: collision with root package name */
    public int f63776i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f63777j;

    /* renamed from: k, reason: collision with root package name */
    public final int f63778k;

    /* renamed from: l, reason: collision with root package name */
    public final C0606b[] f63779l;

    /* renamed from: m, reason: collision with root package name */
    public C0606b f63780m;

    /* renamed from: n, reason: collision with root package name */
    public List<io.odeeo.internal.d0.a> f63781n;

    /* renamed from: o, reason: collision with root package name */
    public List<io.odeeo.internal.d0.a> f63782o;

    /* renamed from: p, reason: collision with root package name */
    public c f63783p;

    /* renamed from: q, reason: collision with root package name */
    public int f63784q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator<a> f63785c = new ni.a(2);

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.d0.a f63786a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63787b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            a.b size = new a.b().setText(charSequence).setTextAlignment(alignment).setLine(f10, i10).setLineAnchor(i11).setPosition(f11).setPositionAnchor(i12).setSize(f12);
            if (z10) {
                size.setWindowColor(i13);
            }
            this.f63786a = size.build();
            this.f63787b = i14;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.e0.b$b, reason: collision with other inner class name */
    public static final class C0606b {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;

        /* renamed from: w, reason: collision with root package name */
        public static final int f63788w = getArgbColorFromCeaColor(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f63789x;

        /* renamed from: y, reason: collision with root package name */
        public static final int f63790y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f63791z;

        /* renamed from: a, reason: collision with root package name */
        public final List<SpannableString> f63792a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f63793b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f63794c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f63795d;

        /* renamed from: e, reason: collision with root package name */
        public int f63796e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f63797f;

        /* renamed from: g, reason: collision with root package name */
        public int f63798g;

        /* renamed from: h, reason: collision with root package name */
        public int f63799h;

        /* renamed from: i, reason: collision with root package name */
        public int f63800i;

        /* renamed from: j, reason: collision with root package name */
        public int f63801j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f63802k;

        /* renamed from: l, reason: collision with root package name */
        public int f63803l;

        /* renamed from: m, reason: collision with root package name */
        public int f63804m;

        /* renamed from: n, reason: collision with root package name */
        public int f63805n;

        /* renamed from: o, reason: collision with root package name */
        public int f63806o;

        /* renamed from: p, reason: collision with root package name */
        public int f63807p;

        /* renamed from: q, reason: collision with root package name */
        public int f63808q;

        /* renamed from: r, reason: collision with root package name */
        public int f63809r;

        /* renamed from: s, reason: collision with root package name */
        public int f63810s;

        /* renamed from: t, reason: collision with root package name */
        public int f63811t;

        /* renamed from: u, reason: collision with root package name */
        public int f63812u;

        /* renamed from: v, reason: collision with root package name */
        public int f63813v;

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            f63789x = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            f63790y = argbColorFromCeaColor2;
            f63791z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public C0606b() {
            reset();
        }

        public static int getArgbColorFromCeaColor(int i10, int i11, int i12) {
            return getArgbColorFromCeaColor(i10, i11, i12, 0);
        }

        public void append(char c10) {
            if (c10 != '\n') {
                this.f63793b.append(c10);
                return;
            }
            this.f63792a.add(buildSpannableString());
            this.f63793b.clear();
            if (this.f63807p != -1) {
                this.f63807p = 0;
            }
            if (this.f63808q != -1) {
                this.f63808q = 0;
            }
            if (this.f63809r != -1) {
                this.f63809r = 0;
            }
            if (this.f63811t != -1) {
                this.f63811t = 0;
            }
            while (true) {
                if ((!this.f63802k || this.f63792a.size() < this.f63801j) && this.f63792a.size() < 15) {
                    return;
                } else {
                    this.f63792a.remove(0);
                }
            }
        }

        public void backspace() {
            int length = this.f63793b.length();
            if (length > 0) {
                this.f63793b.delete(length - 1, length);
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
            for (int i12 = 0; i12 < this.f63792a.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f63792a.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i13 = this.f63803l;
            int i14 = 2;
            if (i13 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f63803l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f63797f) {
                f10 = this.f63799h / 99.0f;
                f11 = this.f63798g / 99.0f;
            } else {
                f10 = this.f63799h / 209.0f;
                f11 = this.f63798g / 74.0f;
            }
            float f13 = (f10 * 0.9f) + 0.05f;
            float f14 = (f11 * 0.9f) + 0.05f;
            int i15 = this.f63800i;
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
            int i18 = this.f63806o;
            return new a(spannableStringBuilder, alignment, f14, 0, i11, f12, i14, -3.4028235E38f, i18 != f63789x, i18, this.f63796e);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f63793b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f63807p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f63807p, length, 33);
                }
                if (this.f63808q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f63808q, length, 33);
                }
                if (this.f63809r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f63810s), this.f63809r, length, 33);
                }
                if (this.f63811t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f63812u), this.f63811t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.f63792a.clear();
            this.f63793b.clear();
            this.f63807p = -1;
            this.f63808q = -1;
            this.f63809r = -1;
            this.f63811t = -1;
            this.f63813v = 0;
        }

        public void defineWindow(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f63794c = true;
            this.f63795d = z10;
            this.f63802k = z11;
            this.f63796e = i10;
            this.f63797f = z13;
            this.f63798g = i11;
            this.f63799h = i12;
            this.f63800i = i15;
            int i18 = i13 + 1;
            if (this.f63801j != i18) {
                this.f63801j = i18;
                while (true) {
                    if ((!z11 || this.f63792a.size() < this.f63801j) && this.f63792a.size() < 15) {
                        break;
                    } else {
                        this.f63792a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f63804m != i16) {
                this.f63804m = i16;
                int i19 = i16 - 1;
                setWindowAttributes(D[i19], f63790y, C[i19], 0, A[i19], B[i19], f63791z[i19]);
            }
            if (i17 == 0 || this.f63805n == i17) {
                return;
            }
            this.f63805n = i17;
            int i20 = i17 - 1;
            setPenAttributes(0, 1, 1, false, false, F[i20], E[i20]);
            setPenColor(f63788w, G[i20], f63789x);
        }

        public boolean isDefined() {
            return this.f63794c;
        }

        public boolean isEmpty() {
            if (isDefined()) {
                return this.f63792a.isEmpty() && this.f63793b.length() == 0;
            }
            return true;
        }

        public boolean isVisible() {
            return this.f63795d;
        }

        public void reset() {
            clear();
            this.f63794c = false;
            this.f63795d = false;
            this.f63796e = 4;
            this.f63797f = false;
            this.f63798g = 0;
            this.f63799h = 0;
            this.f63800i = 0;
            this.f63801j = 15;
            this.f63802k = true;
            this.f63803l = 0;
            this.f63804m = 0;
            this.f63805n = 0;
            int i10 = f63789x;
            this.f63806o = i10;
            this.f63810s = f63788w;
            this.f63812u = i10;
        }

        public void setPenAttributes(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f63807p != -1) {
                if (!z10) {
                    this.f63793b.setSpan(new StyleSpan(2), this.f63807p, this.f63793b.length(), 33);
                    this.f63807p = -1;
                }
            } else if (z10) {
                this.f63807p = this.f63793b.length();
            }
            if (this.f63808q == -1) {
                if (z11) {
                    this.f63808q = this.f63793b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f63793b.setSpan(new UnderlineSpan(), this.f63808q, this.f63793b.length(), 33);
                this.f63808q = -1;
            }
        }

        public void setPenColor(int i10, int i11, int i12) {
            if (this.f63809r != -1 && this.f63810s != i10) {
                this.f63793b.setSpan(new ForegroundColorSpan(this.f63810s), this.f63809r, this.f63793b.length(), 33);
            }
            if (i10 != f63788w) {
                this.f63809r = this.f63793b.length();
                this.f63810s = i10;
            }
            if (this.f63811t != -1 && this.f63812u != i11) {
                this.f63793b.setSpan(new BackgroundColorSpan(this.f63812u), this.f63811t, this.f63793b.length(), 33);
            }
            if (i11 != f63789x) {
                this.f63811t = this.f63793b.length();
                this.f63812u = i11;
            }
        }

        public void setPenLocation(int i10, int i11) {
            if (this.f63813v != i10) {
                append('\n');
            }
            this.f63813v = i10;
        }

        public void setVisibility(boolean z10) {
            this.f63795d = z10;
        }

        public void setWindowAttributes(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f63806o = i10;
            this.f63803l = i15;
        }

        public static int getArgbColorFromCeaColor(int i10, int i11, int i12, int i13) {
            io.odeeo.internal.q0.a.checkIndex(i10, 0, 4);
            io.odeeo.internal.q0.a.checkIndex(i11, 0, 4);
            io.odeeo.internal.q0.a.checkIndex(i12, 0, 4);
            io.odeeo.internal.q0.a.checkIndex(i13, 0, 4);
            return Color.argb(i13 != 2 ? i13 != 3 ? 255 : 0 : 127, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f63814a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63815b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f63816c;

        /* renamed from: d, reason: collision with root package name */
        public int f63817d = 0;

        public c(int i10, int i11) {
            this.f63814a = i10;
            this.f63815b = i11;
            this.f63816c = new byte[(i11 * 2) - 1];
        }
    }

    public b(int i10, List<byte[]> list) {
        this.f63778k = i10 == -1 ? 1 : i10;
        this.f63777j = list != null && e.parseCea708InitializationData(list);
        this.f63779l = new C0606b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f63779l[i11] = new C0606b();
        }
        this.f63780m = this.f63779l[0];
    }

    @Override // io.odeeo.internal.e0.c
    public f a() {
        List<io.odeeo.internal.d0.a> list = this.f63781n;
        this.f63782o = list;
        return new d((List) io.odeeo.internal.q0.a.checkNotNull(list));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case MRAID_JS_WRITE_FAILED_VALUE:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f63784q != i12) {
                    this.f63784q = i12;
                    this.f63780m = this.f63779l[i12];
                    break;
                }
                break;
            case PRIVACY_URL_ERROR_VALUE:
                while (i11 <= 8) {
                    if (this.f63775h.readBit()) {
                        this.f63779l[8 - i11].clear();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f63775h.readBit()) {
                        this.f63779l[8 - i13].setVisibility(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f63775h.readBit()) {
                        this.f63779l[8 - i11].setVisibility(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f63775h.readBit()) {
                        this.f63779l[8 - i14].setVisibility(!r0.isVisible());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f63775h.readBit()) {
                        this.f63779l[8 - i11].reset();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f63775h.skipBits(8);
                break;
            case 142:
                break;
            case 143:
                l();
                break;
            case 144:
                if (this.f63780m.isDefined()) {
                    g();
                    break;
                } else {
                    this.f63775h.skipBits(16);
                    break;
                }
            case 145:
                if (this.f63780m.isDefined()) {
                    h();
                    break;
                } else {
                    this.f63775h.skipBits(24);
                    break;
                }
            case 146:
                if (this.f63780m.isDefined()) {
                    i();
                    break;
                } else {
                    this.f63775h.skipBits(16);
                    break;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                g.z(i10, "Invalid C1 command: ", "Cea708Decoder");
                break;
            case 151:
                if (this.f63780m.isDefined()) {
                    j();
                    break;
                } else {
                    this.f63775h.skipBits(32);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                e(i15);
                if (this.f63784q != i15) {
                    this.f63784q = i15;
                    this.f63780m = this.f63779l[i15];
                    break;
                }
                break;
        }
    }

    public final void c(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f63775h.skipBits(8);
        } else if (i10 <= 23) {
            this.f63775h.skipBits(16);
        } else if (i10 <= 31) {
            this.f63775h.skipBits(24);
        }
    }

    @Override // io.odeeo.internal.e0.c
    public boolean d() {
        return this.f63781n != this.f63782o;
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public /* bridge */ /* synthetic */ k dequeueInputBuffer() throws h {
        return super.dequeueInputBuffer();
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public /* bridge */ /* synthetic */ l dequeueOutputBuffer() throws h {
        return super.dequeueOutputBuffer();
    }

    public final void e() {
        if (this.f63783p == null) {
            return;
        }
        k();
        this.f63783p = null;
    }

    public final void f(int i10) {
        if (i10 == 127) {
            this.f63780m.append((char) 9835);
        } else {
            this.f63780m.append((char) (i10 & 255));
        }
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void flush() {
        super.flush();
        this.f63781n = null;
        this.f63782o = null;
        this.f63784q = 0;
        this.f63780m = this.f63779l[0];
        l();
        this.f63783p = null;
    }

    public final void g(int i10) {
        this.f63780m.append((char) (i10 & 255));
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public String getName() {
        return "Cea708Decoder";
    }

    public final void h(int i10) {
        if (i10 == 32) {
            this.f63780m.append(' ');
            return;
        }
        if (i10 == 33) {
            this.f63780m.append((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f63780m.append((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f63780m.append((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f63780m.append((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f63780m.append((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f63780m.append((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f63780m.append((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f63780m.append((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f63780m.append((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f63780m.append((char) 9608);
                break;
            case 49:
                this.f63780m.append((char) 8216);
                break;
            case 50:
                this.f63780m.append((char) 8217);
                break;
            case 51:
                this.f63780m.append((char) 8220);
                break;
            case 52:
                this.f63780m.append((char) 8221);
                break;
            case 53:
                this.f63780m.append((char) 8226);
                break;
            default:
                switch (i10) {
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        this.f63780m.append((char) 8539);
                        break;
                    case JSON_ENCODE_ERROR_VALUE:
                        this.f63780m.append((char) 8540);
                        break;
                    case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                        this.f63780m.append((char) 8541);
                        break;
                    case TPAT_ERROR_VALUE:
                        this.f63780m.append((char) 8542);
                        break;
                    case INVALID_ADS_ENDPOINT_VALUE:
                        this.f63780m.append((char) 9474);
                        break;
                    case INVALID_RI_ENDPOINT_VALUE:
                        this.f63780m.append((char) 9488);
                        break;
                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        this.f63780m.append((char) 9492);
                        break;
                    case INVALID_METRICS_ENDPOINT_VALUE:
                        this.f63780m.append((char) 9472);
                        break;
                    case 126:
                        this.f63780m.append((char) 9496);
                        break;
                    case 127:
                        this.f63780m.append((char) 9484);
                        break;
                    default:
                        g.z(i10, "Invalid G2 character: ", "Cea708Decoder");
                        break;
                }
        }
    }

    public final void i(int i10) {
        if (i10 == 160) {
            this.f63780m.append((char) 13252);
        } else {
            g.z(i10, "Invalid G3 character: ", "Cea708Decoder");
            this.f63780m.append('_');
        }
    }

    public final void j() {
        int argbColorFromCeaColor = C0606b.getArgbColorFromCeaColor(this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2));
        int bits = this.f63775h.readBits(2);
        int argbColorFromCeaColor2 = C0606b.getArgbColorFromCeaColor(this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2));
        if (this.f63775h.readBit()) {
            bits |= 4;
        }
        boolean bit = this.f63775h.readBit();
        int bits2 = this.f63775h.readBits(2);
        int bits3 = this.f63775h.readBits(2);
        int bits4 = this.f63775h.readBits(2);
        this.f63775h.skipBits(8);
        this.f63780m.setWindowAttributes(argbColorFromCeaColor, argbColorFromCeaColor2, bit, bits, bits2, bits3, bits4);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    public final void k() {
        c cVar = this.f63783p;
        if (cVar.f63817d != (cVar.f63815b * 2) - 1) {
            p.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f63783p.f63815b * 2) - 1) + ", but current index is " + this.f63783p.f63817d + " (sequence number " + this.f63783p.f63814a + ");");
        }
        w wVar = this.f63775h;
        c cVar2 = this.f63783p;
        wVar.reset(cVar2.f63816c, cVar2.f63817d);
        int bits = this.f63775h.readBits(3);
        int bits2 = this.f63775h.readBits(5);
        if (bits == 7) {
            this.f63775h.skipBits(2);
            bits = this.f63775h.readBits(6);
            if (bits < 7) {
                g.z(bits, "Invalid extended service number: ", "Cea708Decoder");
            }
        }
        if (bits2 == 0) {
            if (bits != 0) {
                p.w("Cea708Decoder", "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (bits != this.f63778k) {
            return;
        }
        boolean z10 = false;
        while (this.f63775h.bitsLeft() > 0) {
            int bits3 = this.f63775h.readBits(8);
            if (bits3 == 16) {
                int bits4 = this.f63775h.readBits(8);
                if (bits4 <= 31) {
                    c(bits4);
                } else {
                    if (bits4 <= 127) {
                        h(bits4);
                    } else if (bits4 <= 159) {
                        d(bits4);
                    } else if (bits4 <= 255) {
                        i(bits4);
                    } else {
                        g.z(bits4, "Invalid extended command: ", "Cea708Decoder");
                    }
                    z10 = true;
                }
            } else if (bits3 <= 31) {
                a(bits3);
            } else {
                if (bits3 <= 127) {
                    f(bits3);
                } else if (bits3 <= 159) {
                    b(bits3);
                } else if (bits3 <= 255) {
                    g(bits3);
                } else {
                    g.z(bits3, "Invalid base command: ", "Cea708Decoder");
                }
                z10 = true;
            }
        }
        if (z10) {
            this.f63781n = f();
        }
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f63779l[i10].reset();
        }
    }

    @Override // io.odeeo.internal.e0.c
    public /* bridge */ /* synthetic */ void queueInputBuffer(k kVar) throws h {
        super.queueInputBuffer(kVar);
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // io.odeeo.internal.e0.c, io.odeeo.internal.d0.g
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    public final void d(int i10) {
        if (i10 <= 135) {
            this.f63775h.skipBits(32);
            return;
        }
        if (i10 <= 143) {
            this.f63775h.skipBits(40);
        } else if (i10 <= 159) {
            this.f63775h.skipBits(2);
            this.f63775h.skipBits(this.f63775h.readBits(6) * 8);
        }
    }

    public final void g() {
        this.f63780m.setPenAttributes(this.f63775h.readBits(4), this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBit(), this.f63775h.readBit(), this.f63775h.readBits(3), this.f63775h.readBits(3));
    }

    @Override // io.odeeo.internal.e0.c
    public void a(k kVar) {
        ByteBuffer byteBuffer = (ByteBuffer) io.odeeo.internal.q0.a.checkNotNull(kVar.f63705c);
        this.f63774g.reset(byteBuffer.array(), byteBuffer.limit());
        while (this.f63774g.bytesLeft() >= 3) {
            int unsignedByte = this.f63774g.readUnsignedByte();
            int i10 = unsignedByte & 3;
            boolean z10 = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.f63774g.readUnsignedByte();
            byte unsignedByte3 = (byte) this.f63774g.readUnsignedByte();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        e();
                        int i11 = (unsignedByte2 & 192) >> 6;
                        int i12 = this.f63776i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            p.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f63776i + " current=" + i11);
                        }
                        this.f63776i = i11;
                        int i13 = unsignedByte2 & Utf8.REPLACEMENT_BYTE;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f63783p = cVar;
                        byte[] bArr = cVar.f63816c;
                        int i14 = cVar.f63817d;
                        cVar.f63817d = i14 + 1;
                        bArr[i14] = unsignedByte3;
                    } else {
                        io.odeeo.internal.q0.a.checkArgument(i10 == 2);
                        c cVar2 = this.f63783p;
                        if (cVar2 == null) {
                            p.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f63816c;
                            int i15 = cVar2.f63817d;
                            bArr2[i15] = unsignedByte2;
                            cVar2.f63817d = i15 + 2;
                            bArr2[i15 + 1] = unsignedByte3;
                        }
                    }
                    c cVar3 = this.f63783p;
                    if (cVar3.f63817d == (cVar3.f63815b * 2) - 1) {
                        e();
                    }
                }
            }
        }
    }

    public final List<io.odeeo.internal.d0.a> f() {
        a aVarBuild;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f63779l[i10].isEmpty() && this.f63779l[i10].isVisible() && (aVarBuild = this.f63779l[i10].build()) != null) {
                arrayList.add(aVarBuild);
            }
        }
        Collections.sort(arrayList, a.f63785c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f63786a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void e(int i10) {
        C0606b c0606b = this.f63779l[i10];
        this.f63775h.skipBits(2);
        boolean bit = this.f63775h.readBit();
        boolean bit2 = this.f63775h.readBit();
        boolean bit3 = this.f63775h.readBit();
        int bits = this.f63775h.readBits(3);
        boolean bit4 = this.f63775h.readBit();
        int bits2 = this.f63775h.readBits(7);
        int bits3 = this.f63775h.readBits(8);
        int bits4 = this.f63775h.readBits(4);
        int bits5 = this.f63775h.readBits(4);
        this.f63775h.skipBits(2);
        int bits6 = this.f63775h.readBits(6);
        this.f63775h.skipBits(2);
        c0606b.defineWindow(bit, bit2, bit3, bits, bit4, bits2, bits3, bits5, bits6, bits4, this.f63775h.readBits(3), this.f63775h.readBits(3));
    }

    public final void i() {
        this.f63775h.skipBits(4);
        int bits = this.f63775h.readBits(4);
        this.f63775h.skipBits(2);
        this.f63780m.setPenLocation(bits, this.f63775h.readBits(6));
    }

    public final void a(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f63781n = f();
                return;
            }
            if (i10 != 8) {
                switch (i10) {
                    case 12:
                        l();
                        break;
                    case 13:
                        this.f63780m.append('\n');
                        break;
                    case 14:
                        break;
                    default:
                        if (i10 >= 17 && i10 <= 23) {
                            g.z(i10, "Currently unsupported COMMAND_EXT1 Command: ", "Cea708Decoder");
                            this.f63775h.skipBits(8);
                            break;
                        } else if (i10 >= 24 && i10 <= 31) {
                            g.z(i10, "Currently unsupported COMMAND_P16 Command: ", "Cea708Decoder");
                            this.f63775h.skipBits(16);
                            break;
                        } else {
                            g.z(i10, "Invalid C0 command: ", "Cea708Decoder");
                            break;
                        }
                        break;
                }
                return;
            }
            this.f63780m.backspace();
        }
    }

    public final void h() {
        int argbColorFromCeaColor = C0606b.getArgbColorFromCeaColor(this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2));
        int argbColorFromCeaColor2 = C0606b.getArgbColorFromCeaColor(this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2));
        this.f63775h.skipBits(2);
        this.f63780m.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, C0606b.getArgbColorFromCeaColor(this.f63775h.readBits(2), this.f63775h.readBits(2), this.f63775h.readBits(2)));
    }
}
