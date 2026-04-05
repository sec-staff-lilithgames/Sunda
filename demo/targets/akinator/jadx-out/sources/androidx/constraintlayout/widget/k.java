package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.AdError;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.vungle.ads.internal.protos.Sdk;
import g3.i0;
import g3.l0;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f5425i = {0, 4, 8};

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f5426j;

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f5427k;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5428a;

    /* renamed from: b, reason: collision with root package name */
    public String f5429b;

    /* renamed from: c, reason: collision with root package name */
    public String f5430c = "";

    /* renamed from: d, reason: collision with root package name */
    public String[] f5431d = new String[0];

    /* renamed from: e, reason: collision with root package name */
    public int f5432e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5433f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f5434g = true;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5435h = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5436a;

        /* renamed from: b, reason: collision with root package name */
        public String f5437b;

        /* renamed from: c, reason: collision with root package name */
        public final d f5438c = new d();

        /* renamed from: d, reason: collision with root package name */
        public final c f5439d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f5440e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f5441f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap f5442g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        public j f5443h;

        public final void a(int i10, ConstraintLayout.a aVar) {
            this.f5436a = i10;
            int i11 = aVar.f5327e;
            b bVar = this.f5440e;
            bVar.f5461i = i11;
            bVar.f5463j = aVar.f5329f;
            bVar.f5465k = aVar.f5331g;
            bVar.f5467l = aVar.f5333h;
            bVar.f5469m = aVar.f5335i;
            bVar.f5471n = aVar.f5337j;
            bVar.f5473o = aVar.f5339k;
            bVar.f5475p = aVar.f5341l;
            bVar.f5477q = aVar.f5343m;
            bVar.f5478r = aVar.f5345n;
            bVar.f5479s = aVar.f5347o;
            bVar.f5480t = aVar.f5354s;
            bVar.f5481u = aVar.f5355t;
            bVar.f5482v = aVar.f5356u;
            bVar.f5483w = aVar.f5357v;
            bVar.f5484x = aVar.E;
            bVar.f5485y = aVar.F;
            bVar.f5486z = aVar.G;
            bVar.A = aVar.f5349p;
            bVar.B = aVar.f5351q;
            bVar.C = aVar.f5353r;
            bVar.D = aVar.T;
            bVar.E = aVar.U;
            bVar.F = aVar.V;
            bVar.f5457g = aVar.f5323c;
            bVar.f5453e = aVar.f5319a;
            bVar.f5455f = aVar.f5321b;
            bVar.f5449c = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.f5451d = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.M = aVar.D;
            bVar.U = aVar.I;
            bVar.V = aVar.H;
            bVar.X = aVar.K;
            bVar.W = aVar.J;
            bVar.f5470m0 = aVar.W;
            bVar.f5472n0 = aVar.X;
            bVar.Y = aVar.L;
            bVar.Z = aVar.M;
            bVar.f5446a0 = aVar.P;
            bVar.f5448b0 = aVar.Q;
            bVar.f5450c0 = aVar.N;
            bVar.f5452d0 = aVar.O;
            bVar.f5454e0 = aVar.R;
            bVar.f5456f0 = aVar.S;
            bVar.f5468l0 = aVar.Y;
            bVar.O = aVar.f5359x;
            bVar.Q = aVar.f5361z;
            bVar.N = aVar.f5358w;
            bVar.P = aVar.f5360y;
            bVar.S = aVar.A;
            bVar.R = aVar.B;
            bVar.T = aVar.C;
            bVar.f5476p0 = aVar.Z;
            bVar.K = aVar.getMarginEnd();
            bVar.L = aVar.getMarginStart();
        }

        public void applyDelta(a aVar) {
            j jVar = this.f5443h;
            if (jVar != null) {
                jVar.e(aVar);
            }
        }

        public void applyTo(ConstraintLayout.a aVar) {
            b bVar = this.f5440e;
            aVar.f5327e = bVar.f5461i;
            aVar.f5329f = bVar.f5463j;
            aVar.f5331g = bVar.f5465k;
            aVar.f5333h = bVar.f5467l;
            aVar.f5335i = bVar.f5469m;
            aVar.f5337j = bVar.f5471n;
            aVar.f5339k = bVar.f5473o;
            aVar.f5341l = bVar.f5475p;
            aVar.f5343m = bVar.f5477q;
            aVar.f5345n = bVar.f5478r;
            aVar.f5347o = bVar.f5479s;
            aVar.f5354s = bVar.f5480t;
            aVar.f5355t = bVar.f5481u;
            aVar.f5356u = bVar.f5482v;
            aVar.f5357v = bVar.f5483w;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.J;
            aVar.A = bVar.S;
            aVar.B = bVar.R;
            aVar.f5359x = bVar.O;
            aVar.f5361z = bVar.Q;
            aVar.E = bVar.f5484x;
            aVar.F = bVar.f5485y;
            aVar.f5349p = bVar.A;
            aVar.f5351q = bVar.B;
            aVar.f5353r = bVar.C;
            aVar.G = bVar.f5486z;
            aVar.T = bVar.D;
            aVar.U = bVar.E;
            aVar.I = bVar.U;
            aVar.H = bVar.V;
            aVar.K = bVar.X;
            aVar.J = bVar.W;
            aVar.W = bVar.f5470m0;
            aVar.X = bVar.f5472n0;
            aVar.L = bVar.Y;
            aVar.M = bVar.Z;
            aVar.P = bVar.f5446a0;
            aVar.Q = bVar.f5448b0;
            aVar.N = bVar.f5450c0;
            aVar.O = bVar.f5452d0;
            aVar.R = bVar.f5454e0;
            aVar.S = bVar.f5456f0;
            aVar.V = bVar.F;
            aVar.f5323c = bVar.f5457g;
            aVar.f5319a = bVar.f5453e;
            aVar.f5321b = bVar.f5455f;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.f5449c;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.f5451d;
            String str = bVar.f5468l0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f5476p0;
            aVar.setMarginStart(bVar.L);
            aVar.setMarginEnd(bVar.K);
            aVar.validate();
        }

        public final void b(int i10, n.a aVar) {
            a(i10, aVar);
            this.f5438c.f5504d = aVar.f5530r0;
            float f10 = aVar.f5533u0;
            e eVar = this.f5441f;
            eVar.f5508b = f10;
            eVar.f5509c = aVar.f5534v0;
            eVar.f5510d = aVar.f5535w0;
            eVar.f5511e = aVar.f5536x0;
            eVar.f5512f = aVar.f5537y0;
            eVar.f5513g = aVar.f5538z0;
            eVar.f5514h = aVar.A0;
            eVar.f5516j = aVar.B0;
            eVar.f5517k = aVar.C0;
            eVar.f5518l = aVar.D0;
            eVar.f5520n = aVar.f5532t0;
            eVar.f5519m = aVar.f5531s0;
        }

        public final androidx.constraintlayout.widget.b c(String str, androidx.constraintlayout.widget.a aVar) {
            if (!this.f5442g.containsKey(str)) {
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b(str, aVar);
                this.f5442g.put(str, bVar);
                return bVar;
            }
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) this.f5442g.get(str);
            if (bVar2.getType() == aVar) {
                return bVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + bVar2.getType().name());
        }

        public void printDelta(String str) {
            j jVar = this.f5443h;
            if (jVar == null) {
                Log.v(str, "DELTA IS NULL");
                return;
            }
            jVar.getClass();
            Log.v(str, "int");
            for (int i10 = 0; i10 < jVar.f5415c; i10++) {
                Log.v(str, jVar.f5413a[i10] + " = " + jVar.f5414b[i10]);
            }
            Log.v(str, "float");
            for (int i11 = 0; i11 < jVar.f5418f; i11++) {
                Log.v(str, jVar.f5416d[i11] + " = " + jVar.f5417e[i11]);
            }
            Log.v(str, "strings");
            for (int i12 = 0; i12 < jVar.f5421i; i12++) {
                Log.v(str, jVar.f5419g[i12] + " = " + jVar.f5420h[i12]);
            }
            Log.v(str, "boolean");
            for (int i13 = 0; i13 < jVar.f5424l; i13++) {
                Log.v(str, jVar.f5422j[i13] + " = " + jVar.f5423k[i13]);
            }
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public a m68clone() {
            a aVar = new a();
            aVar.f5440e.copyFrom(this.f5440e);
            aVar.f5439d.copyFrom(this.f5439d);
            aVar.f5438c.copyFrom(this.f5438c);
            aVar.f5441f.copyFrom(this.f5441f);
            aVar.f5436a = this.f5436a;
            aVar.f5443h = this.f5443h;
            return aVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: q0, reason: collision with root package name */
        public static final SparseIntArray f5444q0;

        /* renamed from: c, reason: collision with root package name */
        public int f5449c;

        /* renamed from: d, reason: collision with root package name */
        public int f5451d;

        /* renamed from: j0, reason: collision with root package name */
        public int[] f5464j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f5466k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f5468l0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f5445a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5447b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f5453e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f5455f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f5457g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f5459h = true;

        /* renamed from: i, reason: collision with root package name */
        public int f5461i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f5463j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f5465k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f5467l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f5469m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f5471n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f5473o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f5475p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f5477q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f5478r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f5479s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f5480t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f5481u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f5482v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f5483w = -1;

        /* renamed from: x, reason: collision with root package name */
        public float f5484x = 0.5f;

        /* renamed from: y, reason: collision with root package name */
        public float f5485y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public String f5486z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f5446a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f5448b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f5450c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f5452d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public float f5454e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public float f5456f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public int f5458g0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public int f5460h0 = 0;

        /* renamed from: i0, reason: collision with root package name */
        public int f5462i0 = -1;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f5470m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f5472n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f5474o0 = true;

        /* renamed from: p0, reason: collision with root package name */
        public int f5476p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5444q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5553l);
            this.f5447b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                SparseIntArray sparseIntArray = f5444q0;
                int i11 = sparseIntArray.get(index);
                switch (i11) {
                    case 1:
                        this.f5477q = k.g(typedArrayObtainStyledAttributes, index, this.f5477q);
                        break;
                    case 2:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.f5475p = k.g(typedArrayObtainStyledAttributes, index, this.f5475p);
                        break;
                    case 4:
                        this.f5473o = k.g(typedArrayObtainStyledAttributes, index, this.f5473o);
                        break;
                    case 5:
                        this.f5486z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.f5483w = k.g(typedArrayObtainStyledAttributes, index, this.f5483w);
                        break;
                    case 10:
                        this.f5482v = k.g(typedArrayObtainStyledAttributes, index, this.f5482v);
                        break;
                    case 11:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f5453e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5453e);
                        break;
                    case 18:
                        this.f5455f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5455f);
                        break;
                    case 19:
                        this.f5457g = typedArrayObtainStyledAttributes.getFloat(index, this.f5457g);
                        break;
                    case 20:
                        this.f5484x = typedArrayObtainStyledAttributes.getFloat(index, this.f5484x);
                        break;
                    case 21:
                        this.f5451d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5451d);
                        break;
                    case 22:
                        this.f5449c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5449c);
                        break;
                    case 23:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.f5461i = k.g(typedArrayObtainStyledAttributes, index, this.f5461i);
                        break;
                    case 25:
                        this.f5463j = k.g(typedArrayObtainStyledAttributes, index, this.f5463j);
                        break;
                    case 26:
                        this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.f5465k = k.g(typedArrayObtainStyledAttributes, index, this.f5465k);
                        break;
                    case 29:
                        this.f5467l = k.g(typedArrayObtainStyledAttributes, index, this.f5467l);
                        break;
                    case 30:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.f5480t = k.g(typedArrayObtainStyledAttributes, index, this.f5480t);
                        break;
                    case 32:
                        this.f5481u = k.g(typedArrayObtainStyledAttributes, index, this.f5481u);
                        break;
                    case 33:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.f5471n = k.g(typedArrayObtainStyledAttributes, index, this.f5471n);
                        break;
                    case 35:
                        this.f5469m = k.g(typedArrayObtainStyledAttributes, index, this.f5469m);
                        break;
                    case 36:
                        this.f5485y = typedArrayObtainStyledAttributes.getFloat(index, this.f5485y);
                        break;
                    case 37:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        k.h(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        k.h(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.A = k.g(typedArrayObtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                                        this.f5454e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
                                        this.f5456f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER /* 71 */:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                        this.f5458g0 = typedArrayObtainStyledAttributes.getInt(index, this.f5458g0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                                        this.f5460h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5460h0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                        this.f5466k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                                        this.f5474o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5474o0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                                        this.f5476p0 = typedArrayObtainStyledAttributes.getInt(index, this.f5476p0);
                                        break;
                                    case 77:
                                        this.f5478r = k.g(typedArrayObtainStyledAttributes, index, this.f5478r);
                                        break;
                                    case 78:
                                        this.f5479s = k.g(typedArrayObtainStyledAttributes, index, this.f5479s);
                                        break;
                                    case 79:
                                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.f5448b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5448b0);
                                        break;
                                    case 84:
                                        this.f5446a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5446a0);
                                        break;
                                    case 85:
                                        this.f5452d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5452d0);
                                        break;
                                    case 86:
                                        this.f5450c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5450c0);
                                        break;
                                    case 87:
                                        this.f5470m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5470m0);
                                        break;
                                    case 88:
                                        this.f5472n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5472n0);
                                        break;
                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                        this.f5468l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f5459h = typedArrayObtainStyledAttributes.getBoolean(index, this.f5459h);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(b bVar) {
            this.f5445a = bVar.f5445a;
            this.f5449c = bVar.f5449c;
            this.f5447b = bVar.f5447b;
            this.f5451d = bVar.f5451d;
            this.f5453e = bVar.f5453e;
            this.f5455f = bVar.f5455f;
            this.f5457g = bVar.f5457g;
            this.f5459h = bVar.f5459h;
            this.f5461i = bVar.f5461i;
            this.f5463j = bVar.f5463j;
            this.f5465k = bVar.f5465k;
            this.f5467l = bVar.f5467l;
            this.f5469m = bVar.f5469m;
            this.f5471n = bVar.f5471n;
            this.f5473o = bVar.f5473o;
            this.f5475p = bVar.f5475p;
            this.f5477q = bVar.f5477q;
            this.f5478r = bVar.f5478r;
            this.f5479s = bVar.f5479s;
            this.f5480t = bVar.f5480t;
            this.f5481u = bVar.f5481u;
            this.f5482v = bVar.f5482v;
            this.f5483w = bVar.f5483w;
            this.f5484x = bVar.f5484x;
            this.f5485y = bVar.f5485y;
            this.f5486z = bVar.f5486z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f5446a0 = bVar.f5446a0;
            this.f5448b0 = bVar.f5448b0;
            this.f5450c0 = bVar.f5450c0;
            this.f5452d0 = bVar.f5452d0;
            this.f5454e0 = bVar.f5454e0;
            this.f5456f0 = bVar.f5456f0;
            this.f5458g0 = bVar.f5458g0;
            this.f5460h0 = bVar.f5460h0;
            this.f5462i0 = bVar.f5462i0;
            this.f5468l0 = bVar.f5468l0;
            int[] iArr = bVar.f5464j0;
            if (iArr == null || bVar.f5466k0 != null) {
                this.f5464j0 = null;
            } else {
                this.f5464j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f5466k0 = bVar.f5466k0;
            this.f5470m0 = bVar.f5470m0;
            this.f5472n0 = bVar.f5472n0;
            this.f5474o0 = bVar.f5474o0;
            this.f5476p0 = bVar.f5476p0;
        }

        public void dump(l0 l0Var, StringBuilder sb2) throws IllegalAccessException, IllegalArgumentException {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb2.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objLookUpConstraintName = l0Var.lookUpConstraintName(num.intValue());
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(objLookUpConstraintName == null ? num : objLookUpConstraintName);
                                sb2.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f10 = (Float) obj;
                            if (f10.floatValue() != -1.0f) {
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(f10);
                                sb2.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        Log.e("ConstraintSet", "Error accessing ConstraintSet field", e10);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f5487n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f5488a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f5489b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f5490c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f5491d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f5492e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f5493f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f5494g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f5495h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f5496i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public int f5497j = -1;

        /* renamed from: k, reason: collision with root package name */
        public String f5498k = null;

        /* renamed from: l, reason: collision with root package name */
        public int f5499l = -3;

        /* renamed from: m, reason: collision with root package name */
        public int f5500m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5487n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5554m);
            this.f5488a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f5487n.get(index)) {
                    case 1:
                        this.f5495h = typedArrayObtainStyledAttributes.getFloat(index, this.f5495h);
                        break;
                    case 2:
                        this.f5492e = typedArrayObtainStyledAttributes.getInt(index, this.f5492e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f5491d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f5491d = a3.g.f3977c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f5493f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f5489b = k.g(typedArrayObtainStyledAttributes, index, this.f5489b);
                        break;
                    case 6:
                        this.f5490c = typedArrayObtainStyledAttributes.getInteger(index, this.f5490c);
                        break;
                    case 7:
                        this.f5494g = typedArrayObtainStyledAttributes.getFloat(index, this.f5494g);
                        break;
                    case 8:
                        this.f5497j = typedArrayObtainStyledAttributes.getInteger(index, this.f5497j);
                        break;
                    case 9:
                        this.f5496i = typedArrayObtainStyledAttributes.getFloat(index, this.f5496i);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f5500m = resourceId;
                            if (resourceId != -1) {
                                this.f5499l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f5498k = string;
                            if (string.indexOf("/") > 0) {
                                this.f5500m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f5499l = -2;
                                break;
                            } else {
                                this.f5499l = -1;
                                break;
                            }
                        } else {
                            this.f5499l = typedArrayObtainStyledAttributes.getInteger(index, this.f5500m);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(c cVar) {
            this.f5488a = cVar.f5488a;
            this.f5489b = cVar.f5489b;
            this.f5491d = cVar.f5491d;
            this.f5492e = cVar.f5492e;
            this.f5493f = cVar.f5493f;
            this.f5495h = cVar.f5495h;
            this.f5494g = cVar.f5494g;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5501a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f5502b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f5503c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f5504d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f5505e = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5560s);
            this.f5501a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f5504d = typedArrayObtainStyledAttributes.getFloat(index, this.f5504d);
                } else if (index == 0) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f5502b);
                    this.f5502b = i11;
                    this.f5502b = k.f5425i[i11];
                } else if (index == 4) {
                    this.f5503c = typedArrayObtainStyledAttributes.getInt(index, this.f5503c);
                } else if (index == 3) {
                    this.f5505e = typedArrayObtainStyledAttributes.getFloat(index, this.f5505e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(d dVar) {
            this.f5501a = dVar.f5501a;
            this.f5502b = dVar.f5502b;
            this.f5504d = dVar.f5504d;
            this.f5505e = dVar.f5505e;
            this.f5503c = dVar.f5503c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o, reason: collision with root package name */
        public static final SparseIntArray f5506o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f5507a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f5508b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f5509c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f5510d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f5511e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f5512f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f5513g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f5514h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f5515i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f5516j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f5517k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f5518l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f5519m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f5520n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5506o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5563v);
            this.f5507a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f5506o.get(index)) {
                    case 1:
                        this.f5508b = typedArrayObtainStyledAttributes.getFloat(index, this.f5508b);
                        break;
                    case 2:
                        this.f5509c = typedArrayObtainStyledAttributes.getFloat(index, this.f5509c);
                        break;
                    case 3:
                        this.f5510d = typedArrayObtainStyledAttributes.getFloat(index, this.f5510d);
                        break;
                    case 4:
                        this.f5511e = typedArrayObtainStyledAttributes.getFloat(index, this.f5511e);
                        break;
                    case 5:
                        this.f5512f = typedArrayObtainStyledAttributes.getFloat(index, this.f5512f);
                        break;
                    case 6:
                        this.f5513g = typedArrayObtainStyledAttributes.getDimension(index, this.f5513g);
                        break;
                    case 7:
                        this.f5514h = typedArrayObtainStyledAttributes.getDimension(index, this.f5514h);
                        break;
                    case 8:
                        this.f5516j = typedArrayObtainStyledAttributes.getDimension(index, this.f5516j);
                        break;
                    case 9:
                        this.f5517k = typedArrayObtainStyledAttributes.getDimension(index, this.f5517k);
                        break;
                    case 10:
                        this.f5518l = typedArrayObtainStyledAttributes.getDimension(index, this.f5518l);
                        break;
                    case 11:
                        this.f5519m = true;
                        this.f5520n = typedArrayObtainStyledAttributes.getDimension(index, this.f5520n);
                        break;
                    case 12:
                        this.f5515i = k.g(typedArrayObtainStyledAttributes, index, this.f5515i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(e eVar) {
            this.f5507a = eVar.f5507a;
            this.f5508b = eVar.f5508b;
            this.f5509c = eVar.f5509c;
            this.f5510d = eVar.f5510d;
            this.f5511e = eVar.f5511e;
            this.f5512f = eVar.f5512f;
            this.f5513g = eVar.f5513g;
            this.f5514h = eVar.f5514h;
            this.f5515i = eVar.f5515i;
            this.f5516j = eVar.f5516j;
            this.f5517k = eVar.f5517k;
            this.f5518l = eVar.f5518l;
            this.f5519m = eVar.f5519m;
            this.f5520n = eVar.f5520n;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5426j = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5427k = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 83);
        sparseIntArray.append(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 84);
        sparseIntArray.append(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 85);
        sparseIntArray.append(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static a buildDelta(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, r.f5545d);
        j(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] c(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static a e(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? r.f5545d : r.f5542a);
        if (z10) {
            j(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i10 = 0;
            while (true) {
                b bVar = aVar.f5440e;
                if (i10 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    d dVar = aVar.f5438c;
                    e eVar = aVar.f5441f;
                    c cVar = aVar.f5439d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f5488a = true;
                        bVar.f5447b = true;
                        dVar.f5501a = true;
                        eVar.f5507a = true;
                    }
                    SparseIntArray sparseIntArray = f5426j;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.f5477q = g(typedArrayObtainStyledAttributes, index, bVar.f5477q);
                            break;
                        case 2:
                            bVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.J);
                            break;
                        case 3:
                            bVar.f5475p = g(typedArrayObtainStyledAttributes, index, bVar.f5475p);
                            break;
                        case 4:
                            bVar.f5473o = g(typedArrayObtainStyledAttributes, index, bVar.f5473o);
                            break;
                        case 5:
                            bVar.f5486z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.D);
                            break;
                        case 7:
                            bVar.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.E);
                            break;
                        case 8:
                            bVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.K);
                            break;
                        case 9:
                            bVar.f5483w = g(typedArrayObtainStyledAttributes, index, bVar.f5483w);
                            break;
                        case 10:
                            bVar.f5482v = g(typedArrayObtainStyledAttributes, index, bVar.f5482v);
                            break;
                        case 11:
                            bVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Q);
                            break;
                        case 12:
                            bVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.R);
                            break;
                        case 13:
                            bVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.N);
                            break;
                        case 14:
                            bVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.P);
                            break;
                        case 15:
                            bVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.S);
                            break;
                        case 16:
                            bVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.O);
                            break;
                        case 17:
                            bVar.f5453e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f5453e);
                            break;
                        case 18:
                            bVar.f5455f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f5455f);
                            break;
                        case 19:
                            bVar.f5457g = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5457g);
                            break;
                        case 20:
                            bVar.f5484x = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5484x);
                            break;
                        case 21:
                            bVar.f5451d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f5451d);
                            break;
                        case 22:
                            int i11 = typedArrayObtainStyledAttributes.getInt(index, dVar.f5502b);
                            dVar.f5502b = i11;
                            dVar.f5502b = f5425i[i11];
                            break;
                        case 23:
                            bVar.f5449c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f5449c);
                            break;
                        case 24:
                            bVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.G);
                            break;
                        case 25:
                            bVar.f5461i = g(typedArrayObtainStyledAttributes, index, bVar.f5461i);
                            break;
                        case 26:
                            bVar.f5463j = g(typedArrayObtainStyledAttributes, index, bVar.f5463j);
                            break;
                        case 27:
                            bVar.F = typedArrayObtainStyledAttributes.getInt(index, bVar.F);
                            break;
                        case 28:
                            bVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.H);
                            break;
                        case 29:
                            bVar.f5465k = g(typedArrayObtainStyledAttributes, index, bVar.f5465k);
                            break;
                        case 30:
                            bVar.f5467l = g(typedArrayObtainStyledAttributes, index, bVar.f5467l);
                            break;
                        case 31:
                            bVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.L);
                            break;
                        case 32:
                            bVar.f5480t = g(typedArrayObtainStyledAttributes, index, bVar.f5480t);
                            break;
                        case 33:
                            bVar.f5481u = g(typedArrayObtainStyledAttributes, index, bVar.f5481u);
                            break;
                        case 34:
                            bVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.I);
                            break;
                        case 35:
                            bVar.f5471n = g(typedArrayObtainStyledAttributes, index, bVar.f5471n);
                            break;
                        case 36:
                            bVar.f5469m = g(typedArrayObtainStyledAttributes, index, bVar.f5469m);
                            break;
                        case 37:
                            bVar.f5485y = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5485y);
                            break;
                        case 38:
                            aVar.f5436a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f5436a);
                            break;
                        case 39:
                            bVar.V = typedArrayObtainStyledAttributes.getFloat(index, bVar.V);
                            break;
                        case 40:
                            bVar.U = typedArrayObtainStyledAttributes.getFloat(index, bVar.U);
                            break;
                        case 41:
                            bVar.W = typedArrayObtainStyledAttributes.getInt(index, bVar.W);
                            break;
                        case 42:
                            bVar.X = typedArrayObtainStyledAttributes.getInt(index, bVar.X);
                            break;
                        case 43:
                            dVar.f5504d = typedArrayObtainStyledAttributes.getFloat(index, dVar.f5504d);
                            break;
                        case 44:
                            eVar.f5519m = true;
                            eVar.f5520n = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5520n);
                            break;
                        case 45:
                            eVar.f5509c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5509c);
                            break;
                        case 46:
                            eVar.f5510d = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5510d);
                            break;
                        case 47:
                            eVar.f5511e = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5511e);
                            break;
                        case 48:
                            eVar.f5512f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5512f);
                            break;
                        case 49:
                            eVar.f5513g = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5513g);
                            break;
                        case 50:
                            eVar.f5514h = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5514h);
                            break;
                        case 51:
                            eVar.f5516j = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5516j);
                            break;
                        case 52:
                            eVar.f5517k = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5517k);
                            break;
                        case 53:
                            eVar.f5518l = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5518l);
                            break;
                        case 54:
                            bVar.Y = typedArrayObtainStyledAttributes.getInt(index, bVar.Y);
                            break;
                        case 55:
                            bVar.Z = typedArrayObtainStyledAttributes.getInt(index, bVar.Z);
                            break;
                        case 56:
                            bVar.f5446a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5446a0);
                            break;
                        case 57:
                            bVar.f5448b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5448b0);
                            break;
                        case 58:
                            bVar.f5450c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5450c0);
                            break;
                        case 59:
                            bVar.f5452d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5452d0);
                            break;
                        case 60:
                            eVar.f5508b = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5508b);
                            break;
                        case 61:
                            bVar.A = g(typedArrayObtainStyledAttributes, index, bVar.A);
                            break;
                        case 62:
                            bVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.B);
                            break;
                        case 63:
                            bVar.C = typedArrayObtainStyledAttributes.getFloat(index, bVar.C);
                            break;
                        case 64:
                            cVar.f5489b = g(typedArrayObtainStyledAttributes, index, cVar.f5489b);
                            break;
                        case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.f5491d = a3.g.f3977c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                cVar.f5491d = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            }
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            cVar.f5493f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                            cVar.f5495h = typedArrayObtainStyledAttributes.getFloat(index, cVar.f5495h);
                            break;
                        case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                            dVar.f5505e = typedArrayObtainStyledAttributes.getFloat(index, dVar.f5505e);
                            break;
                        case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                            bVar.f5454e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
                            bVar.f5456f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER /* 71 */:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            bVar.f5458g0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f5458g0);
                            break;
                        case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                            bVar.f5460h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5460h0);
                            break;
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            bVar.f5466k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                            bVar.f5474o0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f5474o0);
                            break;
                        case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                            cVar.f5492e = typedArrayObtainStyledAttributes.getInt(index, cVar.f5492e);
                            break;
                        case 77:
                            bVar.f5468l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            dVar.f5503c = typedArrayObtainStyledAttributes.getInt(index, dVar.f5503c);
                            break;
                        case 79:
                            cVar.f5494g = typedArrayObtainStyledAttributes.getFloat(index, cVar.f5494g);
                            break;
                        case 80:
                            bVar.f5470m0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f5470m0);
                            break;
                        case 81:
                            bVar.f5472n0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f5472n0);
                            break;
                        case 82:
                            cVar.f5490c = typedArrayObtainStyledAttributes.getInteger(index, cVar.f5490c);
                            break;
                        case 83:
                            eVar.f5515i = g(typedArrayObtainStyledAttributes, index, eVar.f5515i);
                            break;
                        case 84:
                            cVar.f5497j = typedArrayObtainStyledAttributes.getInteger(index, cVar.f5497j);
                            break;
                        case 85:
                            cVar.f5496i = typedArrayObtainStyledAttributes.getFloat(index, cVar.f5496i);
                            break;
                        case 86:
                            int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i12 != 1) {
                                if (i12 != 3) {
                                    cVar.f5499l = typedArrayObtainStyledAttributes.getInteger(index, cVar.f5500m);
                                    break;
                                } else {
                                    String string = typedArrayObtainStyledAttributes.getString(index);
                                    cVar.f5498k = string;
                                    if (string.indexOf("/") <= 0) {
                                        cVar.f5499l = -1;
                                        break;
                                    } else {
                                        cVar.f5500m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        cVar.f5499l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cVar.f5500m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    cVar.f5499l = -2;
                                    break;
                                }
                            }
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            bVar.f5478r = g(typedArrayObtainStyledAttributes, index, bVar.f5478r);
                            break;
                        case 92:
                            bVar.f5479s = g(typedArrayObtainStyledAttributes, index, bVar.f5479s);
                            break;
                        case 93:
                            bVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.M);
                            break;
                        case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                            bVar.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.T);
                            break;
                        case 95:
                            h(bVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            h(bVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.f5476p0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f5476p0);
                            break;
                    }
                    i10++;
                } else if (bVar.f5466k0 != null) {
                    bVar.f5464j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int g(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.k.h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void i(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i10 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public static void j(a aVar, TypedArray typedArray) {
        char c10;
        int indexCount = typedArray.getIndexCount();
        j jVar = new j();
        jVar.f5413a = new int[10];
        jVar.f5414b = new int[10];
        jVar.f5415c = 0;
        jVar.f5416d = new int[10];
        jVar.f5417e = new float[10];
        jVar.f5418f = 0;
        jVar.f5419g = new int[5];
        jVar.f5420h = new String[5];
        jVar.f5421i = 0;
        jVar.f5422j = new int[4];
        jVar.f5423k = new boolean[4];
        jVar.f5424l = 0;
        aVar.f5443h = jVar;
        c cVar = aVar.f5439d;
        cVar.f5488a = false;
        b bVar = aVar.f5440e;
        bVar.f5447b = false;
        d dVar = aVar.f5438c;
        dVar.f5501a = false;
        e eVar = aVar.f5441f;
        eVar.f5507a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            int i11 = f5427k.get(index);
            SparseIntArray sparseIntArray = f5426j;
            switch (i11) {
                case 2:
                    c10 = 5;
                    jVar.b(2, typedArray.getDimensionPixelSize(index, bVar.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c10 = 5;
                    break;
                case 5:
                    c10 = 5;
                    jVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    jVar.b(6, typedArray.getDimensionPixelOffset(index, bVar.D));
                    c10 = 5;
                    break;
                case 7:
                    jVar.b(7, typedArray.getDimensionPixelOffset(index, bVar.E));
                    c10 = 5;
                    break;
                case 8:
                    jVar.b(8, typedArray.getDimensionPixelSize(index, bVar.K));
                    c10 = 5;
                    break;
                case 11:
                    jVar.b(11, typedArray.getDimensionPixelSize(index, bVar.Q));
                    c10 = 5;
                    break;
                case 12:
                    jVar.b(12, typedArray.getDimensionPixelSize(index, bVar.R));
                    c10 = 5;
                    break;
                case 13:
                    jVar.b(13, typedArray.getDimensionPixelSize(index, bVar.N));
                    c10 = 5;
                    break;
                case 14:
                    jVar.b(14, typedArray.getDimensionPixelSize(index, bVar.P));
                    c10 = 5;
                    break;
                case 15:
                    jVar.b(15, typedArray.getDimensionPixelSize(index, bVar.S));
                    c10 = 5;
                    break;
                case 16:
                    jVar.b(16, typedArray.getDimensionPixelSize(index, bVar.O));
                    c10 = 5;
                    break;
                case 17:
                    jVar.b(17, typedArray.getDimensionPixelOffset(index, bVar.f5453e));
                    c10 = 5;
                    break;
                case 18:
                    jVar.b(18, typedArray.getDimensionPixelOffset(index, bVar.f5455f));
                    c10 = 5;
                    break;
                case 19:
                    jVar.a(19, typedArray.getFloat(index, bVar.f5457g));
                    c10 = 5;
                    break;
                case 20:
                    jVar.a(20, typedArray.getFloat(index, bVar.f5484x));
                    c10 = 5;
                    break;
                case 21:
                    jVar.b(21, typedArray.getLayoutDimension(index, bVar.f5451d));
                    c10 = 5;
                    break;
                case 22:
                    jVar.b(22, f5425i[typedArray.getInt(index, dVar.f5502b)]);
                    c10 = 5;
                    break;
                case 23:
                    jVar.b(23, typedArray.getLayoutDimension(index, bVar.f5449c));
                    c10 = 5;
                    break;
                case 24:
                    jVar.b(24, typedArray.getDimensionPixelSize(index, bVar.G));
                    c10 = 5;
                    break;
                case 27:
                    jVar.b(27, typedArray.getInt(index, bVar.F));
                    c10 = 5;
                    break;
                case 28:
                    jVar.b(28, typedArray.getDimensionPixelSize(index, bVar.H));
                    c10 = 5;
                    break;
                case 31:
                    jVar.b(31, typedArray.getDimensionPixelSize(index, bVar.L));
                    c10 = 5;
                    break;
                case 34:
                    jVar.b(34, typedArray.getDimensionPixelSize(index, bVar.I));
                    c10 = 5;
                    break;
                case 37:
                    jVar.a(37, typedArray.getFloat(index, bVar.f5485y));
                    c10 = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f5436a);
                    aVar.f5436a = resourceId;
                    jVar.b(38, resourceId);
                    c10 = 5;
                    break;
                case 39:
                    jVar.a(39, typedArray.getFloat(index, bVar.V));
                    c10 = 5;
                    break;
                case 40:
                    jVar.a(40, typedArray.getFloat(index, bVar.U));
                    c10 = 5;
                    break;
                case 41:
                    jVar.b(41, typedArray.getInt(index, bVar.W));
                    c10 = 5;
                    break;
                case 42:
                    jVar.b(42, typedArray.getInt(index, bVar.X));
                    c10 = 5;
                    break;
                case 43:
                    jVar.a(43, typedArray.getFloat(index, dVar.f5504d));
                    c10 = 5;
                    break;
                case 44:
                    jVar.d(44, true);
                    jVar.a(44, typedArray.getDimension(index, eVar.f5520n));
                    c10 = 5;
                    break;
                case 45:
                    jVar.a(45, typedArray.getFloat(index, eVar.f5509c));
                    c10 = 5;
                    break;
                case 46:
                    jVar.a(46, typedArray.getFloat(index, eVar.f5510d));
                    c10 = 5;
                    break;
                case 47:
                    jVar.a(47, typedArray.getFloat(index, eVar.f5511e));
                    c10 = 5;
                    break;
                case 48:
                    jVar.a(48, typedArray.getFloat(index, eVar.f5512f));
                    c10 = 5;
                    break;
                case 49:
                    jVar.a(49, typedArray.getDimension(index, eVar.f5513g));
                    c10 = 5;
                    break;
                case 50:
                    jVar.a(50, typedArray.getDimension(index, eVar.f5514h));
                    c10 = 5;
                    break;
                case 51:
                    jVar.a(51, typedArray.getDimension(index, eVar.f5516j));
                    c10 = 5;
                    break;
                case 52:
                    jVar.a(52, typedArray.getDimension(index, eVar.f5517k));
                    c10 = 5;
                    break;
                case 53:
                    jVar.a(53, typedArray.getDimension(index, eVar.f5518l));
                    c10 = 5;
                    break;
                case 54:
                    jVar.b(54, typedArray.getInt(index, bVar.Y));
                    c10 = 5;
                    break;
                case 55:
                    jVar.b(55, typedArray.getInt(index, bVar.Z));
                    c10 = 5;
                    break;
                case 56:
                    jVar.b(56, typedArray.getDimensionPixelSize(index, bVar.f5446a0));
                    c10 = 5;
                    break;
                case 57:
                    jVar.b(57, typedArray.getDimensionPixelSize(index, bVar.f5448b0));
                    c10 = 5;
                    break;
                case 58:
                    jVar.b(58, typedArray.getDimensionPixelSize(index, bVar.f5450c0));
                    c10 = 5;
                    break;
                case 59:
                    jVar.b(59, typedArray.getDimensionPixelSize(index, bVar.f5452d0));
                    c10 = 5;
                    break;
                case 60:
                    jVar.a(60, typedArray.getFloat(index, eVar.f5508b));
                    c10 = 5;
                    break;
                case 62:
                    jVar.b(62, typedArray.getDimensionPixelSize(index, bVar.B));
                    c10 = 5;
                    break;
                case 63:
                    jVar.a(63, typedArray.getFloat(index, bVar.C));
                    c10 = 5;
                    break;
                case 64:
                    jVar.b(64, g(typedArray, index, cVar.f5489b));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        jVar.c(65, typedArray.getString(index));
                    } else {
                        jVar.c(65, a3.g.f3977c[typedArray.getInteger(index, 0)]);
                    }
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    jVar.b(66, typedArray.getInt(index, 0));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    jVar.a(67, typedArray.getFloat(index, cVar.f5495h));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    jVar.a(68, typedArray.getFloat(index, dVar.f5505e));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                    jVar.a(69, typedArray.getFloat(index, 1.0f));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
                    jVar.a(70, typedArray.getFloat(index, 1.0f));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER /* 71 */:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                    jVar.b(72, typedArray.getInt(index, bVar.f5458g0));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    jVar.b(73, typedArray.getDimensionPixelSize(index, bVar.f5460h0));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    jVar.c(74, typedArray.getString(index));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    jVar.d(75, typedArray.getBoolean(index, bVar.f5474o0));
                    c10 = 5;
                    break;
                case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                    jVar.b(76, typedArray.getInt(index, cVar.f5492e));
                    c10 = 5;
                    break;
                case 77:
                    jVar.c(77, typedArray.getString(index));
                    c10 = 5;
                    break;
                case 78:
                    jVar.b(78, typedArray.getInt(index, dVar.f5503c));
                    c10 = 5;
                    break;
                case 79:
                    jVar.a(79, typedArray.getFloat(index, cVar.f5494g));
                    c10 = 5;
                    break;
                case 80:
                    jVar.d(80, typedArray.getBoolean(index, bVar.f5470m0));
                    c10 = 5;
                    break;
                case 81:
                    jVar.d(81, typedArray.getBoolean(index, bVar.f5472n0));
                    c10 = 5;
                    break;
                case 82:
                    jVar.b(82, typedArray.getInteger(index, cVar.f5490c));
                    c10 = 5;
                    break;
                case 83:
                    jVar.b(83, g(typedArray, index, eVar.f5515i));
                    c10 = 5;
                    break;
                case 84:
                    jVar.b(84, typedArray.getInteger(index, cVar.f5497j));
                    c10 = 5;
                    break;
                case 85:
                    jVar.a(85, typedArray.getFloat(index, cVar.f5496i));
                    c10 = 5;
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f5500m = resourceId2;
                        jVar.b(89, resourceId2);
                        if (cVar.f5500m != -1) {
                            cVar.f5499l = -2;
                            jVar.b(88, -2);
                        }
                    } else if (i12 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f5498k = string;
                        jVar.c(90, string);
                        if (cVar.f5498k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f5500m = resourceId3;
                            jVar.b(89, resourceId3);
                            cVar.f5499l = -2;
                            jVar.b(88, -2);
                        } else {
                            cVar.f5499l = -1;
                            jVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f5500m);
                        cVar.f5499l = integer;
                        jVar.b(88, integer);
                    }
                    c10 = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c10 = 5;
                    break;
                case 93:
                    jVar.b(93, typedArray.getDimensionPixelSize(index, bVar.M));
                    c10 = 5;
                    break;
                case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                    jVar.b(94, typedArray.getDimensionPixelSize(index, bVar.T));
                    c10 = 5;
                    break;
                case 95:
                    h(jVar, typedArray, index, 0);
                    c10 = 5;
                    break;
                case 96:
                    h(jVar, typedArray, index, 1);
                    c10 = 5;
                    break;
                case 97:
                    jVar.b(97, typedArray.getInt(index, bVar.f5476p0));
                    c10 = 5;
                    break;
                case 98:
                    if (i0.f56980z0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.f5436a);
                        aVar.f5436a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.f5437b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f5437b = typedArray.getString(index);
                    } else {
                        aVar.f5436a = typedArray.getResourceId(index, aVar.f5436a);
                    }
                    c10 = 5;
                    break;
                case 99:
                    jVar.d(99, typedArray.getBoolean(index, bVar.f5459h));
                    c10 = 5;
                    break;
            }
        }
    }

    public static String k(int i10) {
        switch (i10) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return TtmlNode.END;
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public final void a(androidx.constraintlayout.widget.a aVar, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            HashMap map = this.f5433f;
            if (map.containsKey(str)) {
                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) map.get(strArr[i10]);
                if (bVar != null && bVar.getType() != aVar) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + bVar.getType().name());
                }
            } else {
                map.put(strArr[i10], new androidx.constraintlayout.widget.b(strArr[i10], aVar));
            }
        }
    }

    public void addColorAttributes(String... strArr) {
        a(androidx.constraintlayout.widget.a.f5365e, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        a(androidx.constraintlayout.widget.a.f5364c, strArr);
    }

    public void addIntAttributes(String... strArr) {
        a(androidx.constraintlayout.widget.a.f5363b, strArr);
    }

    public void addStringAttributes(String... strArr) {
        a(androidx.constraintlayout.widget.a.f5367g, strArr);
    }

    public void addToHorizontalChain(int i10, int i11, int i12) {
        connect(i10, 1, i11, i11 == 0 ? 1 : 2, 0);
        connect(i10, 2, i12, i12 == 0 ? 2 : 1, 0);
        if (i11 != 0) {
            connect(i11, 2, i10, 1, 0);
        }
        if (i12 != 0) {
            connect(i12, 1, i10, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i10, int i11, int i12) {
        connect(i10, 6, i11, i11 == 0 ? 6 : 7, 0);
        connect(i10, 7, i12, i12 == 0 ? 7 : 6, 0);
        if (i11 != 0) {
            connect(i11, 7, i10, 6, 0);
        }
        if (i12 != 0) {
            connect(i12, 6, i10, 7, 0);
        }
    }

    public void addToVerticalChain(int i10, int i11, int i12) {
        connect(i10, 3, i11, i11 == 0 ? 3 : 4, 0);
        connect(i10, 4, i12, i12 == 0 ? 4 : 3, 0);
        if (i11 != 0) {
            connect(i11, 4, i10, 3, 0);
        }
        if (i12 != 0) {
            connect(i12, 3, i10, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            Integer numValueOf = Integer.valueOf(id2);
            HashMap map = this.f5435h;
            if (!map.containsKey(numValueOf)) {
                Log.w("ConstraintSet", "id unknown " + g3.b.getName(childAt));
            } else {
                if (this.f5434g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id2)) && (aVar = (a) map.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.b.setAttributes(childAt, aVar.f5442g);
                }
            }
        }
    }

    public void applyDeltaFrom(k kVar) {
        for (a aVar : kVar.f5435h.values()) {
            if (aVar.f5443h != null) {
                if (aVar.f5437b == null) {
                    aVar.f5443h.e(getConstraint(aVar.f5436a));
                } else {
                    Iterator it = this.f5435h.keySet().iterator();
                    while (it.hasNext()) {
                        a constraint = getConstraint(((Integer) it.next()).intValue());
                        String str = constraint.f5440e.f5468l0;
                        if (str != null && aVar.f5437b.matches(str)) {
                            aVar.f5443h.e(constraint);
                            constraint.f5442g.putAll((HashMap) aVar.f5442g.clone());
                        }
                    }
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        b(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(androidx.constraintlayout.widget.c cVar, d3.g gVar, ConstraintLayout.a aVar, SparseArray<d3.g> sparseArray) {
        a aVar2;
        int id2 = cVar.getId();
        Integer numValueOf = Integer.valueOf(id2);
        HashMap map = this.f5435h;
        if (map.containsKey(numValueOf) && (aVar2 = (a) map.get(Integer.valueOf(id2))) != null && (gVar instanceof d3.m)) {
            cVar.loadParameters(aVar2, (d3.m) gVar, aVar, sparseArray);
        }
    }

    public void applyToLayoutParams(int i10, ConstraintLayout.a aVar) {
        a aVar2;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5435h;
        if (!map.containsKey(numValueOf) || (aVar2 = (a) map.get(Integer.valueOf(i10))) == null) {
            return;
        }
        aVar2.applyTo(aVar);
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        b(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public final void b(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f5435h;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + g3.b.getName(childAt));
            } else {
                if (this.f5434g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) map.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            d dVar = aVar.f5438c;
                            b bVar = aVar.f5440e;
                            e eVar = aVar.f5441f;
                            if (childAt instanceof Barrier) {
                                bVar.f5462i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(bVar.f5458g0);
                                barrier.setMargin(bVar.f5460h0);
                                barrier.setAllowsGoneWidget(bVar.f5474o0);
                                int[] iArr = bVar.f5464j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f5466k0;
                                    if (str != null) {
                                        int[] iArrC = c(barrier, str);
                                        bVar.f5464j0 = iArrC;
                                        barrier.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.validate();
                            aVar.applyTo(aVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.b.setAttributes(childAt, aVar.f5442g);
                            }
                            childAt.setLayoutParams(aVar2);
                            if (dVar.f5503c == 0) {
                                childAt.setVisibility(dVar.f5502b);
                            }
                            childAt.setAlpha(dVar.f5504d);
                            childAt.setRotation(eVar.f5508b);
                            childAt.setRotationX(eVar.f5509c);
                            childAt.setRotationY(eVar.f5510d);
                            childAt.setScaleX(eVar.f5511e);
                            childAt.setScaleY(eVar.f5512f);
                            if (eVar.f5515i != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.f5515i) != null) {
                                    float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                    float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f5513g)) {
                                    childAt.setPivotX(eVar.f5513g);
                                }
                                if (!Float.isNaN(eVar.f5514h)) {
                                    childAt.setPivotY(eVar.f5514h);
                                }
                            }
                            childAt.setTranslationX(eVar.f5516j);
                            childAt.setTranslationY(eVar.f5517k);
                            childAt.setTranslationZ(eVar.f5518l);
                            if (eVar.f5519m) {
                                childAt.setElevation(eVar.f5520n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) map.get(num);
            if (aVar3 != null) {
                b bVar2 = aVar3.f5440e;
                if (bVar2.f5462i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar2.f5464j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f5466k0;
                        if (str2 != null) {
                            int[] iArrC2 = c(barrier2, str2);
                            bVar2.f5464j0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(bVar2.f5458g0);
                    barrier2.setMargin(bVar2.f5460h0);
                    ConstraintLayout.a aVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    aVar3.applyTo(aVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, aVarGenerateDefaultLayoutParams);
                }
                if (bVar2.f5445a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a aVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.applyTo(aVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, aVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).e(constraintLayout);
            }
        }
    }

    public void center(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        if (i13 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        HashMap map = this.f5435h;
        if (i12 == 1 || i12 == 2) {
            connect(i10, 1, i11, i12, i13);
            connect(i10, 2, i14, i15, i16);
            a aVar = (a) map.get(Integer.valueOf(i10));
            if (aVar != null) {
                aVar.f5440e.f5484x = f10;
                return;
            }
            return;
        }
        if (i12 == 6 || i12 == 7) {
            connect(i10, 6, i11, i12, i13);
            connect(i10, 7, i14, i15, i16);
            a aVar2 = (a) map.get(Integer.valueOf(i10));
            if (aVar2 != null) {
                aVar2.f5440e.f5484x = f10;
                return;
            }
            return;
        }
        connect(i10, 3, i11, i12, i13);
        connect(i10, 4, i14, i15, i16);
        a aVar3 = (a) map.get(Integer.valueOf(i10));
        if (aVar3 != null) {
            aVar3.f5440e.f5485y = f10;
        }
    }

    public void centerHorizontally(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        connect(i10, 1, i11, i12, i13);
        connect(i10, 2, i14, i15, i16);
        a aVar = (a) this.f5435h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f5440e.f5484x = f10;
        }
    }

    public void centerHorizontallyRtl(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        connect(i10, 6, i11, i12, i13);
        connect(i10, 7, i14, i15, i16);
        a aVar = (a) this.f5435h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f5440e.f5484x = f10;
        }
    }

    public void centerVertically(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        connect(i10, 3, i11, i12, i13);
        connect(i10, 4, i14, i15, i16);
        a aVar = (a) this.f5435h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f5440e.f5485y = f10;
        }
    }

    public void clear(int i10) {
        this.f5435h.remove(Integer.valueOf(i10));
    }

    public void clone(Context context, int i10) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void connect(int i10, int i11, int i12, int i13, int i14) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5435h;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i10), new a());
        }
        a aVar = (a) map.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f5440e;
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    bVar.f5461i = i12;
                    bVar.f5463j = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + k(i13) + " undefined");
                    }
                    bVar.f5463j = i12;
                    bVar.f5461i = -1;
                }
                bVar.G = i14;
                return;
            case 2:
                if (i13 == 1) {
                    bVar.f5465k = i12;
                    bVar.f5467l = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5467l = i12;
                    bVar.f5465k = -1;
                }
                bVar.H = i14;
                return;
            case 3:
                if (i13 == 3) {
                    bVar.f5469m = i12;
                    bVar.f5471n = -1;
                    bVar.f5477q = -1;
                    bVar.f5478r = -1;
                    bVar.f5479s = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5471n = i12;
                    bVar.f5469m = -1;
                    bVar.f5477q = -1;
                    bVar.f5478r = -1;
                    bVar.f5479s = -1;
                }
                bVar.I = i14;
                return;
            case 4:
                if (i13 == 4) {
                    bVar.f5475p = i12;
                    bVar.f5473o = -1;
                    bVar.f5477q = -1;
                    bVar.f5478r = -1;
                    bVar.f5479s = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5473o = i12;
                    bVar.f5475p = -1;
                    bVar.f5477q = -1;
                    bVar.f5478r = -1;
                    bVar.f5479s = -1;
                }
                bVar.J = i14;
                return;
            case 5:
                if (i13 == 5) {
                    bVar.f5477q = i12;
                    bVar.f5475p = -1;
                    bVar.f5473o = -1;
                    bVar.f5469m = -1;
                    bVar.f5471n = -1;
                    return;
                }
                if (i13 == 3) {
                    bVar.f5478r = i12;
                    bVar.f5475p = -1;
                    bVar.f5473o = -1;
                    bVar.f5469m = -1;
                    bVar.f5471n = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                bVar.f5479s = i12;
                bVar.f5475p = -1;
                bVar.f5473o = -1;
                bVar.f5469m = -1;
                bVar.f5471n = -1;
                return;
            case 6:
                if (i13 == 6) {
                    bVar.f5481u = i12;
                    bVar.f5480t = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5480t = i12;
                    bVar.f5481u = -1;
                }
                bVar.L = i14;
                return;
            case 7:
                if (i13 == 7) {
                    bVar.f5483w = i12;
                    bVar.f5482v = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5482v = i12;
                    bVar.f5483w = -1;
                }
                bVar.K = i14;
                return;
            default:
                throw new IllegalArgumentException(k(i11) + " to " + k(i13) + " unknown");
        }
    }

    public void constrainCircle(int i10, int i11, int i12, float f10) {
        b bVar = f(i10).f5440e;
        bVar.A = i11;
        bVar.B = i12;
        bVar.C = f10;
    }

    public void constrainDefaultHeight(int i10, int i11) {
        f(i10).f5440e.Z = i11;
    }

    public void constrainDefaultWidth(int i10, int i11) {
        f(i10).f5440e.Y = i11;
    }

    public void constrainHeight(int i10, int i11) {
        f(i10).f5440e.f5451d = i11;
    }

    public void constrainMaxHeight(int i10, int i11) {
        f(i10).f5440e.f5448b0 = i11;
    }

    public void constrainMaxWidth(int i10, int i11) {
        f(i10).f5440e.f5446a0 = i11;
    }

    public void constrainMinHeight(int i10, int i11) {
        f(i10).f5440e.f5452d0 = i11;
    }

    public void constrainMinWidth(int i10, int i11) {
        f(i10).f5440e.f5450c0 = i11;
    }

    public void constrainPercentHeight(int i10, float f10) {
        f(i10).f5440e.f5456f0 = f10;
    }

    public void constrainPercentWidth(int i10, float f10) {
        f(i10).f5440e.f5454e0 = f10;
    }

    public void constrainWidth(int i10, int i11) {
        f(i10).f5440e.f5449c = i11;
    }

    public void constrainedHeight(int i10, boolean z10) {
        f(i10).f5440e.f5472n0 = z10;
    }

    public void constrainedWidth(int i10, boolean z10) {
        f(i10).f5440e.f5470m0 = z10;
    }

    public void create(int i10, int i11) {
        b bVar = f(i10).f5440e;
        bVar.f5445a = true;
        bVar.F = i11;
    }

    public void createBarrier(int i10, int i11, int i12, int... iArr) {
        b bVar = f(i10).f5440e;
        bVar.f5462i0 = 1;
        bVar.f5458g0 = i11;
        bVar.f5460h0 = i12;
        bVar.f5445a = false;
        bVar.f5464j0 = iArr;
    }

    public void createHorizontalChain(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d(i10, i11, i12, i13, iArr, fArr, i14, 1, 2);
    }

    public void createHorizontalChainRtl(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d(i10, i11, i12, i13, iArr, fArr, i14, 6, 7);
    }

    public void createVerticalChain(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            f(iArr[0]).f5440e.U = fArr[0];
        }
        f(iArr[0]).f5440e.X = i14;
        connect(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            connect(iArr[i15], 3, iArr[i16], 4, 0);
            connect(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                f(iArr[i15]).f5440e.U = fArr[i15];
            }
        }
        connect(iArr[iArr.length - 1], 4, i12, i13, 0);
    }

    public final void d(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14, int i15, int i16) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            f(iArr[0]).f5440e.V = fArr[0];
        }
        f(iArr[0]).f5440e.W = i14;
        connect(iArr[0], i15, i10, i11, -1);
        for (int i17 = 1; i17 < iArr.length; i17++) {
            int i18 = i17 - 1;
            connect(iArr[i17], i15, iArr[i18], i16, -1);
            connect(iArr[i18], i16, iArr[i17], i15, -1);
            if (fArr != null) {
                f(iArr[i17]).f5440e.V = fArr[i17];
            }
        }
        connect(iArr[iArr.length - 1], i16, i12, i13, -1);
    }

    public void dump(l0 l0Var, int... iArr) throws IllegalAccessException, IllegalArgumentException {
        HashSet hashSet;
        HashMap map = this.f5435h;
        Set setKeySet = map.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = (a) map.get(num);
            if (aVar != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                aVar.f5440e.dump(l0Var, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }

    public final a f(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5435h;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i10), new a());
        }
        return (a) map.get(Integer.valueOf(i10));
    }

    public boolean getApplyElevation(int i10) {
        return f(i10).f5441f.f5519m;
    }

    public a getConstraint(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5435h;
        if (map.containsKey(numValueOf)) {
            return (a) map.get(Integer.valueOf(i10));
        }
        return null;
    }

    public HashMap<String, androidx.constraintlayout.widget.b> getCustomAttributeSet() {
        return this.f5433f;
    }

    public int getHeight(int i10) {
        return f(i10).f5440e.f5451d;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.f5435h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public a getParameters(int i10) {
        return f(i10);
    }

    public int[] getReferencedIds(int i10) {
        int[] iArr = f(i10).f5440e.f5464j0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public String[] getStateLabels() {
        String[] strArr = this.f5431d;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public int getVisibility(int i10) {
        return f(i10).f5438c.f5502b;
    }

    public int getVisibilityMode(int i10) {
        return f(i10).f5438c.f5503c;
    }

    public int getWidth(int i10) {
        return f(i10).f5440e.f5449c;
    }

    public boolean isForceId() {
        return this.f5434g;
    }

    public boolean isValidateOnParse() {
        return this.f5428a;
    }

    public void load(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarE = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarE.f5440e.f5445a = true;
                    }
                    this.f5435h.put(Integer.valueOf(aVarE.f5436a), aVarE);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean matchesLabels(java.lang.String... r9) {
        /*
            r8 = this;
            int r0 = r9.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L1c
            r3 = r9[r2]
            java.lang.String[] r4 = r8.f5431d
            int r5 = r4.length
            r6 = r1
        Lb:
            if (r6 >= r5) goto L1b
            r7 = r4[r6]
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L18
            int r2 = r2 + 1
            goto L3
        L18:
            int r6 = r6 + 1
            goto Lb
        L1b:
            return r1
        L1c:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.k.matchesLabels(java.lang.String[]):boolean");
    }

    public void parseColorAttributes(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(C3191e4.i.f36525b);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.c(strArrSplit2[0], androidx.constraintlayout.widget.a.f5365e).setColorValue(Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void parseFloatAttributes(a aVar, String str) throws NumberFormatException {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(C3191e4.i.f36525b);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.c(strArrSplit2[0], androidx.constraintlayout.widget.a.f5364c).setFloatValue(Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void parseIntAttributes(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(C3191e4.i.f36525b);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.c(strArrSplit2[0], androidx.constraintlayout.widget.a.f5364c).setFloatValue(Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(a aVar, String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 == ',' && !z10) {
                arrayList.add(new String(charArray, i10, i11 - i10));
                i10 = i11 + 1;
            } else if (c10 == '\"') {
                z10 = !z10;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String[] strArrSplit = strArr[i12].split(C3191e4.i.f36525b);
            Log.w("ConstraintSet", " Unable to parse " + strArr[i12]);
            aVar.c(strArrSplit[0], androidx.constraintlayout.widget.a.f5367g).setStringValue(strArrSplit[1]);
        }
    }

    public void readFallback(k kVar) {
        for (Integer num : kVar.f5435h.keySet()) {
            num.getClass();
            a aVar = (a) kVar.f5435h.get(num);
            HashMap map = this.f5435h;
            if (!map.containsKey(num)) {
                map.put(num, new a());
            }
            a aVar2 = (a) map.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f5440e;
                if (!bVar.f5447b) {
                    bVar.copyFrom(aVar.f5440e);
                }
                d dVar = aVar2.f5438c;
                if (!dVar.f5501a) {
                    dVar.copyFrom(aVar.f5438c);
                }
                e eVar = aVar2.f5441f;
                if (!eVar.f5507a) {
                    eVar.copyFrom(aVar.f5441f);
                }
                c cVar = aVar2.f5439d;
                if (!cVar.f5488a) {
                    cVar.copyFrom(aVar.f5439d);
                }
                for (String str : aVar.f5442g.keySet()) {
                    if (!aVar2.f5442g.containsKey(str)) {
                        aVar2.f5442g.put(str, (androidx.constraintlayout.widget.b) aVar.f5442g.get(str));
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.f5433f.remove(str);
    }

    public void removeFromHorizontalChain(int i10) {
        a aVar;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5435h;
        if (!map.containsKey(numValueOf) || (aVar = (a) map.get(Integer.valueOf(i10))) == null) {
            return;
        }
        b bVar = aVar.f5440e;
        int i11 = bVar.f5463j;
        int i12 = bVar.f5465k;
        if (i11 != -1 || i12 != -1) {
            if (i11 == -1 || i12 == -1) {
                int i13 = bVar.f5467l;
                if (i13 != -1) {
                    connect(i11, 2, i13, 2, 0);
                } else {
                    int i14 = bVar.f5461i;
                    if (i14 != -1) {
                        connect(i12, 1, i14, 1, 0);
                    }
                }
            } else {
                connect(i11, 2, i12, 1, 0);
                connect(i12, 1, i11, 2, 0);
            }
            clear(i10, 1);
            clear(i10, 2);
            return;
        }
        int i15 = bVar.f5480t;
        int i16 = bVar.f5482v;
        if (i15 != -1 || i16 != -1) {
            if (i15 != -1 && i16 != -1) {
                connect(i15, 7, i16, 6, 0);
                connect(i16, 6, i11, 7, 0);
            } else if (i16 != -1) {
                int i17 = bVar.f5467l;
                if (i17 != -1) {
                    connect(i11, 7, i17, 7, 0);
                } else {
                    int i18 = bVar.f5461i;
                    if (i18 != -1) {
                        connect(i16, 6, i18, 6, 0);
                    }
                }
            }
        }
        clear(i10, 6);
        clear(i10, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void removeFromVerticalChain(int r10) {
        /*
            r9 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.util.HashMap r1 = r9.f5435h
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.widget.k$a r0 = (androidx.constraintlayout.widget.k.a) r0
            if (r0 != 0) goto L19
            return
        L19:
            androidx.constraintlayout.widget.k$b r0 = r0.f5440e
            int r2 = r0.f5471n
            int r4 = r0.f5473o
            r1 = -1
            if (r2 != r1) goto L27
            if (r4 == r1) goto L25
            goto L27
        L25:
            r1 = r9
            goto L56
        L27:
            if (r2 == r1) goto L3c
            if (r4 == r1) goto L3c
            r5 = 3
            r6 = 0
            r3 = 4
            r1 = r9
            r1.connect(r2, r3, r4, r5, r6)
            r5 = 4
            r3 = 3
            r1 = r4
            r4 = r2
            r2 = r1
            r1 = r9
            r1.connect(r2, r3, r4, r5, r6)
            goto L56
        L3c:
            r3 = r4
            int r4 = r0.f5475p
            if (r4 == r1) goto L49
            r5 = 4
            r6 = 0
            r3 = 4
            r1 = r9
            r1.connect(r2, r3, r4, r5, r6)
            goto L56
        L49:
            int r6 = r0.f5469m
            if (r6 == r1) goto L25
            r7 = 3
            r8 = 0
            r5 = 3
            r4 = r3
            r3 = r9
            r3.connect(r4, r5, r6, r7, r8)
            r1 = r3
        L56:
            r0 = 3
            r9.clear(r10, r0)
            r0 = 4
            r9.clear(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.k.removeFromVerticalChain(int):void");
    }

    public void setAlpha(int i10, float f10) {
        f(i10).f5438c.f5504d = f10;
    }

    public void setApplyElevation(int i10, boolean z10) {
        f(i10).f5441f.f5519m = z10;
    }

    public void setBarrierType(int i10, int i11) {
        f(i10).f5440e.f5462i0 = i11;
    }

    public void setColorValue(int i10, String str, int i11) {
        f(i10).c(str, androidx.constraintlayout.widget.a.f5365e).setColorValue(i11);
    }

    public void setDimensionRatio(int i10, String str) {
        f(i10).f5440e.f5486z = str;
    }

    public void setEditorAbsoluteX(int i10, int i11) {
        f(i10).f5440e.D = i11;
    }

    public void setEditorAbsoluteY(int i10, int i11) {
        f(i10).f5440e.E = i11;
    }

    public void setElevation(int i10, float f10) {
        f(i10).f5441f.f5520n = f10;
        f(i10).f5441f.f5519m = true;
    }

    public void setFloatValue(int i10, String str, float f10) {
        f(i10).c(str, androidx.constraintlayout.widget.a.f5364c).setFloatValue(f10);
    }

    public void setForceId(boolean z10) {
        this.f5434g = z10;
    }

    public void setGoneMargin(int i10, int i11, int i12) {
        a aVarF = f(i10);
        switch (i11) {
            case 1:
                aVarF.f5440e.N = i12;
                return;
            case 2:
                aVarF.f5440e.P = i12;
                return;
            case 3:
                aVarF.f5440e.O = i12;
                return;
            case 4:
                aVarF.f5440e.Q = i12;
                return;
            case 5:
                aVarF.f5440e.T = i12;
                return;
            case 6:
                aVarF.f5440e.S = i12;
                return;
            case 7:
                aVarF.f5440e.R = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i10, int i11) {
        f(i10).f5440e.f5453e = i11;
        f(i10).f5440e.f5455f = -1;
        f(i10).f5440e.f5457g = -1.0f;
    }

    public void setGuidelineEnd(int i10, int i11) {
        f(i10).f5440e.f5455f = i11;
        f(i10).f5440e.f5453e = -1;
        f(i10).f5440e.f5457g = -1.0f;
    }

    public void setGuidelinePercent(int i10, float f10) {
        f(i10).f5440e.f5457g = f10;
        f(i10).f5440e.f5455f = -1;
        f(i10).f5440e.f5453e = -1;
    }

    public void setHorizontalBias(int i10, float f10) {
        f(i10).f5440e.f5484x = f10;
    }

    public void setHorizontalChainStyle(int i10, int i11) {
        f(i10).f5440e.W = i11;
    }

    public void setHorizontalWeight(int i10, float f10) {
        f(i10).f5440e.V = f10;
    }

    public void setIntValue(int i10, String str, int i11) {
        f(i10).c(str, androidx.constraintlayout.widget.a.f5363b).setIntValue(i11);
    }

    public void setLayoutWrapBehavior(int i10, int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        f(i10).f5440e.f5476p0 = i11;
    }

    public void setMargin(int i10, int i11, int i12) {
        a aVarF = f(i10);
        switch (i11) {
            case 1:
                aVarF.f5440e.G = i12;
                return;
            case 2:
                aVarF.f5440e.H = i12;
                return;
            case 3:
                aVarF.f5440e.I = i12;
                return;
            case 4:
                aVarF.f5440e.J = i12;
                return;
            case 5:
                aVarF.f5440e.M = i12;
                return;
            case 6:
                aVarF.f5440e.L = i12;
                return;
            case 7:
                aVarF.f5440e.K = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i10, int... iArr) {
        f(i10).f5440e.f5464j0 = iArr;
    }

    public void setRotation(int i10, float f10) {
        f(i10).f5441f.f5508b = f10;
    }

    public void setRotationX(int i10, float f10) {
        f(i10).f5441f.f5509c = f10;
    }

    public void setRotationY(int i10, float f10) {
        f(i10).f5441f.f5510d = f10;
    }

    public void setScaleX(int i10, float f10) {
        f(i10).f5441f.f5511e = f10;
    }

    public void setScaleY(int i10, float f10) {
        f(i10).f5441f.f5512f = f10;
    }

    public void setStateLabels(String str) {
        this.f5431d = str.split(",");
        int i10 = 0;
        while (true) {
            String[] strArr = this.f5431d;
            if (i10 >= strArr.length) {
                return;
            }
            strArr[i10] = strArr[i10].trim();
            i10++;
        }
    }

    public void setStateLabelsList(String... strArr) {
        this.f5431d = strArr;
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f5431d;
            if (i10 >= strArr2.length) {
                return;
            }
            strArr2[i10] = strArr2[i10].trim();
            i10++;
        }
    }

    public void setStringValue(int i10, String str, String str2) {
        f(i10).c(str, androidx.constraintlayout.widget.a.f5367g).setStringValue(str2);
    }

    public void setTransformPivot(int i10, float f10, float f11) {
        e eVar = f(i10).f5441f;
        eVar.f5514h = f11;
        eVar.f5513g = f10;
    }

    public void setTransformPivotX(int i10, float f10) {
        f(i10).f5441f.f5513g = f10;
    }

    public void setTransformPivotY(int i10, float f10) {
        f(i10).f5441f.f5514h = f10;
    }

    public void setTranslation(int i10, float f10, float f11) {
        e eVar = f(i10).f5441f;
        eVar.f5516j = f10;
        eVar.f5517k = f11;
    }

    public void setTranslationX(int i10, float f10) {
        f(i10).f5441f.f5516j = f10;
    }

    public void setTranslationY(int i10, float f10) {
        f(i10).f5441f.f5517k = f10;
    }

    public void setTranslationZ(int i10, float f10) {
        f(i10).f5441f.f5518l = f10;
    }

    public void setValidateOnParse(boolean z10) {
        this.f5428a = z10;
    }

    public void setVerticalBias(int i10, float f10) {
        f(i10).f5440e.f5485y = f10;
    }

    public void setVerticalChainStyle(int i10, int i11) {
        f(i10).f5440e.X = i11;
    }

    public void setVerticalWeight(int i10, float f10) {
        f(i10).f5440e.U = f10;
    }

    public void setVisibility(int i10, int i11) {
        f(i10).f5438c.f5502b = i11;
    }

    public void setVisibilityMode(int i10, int i11) {
        f(i10).f5438c.f5503c = i11;
    }

    public void writeState(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
        writer.write("\n---------------------------------------------\n");
        int i11 = i10 & 1;
        String str = C3191e4.i.f36529d;
        HashMap map = this.f5435h;
        if (i11 == 1) {
            m mVar = new m();
            mVar.f5527c = 0;
            mVar.f5528d = new HashMap();
            mVar.f5525a = writer;
            mVar.f5526b = constraintLayout.getContext();
            writer.write(RnJusJ.dWWGCNtjXvmnfdk);
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                a aVar = (a) map.get(num);
                String strA = mVar.a(num.intValue());
                writer.write("  <Constraint");
                writer.write("\n       android:id=\"" + strA + "\"");
                b bVar = aVar.f5440e;
                mVar.b(bVar.f5449c, "android:layout_width");
                mVar.b(bVar.f5451d, "android:layout_height");
                mVar.g("app:layout_constraintGuide_begin", bVar.f5453e, -1.0f);
                mVar.g("app:layout_constraintGuide_end", bVar.f5455f, -1.0f);
                mVar.g("app:layout_constraintGuide_percent", bVar.f5457g, -1.0f);
                mVar.g("app:layout_constraintHorizontal_bias", bVar.f5484x, 0.5f);
                mVar.g("app:layout_constraintVertical_bias", bVar.f5485y, 0.5f);
                mVar.h("app:layout_constraintDimensionRatio", bVar.f5486z);
                mVar.i(bVar.A, "app:layout_constraintCircle");
                mVar.g("app:layout_constraintCircleRadius", bVar.B, 0.0f);
                mVar.g("app:layout_constraintCircleAngle", bVar.C, 0.0f);
                mVar.g("android:orientation", bVar.F, -1.0f);
                mVar.g("app:layout_constraintVertical_weight", bVar.U, -1.0f);
                mVar.g("app:layout_constraintHorizontal_weight", bVar.V, -1.0f);
                mVar.g("app:layout_constraintHorizontal_chainStyle", bVar.W, 0.0f);
                mVar.g("app:layout_constraintVertical_chainStyle", bVar.X, 0.0f);
                String str2 = str;
                mVar.g("app:barrierDirection", bVar.f5458g0, -1.0f);
                mVar.g("app:barrierMargin", bVar.f5460h0, 0.0f);
                mVar.d(bVar.G, 0, "app:layout_marginLeft");
                mVar.d(bVar.N, Integer.MIN_VALUE, "app:layout_goneMarginLeft");
                mVar.d(bVar.H, 0, "app:layout_marginRight");
                mVar.d(bVar.P, Integer.MIN_VALUE, "app:layout_goneMarginRight");
                mVar.d(bVar.L, 0, "app:layout_marginStart");
                mVar.d(bVar.S, Integer.MIN_VALUE, "app:layout_goneMarginStart");
                mVar.d(bVar.K, 0, "app:layout_marginEnd");
                mVar.d(bVar.R, Integer.MIN_VALUE, "app:layout_goneMarginEnd");
                mVar.d(bVar.I, 0, "app:layout_marginTop");
                mVar.d(bVar.O, Integer.MIN_VALUE, "app:layout_goneMarginTop");
                mVar.d(bVar.J, 0, "app:layout_marginBottom");
                mVar.d(bVar.Q, Integer.MIN_VALUE, "app:layout_goneMarginBottom");
                mVar.d(bVar.T, Integer.MIN_VALUE, "app:goneBaselineMargin");
                mVar.d(bVar.M, 0, "app:baselineMargin");
                mVar.c("app:layout_constrainedWidth", bVar.f5470m0, false);
                mVar.c("app:layout_constrainedHeight", bVar.f5472n0, false);
                mVar.c("app:barrierAllowsGoneWidgets", bVar.f5474o0, true);
                mVar.g("app:layout_wrapBehaviorInParent", bVar.f5476p0, 0.0f);
                mVar.i(bVar.f5477q, "app:baselineToBaseline");
                mVar.i(bVar.f5479s, "app:baselineToBottom");
                mVar.i(bVar.f5478r, "app:baselineToTop");
                mVar.i(bVar.f5475p, "app:layout_constraintBottom_toBottomOf");
                mVar.i(bVar.f5473o, "app:layout_constraintBottom_toTopOf");
                mVar.i(bVar.f5483w, "app:layout_constraintEnd_toEndOf");
                mVar.i(bVar.f5482v, "app:layout_constraintEnd_toStartOf");
                mVar.i(bVar.f5461i, "app:layout_constraintLeft_toLeftOf");
                mVar.i(bVar.f5463j, "app:layout_constraintLeft_toRightOf");
                mVar.i(bVar.f5465k, "app:layout_constraintRight_toLeftOf");
                mVar.i(bVar.f5467l, "app:layout_constraintRight_toRightOf");
                mVar.i(bVar.f5480t, "app:layout_constraintStart_toEndOf");
                mVar.i(bVar.f5481u, "app:layout_constraintStart_toStartOf");
                mVar.i(bVar.f5471n, "app:layout_constraintTop_toBottomOf");
                mVar.i(bVar.f5469m, "app:layout_constraintTop_toTopOf");
                String[] strArr = {"spread", "wrap", "percent"};
                Iterator it2 = it;
                mVar.e("app:layout_constraintHeight_default", bVar.Z, 0, strArr);
                mVar.g("app:layout_constraintHeight_percent", bVar.f5456f0, 1.0f);
                mVar.d(bVar.f5452d0, 0, "app:layout_constraintHeight_min");
                mVar.d(bVar.f5448b0, 0, "app:layout_constraintHeight_max");
                mVar.c("android:layout_constrainedHeight", bVar.f5472n0, false);
                mVar.e("app:layout_constraintWidth_default", bVar.Y, 0, strArr);
                mVar.g("app:layout_constraintWidth_percent", bVar.f5454e0, 1.0f);
                mVar.d(bVar.f5450c0, 0, "app:layout_constraintWidth_min");
                mVar.d(bVar.f5446a0, 0, "app:layout_constraintWidth_max");
                mVar.c("android:layout_constrainedWidth", bVar.f5470m0, false);
                mVar.g("app:layout_constraintVertical_weight", bVar.U, -1.0f);
                mVar.g("app:layout_constraintHorizontal_weight", bVar.V, -1.0f);
                mVar.f(bVar.W, "app:layout_constraintHorizontal_chainStyle");
                mVar.f(bVar.X, "app:layout_constraintVertical_chainStyle");
                mVar.e("app:barrierDirection", bVar.f5458g0, -1, new String[]{TtmlNode.LEFT, TtmlNode.RIGHT, "top", "bottom", "start", TtmlNode.END});
                mVar.h("app:layout_constraintTag", bVar.f5468l0);
                int[] iArr = bVar.f5464j0;
                if (iArr != null) {
                    writer.write("\n       'ReferenceIds'");
                    writer.write(":");
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12 == 0 ? str2 : ", ");
                        sb2.append(mVar.a(iArr[i12]));
                        writer.write(sb2.toString());
                        i12++;
                    }
                    writer.write("],\n");
                }
                writer.write(" />\n");
                it = it2;
                str = str2;
            }
            writer.write("</ConstraintSet>\n");
        } else {
            l lVar = new l();
            lVar.f5523c = 0;
            lVar.f5524d = new HashMap();
            lVar.f5521a = writer;
            lVar.f5522b = constraintLayout.getContext();
            writer.write("\n'ConstraintSet':{\n");
            for (Integer num2 : map.keySet()) {
                a aVar2 = (a) map.get(num2);
                writer.write(lVar.a(num2.intValue()) + ":{\n");
                b bVar2 = aVar2.f5440e;
                l lVar2 = lVar;
                lVar2.c("height", bVar2.f5451d, bVar2.Z, bVar2.f5452d0, bVar2.f5448b0, bVar2.f5456f0);
                lVar2.c("width", bVar2.f5449c, bVar2.Y, bVar2.f5450c0, bVar2.f5446a0, bVar2.f5454e0);
                lVar = lVar2;
                lVar.b(bVar2.f5461i, bVar2.G, "'left'", "'left'");
                lVar.b(bVar2.f5463j, bVar2.G, "'left'", "'right'");
                lVar.b(bVar2.f5465k, bVar2.H, "'right'", "'left'");
                lVar.b(bVar2.f5467l, bVar2.H, "'right'", "'right'");
                lVar.b(bVar2.f5477q, -1, "'baseline'", "'baseline'");
                lVar.b(bVar2.f5478r, -1, "'baseline'", "'top'");
                lVar.b(bVar2.f5479s, -1, "'baseline'", "'bottom'");
                lVar.b(bVar2.f5471n, bVar2.I, "'top'", "'bottom'");
                lVar.b(bVar2.f5469m, bVar2.I, "'top'", "'top'");
                lVar.b(bVar2.f5475p, bVar2.J, "'bottom'", "'bottom'");
                lVar.b(bVar2.f5473o, bVar2.J, "'bottom'", "'top'");
                lVar.b(bVar2.f5481u, bVar2.L, "'start'", "'start'");
                lVar.b(bVar2.f5480t, bVar2.L, "'start'", "'end'");
                lVar.b(bVar2.f5482v, bVar2.K, "'end'", "'start'");
                lVar.b(bVar2.f5483w, bVar2.K, "'end'", "'end'");
                lVar.g("'horizontalBias'", bVar2.f5484x);
                lVar.g("'verticalBias'", bVar2.f5485y);
                int i13 = bVar2.A;
                float f10 = bVar2.C;
                int i14 = bVar2.B;
                if (i13 != -1) {
                    writer.write("       circle");
                    writer.write(":[");
                    writer.write(lVar.a(i13));
                    writer.write(", " + f10);
                    writer.write(i14 + C3191e4.i.f36531e);
                }
                int i15 = bVar2.F;
                int i16 = bVar2.f5453e;
                int i17 = bVar2.f5455f;
                float f11 = bVar2.f5457g;
                lVar.d(i15, "'orientation'");
                lVar.d(i16, "'guideBegin'");
                lVar.d(i17, "'guideEnd'");
                lVar.e("'guidePercent'", f11);
                lVar.f("'dimensionRatio'", bVar2.f5486z);
                lVar.d(bVar2.f5460h0, "'barrierMargin'");
                lVar.d(bVar2.f5462i0, "'type'");
                lVar.f("'ReferenceId'", bVar2.f5466k0);
                boolean z10 = bVar2.f5474o0;
                if (!z10) {
                    writer.write("       'mBarrierAllowsGoneWidgets'");
                    writer.write(": " + z10);
                    writer.write(",\n");
                }
                lVar.d(bVar2.f5476p0, "'WrapBehavior'");
                lVar.e("'verticalWeight'", bVar2.U);
                lVar.e("'horizontalWeight'", bVar2.V);
                lVar.d(bVar2.W, "'horizontalChainStyle'");
                lVar.d(bVar2.X, "'verticalChainStyle'");
                lVar.d(bVar2.f5458g0, "'barrierDirection'");
                int[] iArr2 = bVar2.f5464j0;
                if (iArr2 != null) {
                    writer.write("       'ReferenceIds'");
                    writer.write(": ");
                    int i18 = 0;
                    while (i18 < iArr2.length) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i18 == 0 ? C3191e4.i.f36529d : ", ");
                        sb3.append(lVar.a(iArr2[i18]));
                        writer.write(sb3.toString());
                        i18++;
                    }
                    writer.write("],\n");
                }
                writer.write("}\n");
            }
            writer.write("}\n");
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void clear(int i10, int i11) {
        a aVar;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5435h;
        if (!map.containsKey(numValueOf) || (aVar = (a) map.get(Integer.valueOf(i10))) == null) {
            return;
        }
        b bVar = aVar.f5440e;
        switch (i11) {
            case 1:
                bVar.f5463j = -1;
                bVar.f5461i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                return;
            case 2:
                bVar.f5467l = -1;
                bVar.f5465k = -1;
                bVar.H = -1;
                bVar.P = Integer.MIN_VALUE;
                return;
            case 3:
                bVar.f5471n = -1;
                bVar.f5469m = -1;
                bVar.I = 0;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 4:
                bVar.f5473o = -1;
                bVar.f5475p = -1;
                bVar.J = 0;
                bVar.Q = Integer.MIN_VALUE;
                return;
            case 5:
                bVar.f5477q = -1;
                bVar.f5478r = -1;
                bVar.f5479s = -1;
                bVar.M = 0;
                bVar.T = Integer.MIN_VALUE;
                return;
            case 6:
                bVar.f5480t = -1;
                bVar.f5481u = -1;
                bVar.L = 0;
                bVar.S = Integer.MIN_VALUE;
                return;
            case 7:
                bVar.f5482v = -1;
                bVar.f5483w = -1;
                bVar.K = 0;
                bVar.R = Integer.MIN_VALUE;
                return;
            case 8:
                bVar.C = -1.0f;
                bVar.B = -1;
                bVar.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void clone(k kVar) {
        HashMap map = this.f5435h;
        map.clear();
        for (Integer num : kVar.f5435h.keySet()) {
            a aVar = (a) kVar.f5435h.get(num);
            if (aVar != null) {
                map.put(num, aVar.m68clone());
            }
        }
    }

    public void centerHorizontally(int i10, int i11) {
        if (i11 == 0) {
            center(i10, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i10, i11, 2, 0, i11, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i10, int i11) {
        if (i11 == 0) {
            center(i10, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i10, i11, 7, 0, i11, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i10, int i11) {
        if (i11 == 0) {
            center(i10, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i10, i11, 4, 0, i11, 3, 0, 0.5f);
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f5435h;
        map.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f5434g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = (a) map.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                d dVar = aVar2.f5438c;
                b bVar = aVar2.f5440e;
                e eVar = aVar2.f5441f;
                aVar2.f5442g = androidx.constraintlayout.widget.b.extractAttributes(this.f5433f, childAt);
                aVar2.a(id2, aVar);
                dVar.f5502b = childAt.getVisibility();
                dVar.f5504d = childAt.getAlpha();
                eVar.f5508b = childAt.getRotation();
                eVar.f5509c = childAt.getRotationX();
                eVar.f5510d = childAt.getRotationY();
                eVar.f5511e = childAt.getScaleX();
                eVar.f5512f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f5513g = pivotX;
                    eVar.f5514h = pivotY;
                }
                eVar.f5516j = childAt.getTranslationX();
                eVar.f5517k = childAt.getTranslationY();
                eVar.f5518l = childAt.getTranslationZ();
                if (eVar.f5519m) {
                    eVar.f5520n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    bVar.f5474o0 = barrier.getAllowsGoneWidget();
                    bVar.f5464j0 = barrier.getReferencedIds();
                    bVar.f5458g0 = barrier.getType();
                    bVar.f5460h0 = barrier.getMargin();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01af, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.k.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f5434g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id2);
            HashMap map = this.f5435h;
            if (!map.containsKey(numValueOf)) {
                map.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = (a) map.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                d dVar = aVar2.f5438c;
                b bVar = aVar2.f5440e;
                e eVar = aVar2.f5441f;
                if (!bVar.f5447b) {
                    aVar2.a(id2, aVar);
                    if (childAt instanceof androidx.constraintlayout.widget.c) {
                        bVar.f5464j0 = ((androidx.constraintlayout.widget.c) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            bVar.f5474o0 = barrier.getAllowsGoneWidget();
                            bVar.f5458g0 = barrier.getType();
                            bVar.f5460h0 = barrier.getMargin();
                        }
                    }
                    bVar.f5447b = true;
                }
                if (!dVar.f5501a) {
                    dVar.f5502b = childAt.getVisibility();
                    dVar.f5504d = childAt.getAlpha();
                    dVar.f5501a = true;
                }
                if (!eVar.f5507a) {
                    eVar.f5507a = true;
                    eVar.f5508b = childAt.getRotation();
                    eVar.f5509c = childAt.getRotationX();
                    eVar.f5510d = childAt.getRotationY();
                    eVar.f5511e = childAt.getScaleX();
                    eVar.f5512f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        eVar.f5513g = pivotX;
                        eVar.f5514h = pivotY;
                    }
                    eVar.f5516j = childAt.getTranslationX();
                    eVar.f5517k = childAt.getTranslationY();
                    eVar.f5518l = childAt.getTranslationZ();
                    if (eVar.f5519m) {
                        eVar.f5520n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void clone(n nVar) {
        int childCount = nVar.getChildCount();
        HashMap map = this.f5435h;
        map.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = nVar.getChildAt(i10);
            n.a aVar = (n.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f5434g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = (a) map.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.c) {
                    androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) childAt;
                    b bVar = aVar2.f5440e;
                    aVar2.b(id2, aVar);
                    if (cVar instanceof Barrier) {
                        bVar.f5462i0 = 1;
                        Barrier barrier = (Barrier) cVar;
                        bVar.f5458g0 = barrier.getType();
                        bVar.f5464j0 = barrier.getReferencedIds();
                        bVar.f5460h0 = barrier.getMargin();
                    }
                }
                aVar2.b(id2, aVar);
            }
        }
    }

    public void connect(int i10, int i11, int i12, int i13) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5435h;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i10), new a());
        }
        a aVar = (a) map.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f5440e;
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    bVar.f5461i = i12;
                    bVar.f5463j = -1;
                    return;
                } else if (i13 == 2) {
                    bVar.f5463j = i12;
                    bVar.f5461i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + k(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    bVar.f5465k = i12;
                    bVar.f5467l = -1;
                    return;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5467l = i12;
                    bVar.f5465k = -1;
                    return;
                }
            case 3:
                if (i13 == 3) {
                    bVar.f5469m = i12;
                    bVar.f5471n = -1;
                    bVar.f5477q = -1;
                    bVar.f5478r = -1;
                    bVar.f5479s = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                bVar.f5471n = i12;
                bVar.f5469m = -1;
                bVar.f5477q = -1;
                bVar.f5478r = -1;
                bVar.f5479s = -1;
                return;
            case 4:
                if (i13 == 4) {
                    bVar.f5475p = i12;
                    bVar.f5473o = -1;
                    bVar.f5477q = -1;
                    bVar.f5478r = -1;
                    bVar.f5479s = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                bVar.f5473o = i12;
                bVar.f5475p = -1;
                bVar.f5477q = -1;
                bVar.f5478r = -1;
                bVar.f5479s = -1;
                return;
            case 5:
                if (i13 == 5) {
                    bVar.f5477q = i12;
                    bVar.f5475p = -1;
                    bVar.f5473o = -1;
                    bVar.f5469m = -1;
                    bVar.f5471n = -1;
                    return;
                }
                if (i13 == 3) {
                    bVar.f5478r = i12;
                    bVar.f5475p = -1;
                    bVar.f5473o = -1;
                    bVar.f5469m = -1;
                    bVar.f5471n = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                bVar.f5479s = i12;
                bVar.f5475p = -1;
                bVar.f5473o = -1;
                bVar.f5469m = -1;
                bVar.f5471n = -1;
                return;
            case 6:
                if (i13 == 6) {
                    bVar.f5481u = i12;
                    bVar.f5480t = -1;
                    return;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5480t = i12;
                    bVar.f5481u = -1;
                    return;
                }
            case 7:
                if (i13 == 7) {
                    bVar.f5483w = i12;
                    bVar.f5482v = -1;
                    return;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    bVar.f5482v = i12;
                    bVar.f5483w = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(k(i11) + " to " + k(i13) + " unknown");
        }
    }
}
