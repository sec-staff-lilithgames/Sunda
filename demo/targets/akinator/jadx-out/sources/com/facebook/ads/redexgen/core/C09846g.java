package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.applovin.shadow.okio.Segment;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.InterfaceC3129ae;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.6g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C09846g extends ViewGroup {
    public static byte[] A18;
    public static String[] A19 = {"EVtiEz0XwzmAcv0NfW8PxL5EkbzIoYic", "JvoTrXnfxJUplw5tP56Ros2T7Gsfofpu", "CB3RTx10Tt9OnvYftpvuMygLYd0xmG3f", "iCoGDb0mnoj0sn99iJ8fx9KF0Zt33I3a", "ipdvxhFfLLm3eGkYLsOkZJNxKW1ljoxp", "EVaiAhpvjrLt8PNqQrclR8roKXj174Mb", "AK1oSCSoqExnNm9Bojb7ErrkRophOnjO", "V"};
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public C2121gM A00;
    public C1464Pm A01;
    public C2118gJ A02;
    public RunnableC1477Pz A03;
    public QC A04;
    public QK A05;
    public QO A06;
    public QX A07;
    public RunnableC1483Qf A08;
    public C2101g1 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C1437Ol A0d;
    public QF A0e;
    public QI A0f;
    public QR A0g;
    public QS A0h;
    public QT A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<QT> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final QW A0r;
    public final C1481Qd A0s;
    public final C1492Qo A0t;
    public final Runnable A0u;
    public final ArrayList<RecyclerView.ItemDecoration> A0v;
    public final List<AbstractC1484Qg> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final C2103g4 A11;
    public final InterfaceC1491Qn A12;
    public final ArrayList<QS> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C09846g A0H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C09846g) {
            return (C09846g) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C09846g c09846gA0H = A0H(viewGroup.getChildAt(i10));
            if (c09846gA0H != null) {
                return c09846gA0H;
            }
        }
        return null;
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A18, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "u7dEJjISLATYPJ53p8QeJMuNBCdH6OYt";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 27);
            i13++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0N() {
        this.A0s.A04(4);
        A1L();
        A1M();
        this.A0s.A04 = 1;
        if (this.A0s.A0C) {
            for (int iA05 = this.A01.A05() - 1; iA05 >= 0; iA05--) {
                AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A09(iA05));
                if (!abstractC1484QgA0F.A0l()) {
                    long jA0C = A0C(abstractC1484QgA0F);
                    QJ qjA0E = this.A05.A0E(this.A0s, abstractC1484QgA0F);
                    AbstractC1484Qg abstractC1484QgA05 = this.A0t.A05(jA0C);
                    if (abstractC1484QgA05 == null || abstractC1484QgA05.A0l()) {
                        this.A0t.A0E(abstractC1484QgA0F, qjA0E);
                    } else {
                        boolean zA0H = this.A0t.A0H(abstractC1484QgA05);
                        boolean zA0H2 = this.A0t.A0H(abstractC1484QgA0F);
                        if (zA0H && abstractC1484QgA05 == abstractC1484QgA0F) {
                            this.A0t.A0E(abstractC1484QgA0F, qjA0E);
                        } else {
                            QJ qjA04 = this.A0t.A04(abstractC1484QgA05);
                            this.A0t.A0E(abstractC1484QgA0F, qjA0E);
                            QJ qjA03 = this.A0t.A03(abstractC1484QgA0F);
                            if (qjA04 == null) {
                                A0m(jA0C, abstractC1484QgA0F, abstractC1484QgA05);
                            } else {
                                A0t(abstractC1484QgA05, abstractC1484QgA0F, qjA04, qjA03, zA0H, zA0H2);
                            }
                        }
                    }
                }
            }
            this.A0t.A0G(this.A12);
        }
        this.A06.A1I(this.A0r);
        this.A0s.A05 = this.A0s.A03;
        this.A0C = false;
        this.A0s.A0C = false;
        this.A0s.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            this.A0r.A02.clear();
        }
        if (this.A06.A08) {
            this.A06.A00 = 0;
            this.A06.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1x(this.A0s);
        A1N();
        A1p(false);
        this.A0t.A06();
        if (A11(this.A14[0], this.A14[1])) {
            A1d(0, 0);
        }
        A0Q();
        A0S();
    }

    public static void A0W() {
        A18 = new byte[]{82, 68, 46, 68, 122, -115, -119, -101, 68, 108, -109, -112, -120, -119, -106, 68, 86, 94, -80, -13, -15, -2, -2, -1, 4, -80, -14, -11, -80, -10, -1, 5, -2, -12, -80, -14, 5, 4, -80, -7, 4, -80, -7, 3, -80, -2, -11, -13, -11, 3, 3, -15, 2, 9, -80, -10, -1, 2, -80, -73, 0, 10, -73, -8, 3, 9, -4, -8, -5, 16, -73, -8, 11, 11, -8, -6, -1, -4, -5, -73, 11, 6, -73, -8, -73, -23, -4, -6, 16, -6, 3, -4, 9, -19, 0, -4, 14, -47, 97, -86, -76, 97, -81, -80, -75, 97, -94, 97, -91, -86, -77, -90, -92, -75, 97, -92, -87, -86, -83, -91, 97, -80, -89, 97, -95, -17, -16, -11, -95, -25, -16, -10, -17, -27, -81, -95, -59, -22, -27, -95, -30, -17, -6, -95, -50, -16, -11, -22, -16, -17, -58, -9, -26, -17, -11, -12, -95, -24, -26, -11, -95, -12, -20, -22, -15, -15, -26, -27, -64, -98, -110, -45, -42, -45, -30, -26, -41, -28, -84, -66, -78, -11, 1, 0, 6, -9, 10, 6, -52, -99, -111, -35, -46, -22, -32, -26, -27, -85, -82, -109, -24, -26, -36, -31, -38, -109, -41, -40, -39, -44, -24, -33, -25, -109, -23, -44, -33, -24, -40, -78, -48, -37, -37, -44, -45, -113, -31, -44, -36, -34, -27, -44, -77, -44, -29, -48, -46, -41, -44, -45, -59, -40, -44, -26, -113, -26, -40, -29, -41, -113, -48, -113, -27, -40, -44, -26, -113, -26, -41, -40, -46, -41, -113, -40, -30, -113, -35, -34, -29, -113, -43, -37, -48, -42, -42, -44, -45, -113, -48, -30, -113, -29, -36, -33, -113, -45, -44, -29, -48, -46, -41, -44, -45, -99, -69, -39, -26, -26, -25, -20, -104, -37, -39, -28, -28, -104, -20, -32, -31, -21, -104, -27, -35, -20, -32, -25, -36, -104, -31, -26, -104, -39, -104, -21, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -90, -104, -53, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -21, -104, -27, -31, -33, -32, -20, -38, -35, -104, -22, -19, -26, -104, -36, -19, -22, -31, -26, -33, -104, -39, -104, -27, -35, -39, -21, -19, -22, -35, -104, -98, -104, -28, -39, -15, -25, -19, -20, -104, -24, -39, -21, -21, -104, -17, -32, -35, -22, -35, -104, -15, -25, -19, -104, -37, -39, -26, -26, -25, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -36, -39, -20, -39, -90, -104, -71, -26, -15, -104, -27, -35, -20, -32, -25, -36, -104, -37, -39, -28, -28, -104, -20, -32, -39, -20, -104, -27, -31, -33, -32, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -104, -21, -20, -22, -19, -37, -20, -19, -22, -35, -25, -34, -104, -20, -32, -35, -104, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -22, -104, -20, -32, -35, -104, -39, -36, -39, -24, -20, -35, -22, -104, -37, -25, -26, -20, -35, -26, -20, -21, -104, -21, -32, -25, -19, -28, -36, -104, -38, -35, -104, -24, -25, -21, -20, -24, -25, -26, -35, -36, -104, -20, -25, -20, -32, -35, -104, -26, -35, -16, -20, -104, -34, -22, -39, -27, -35, -90, -59, -29, -16, -16, -15, -10, -94, -27, -29, -18, -18, -94, -10, -22, -21, -11, -94, -17, -25, -10, -22, -15, -26, -94, -7, -22, -21, -18, -25, -94, -44, -25, -27, -5, -27, -18, -25, -12, -40, -21, -25, -7, -94, -21, -11, -94, -27, -15, -17, -14, -9, -10, -21, -16, -23, -94, -29, -94, -18, -29, -5, -15, -9, -10, -94, -15, -12, -94, -11, -27, -12, -15, -18, -18, -21, -16, -23, -52, -22, -9, -9, -8, -3, -87, -17, -11, -14, -9, -16, -87, 0, -14, -3, -15, -8, -2, -3, -87, -22, -87, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, -4, -18, -3, -73, -87, -52, -22, -11, -11, -87, -4, -18, -3, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, 0, -14, -3, -15, -87, -22, -87, -9, -8, -9, -74, -9, -2, -11, -11, -87, -22, -5, -16, -2, -10, -18, -9, -3, -73, 106, -120, -107, -107, -106, -101, 71, -102, -118, -103, -106, -109, -109, 71, -101, -106, 71, -105, -106, -102, -112, -101, -112, -106, -107, 71, -120, 71, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -102, -116, -101, 85, 71, 106, -120, -109, -109, 71, -102, -116, -101, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -98, -112, -101, -113, 71, -120, 71, -107, -106, -107, 84, -107, -100, -109, -109, 71, -120, -103, -114, -100, -108, -116, -107, -101, 85, -114, -84, -71, -71, -70, -65, 107, -66, -82, -67, -70, -73, -73, 107, -62, -76, -65, -77, -70, -64, -65, 107, -84, 107, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -66, -80, -65, 121, 107, -114, -84, -73, -73, 107, -66, -80, -65, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -62, -76, -65, -77, 107, -84, 107, -71, -70, -71, 120, -71, -64, -73, -73, 107, -84, -67, -78, -64, -72, -80, -71, -65, 121, -43, -13, 0, 0, 1, 6, -78, 5, -1, 1, 1, 6, -6, -78, 5, -11, 4, 1, -2, -2, -78, 9, -5, 6, -6, 1, 7, 6, -78, -13, -78, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 5, -9, 6, -64, -78, -43, -13, -2, -2, -78, 5, -9, 6, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 9, -5, 6, -6, 
        -78, -13, -78, 0, 1, 0, -65, 0, 7, -2, -2, -78, -13, 4, -7, 7, -1, -9, 0, 6, -64, 96, -117, 60, -118, -117, -112, 60, -113, -127, -112, 104, 125, -107, -117, -111, -112, 98, -114, -117, -106, -127, -118, 60, -123, -118, 60, -120, 125, -107, -117, -111, -112, 60, -117, -114, 60, -113, AbstractJsonLexerKt.TC_INVALID, -114, -117, -120, -120, -94, -49, -49, -52, -49, 125, -51, -49, -52, -64, -62, -48, -48, -58, -53, -60, 125, -48, -64, -49, -52, -55, -55, -104, 125, -51, -52, -58, -53, -47, -62, -49, 125, -58, -53, -63, -62, -43, 125, -61, -52, -49, 125, -58, -63, 125, -111, -90, -66, -76, -70, -71, -110, -90, -77, -90, -84, -86, -73, 101, 119, -104, 73, -118, -115, -118, -103, -99, -114, -101, 73, -118, -99, -99, -118, -116, -111, -114, -115, 100, 73, -100, -108, -110, -103, -103, -110, -105, -112, 73, -107, -118, -94, -104, -98, -99, 110, -113, 64, -116, -127, -103, -113, -107, -108, 64, -115, -127, -114, -127, -121, -123, -110, 64, -127, -108, -108, -127, -125, -120, -123, -124, 91, 64, -109, -117, -119, -112, -112, -119, -114, -121, 64, -116, -127, -103, -113, -107, -108, -98, -64, -67, -80, -70, -77, -69, 110, -59, -74, -73, -70, -77, 110, -69, -81, -62, -79, -74, -73, -68, -75, 110, -79, -74, -81, -68, -75, -77, -78, 110, -60, -73, -77, -59, 110, -74, -67, -70, -78, -77, -64, -63, 110, -59, -73, -62, -74, 110, -62, -74, -77, 110, -68, -77, -59, -67, -68, -77, -63, 124, 110, -94, -74, -77, 110, -66, -64, -77, 123, -70, -81, -57, -67, -61, -62, 110, -73, -68, -76, -67, -64, -69, -81, -62, -73, -67, -68, 110, -76, -67, -64, 110, -62, -74, -77, 110, -79, -74, -81, -68, -75, -77, 110, -74, -67, -70, -78, -77, -64, 110, -84, -80, 122, -96, -49, -58, -58, -93, -56, -48, -69, -58, -61, -66, -69, -50, -65, -113, -109, 93, -116, -85, -119, -98, -74, -84, -78, -79, -103, -99, 103, -105, -88, -71, -69, -80, -88, -77, -112, -75, -67, -88, -77, -80, -85, -88, -69, -84, -96, -92, 110, -95, -79, -64, -67, -70, -70, -108, -89, -91, -69, -91, -82, -89, -76, -104, -85, -89, -71, -90, -71, -73, -51, -73, -64, -71, -58, -86, -67, -71, -53, 116, -72, -61, -71, -57, 116, -62, -61, -56, 116, -57, -55, -60, -60, -61, -58, -56, 116, -57, -73, -58, -61, -64, -64, -67, -62, -69, 116, -56, -61, 116, -75, -62, 116, -75, -74, -57, -61, -64, -55, -56, -71, 116, -60, -61, -57, -67, -56, -67, -61, -62, -126, 116, -87, -57, -71, 116, -57, -73, -58, -61, -64, -64, -88, -61, -92, -61, -57, -67, -56, -67, -61, -62, 116, -67, -62, -57, -56, -71, -75, -72, -88, -69, -71, -49, -71, -62, -69, -56, -84, -65, -69, -51, 118, -66, -73, -55, 118, -60, -59, 118, -94, -73, -49, -59, -53, -54, -93, -73, -60, -73, -67, -69, -56, -102, -67, -75, 102, -86, -81, -84, -84, -85, -72, -85, -76, -70, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, -71, 102, -82, -89, -68, -85, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -87, -82, -89, -76, -83, -85, 102, -113, -118, 116, 102, -102, -82, -81, -71, 102, -77, -81, -83, -82, -70, 102, -82, -89, -74, -74, -85, -76, 102, -86, -69, -85, 102, -70, -75, 102, -81, -76, -87, -75, -76, -71, -81, -71, -70, -85, -76, -70, 102, -121, -86, -89, -74, -70, -85, -72, 102, -69, -74, -86, -89, -70, -85, 102, -85, -68, -85, -76, -70, -71, 102, -75, -72, 102, -81, -84, 102, -70, -82, -85, 102, -110, -89, -65, -75, -69, -70, -109, -89, -76, -89, -83, -85, -72, 102, -78, -89, -65, -71, 102, -75, -69, -70, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -100, -81, -85, -67, 102, -77, -69, -78, -70, -81, -74, -78, -85, 102, -70, -81, -77, -85, -71, 116, 80, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, 102, 119, -128, 126, -95, -103, 74, -114, -109, -112, -112, -113, -100, -113, -104, -98, 74, -128, -109, -113, -95, 114, -103, -106, -114, -113, -100, -99, 74, -110, -117, -96, -113, 74, -98, -110, -113, 74, -99, -117, -105, -113, 74, -99, -98, -117, -116, -106, -113, 74, 115, 110, 88, 74, 125, -98, -117, -116, -106, -113, 74, 115, 110, -99, 74, -109, -104, 74, -93, -103, -97, -100, 74, -117, -114, -117, -102, -98, -113, -100, 74, 119, AbstractJsonLexerKt.TC_INVALID, 125, 126, 74, 108, 111, 74, -97, -104, -109, -101, -97, -113, 74, -117, -104, -114, 74, 125, 114, 121, AbstractJsonLexerKt.TC_INVALID, 118, 110, 74, 120, 121, 126, 74, -115, -110, -117, -104, -111, -113, 88, 52, 74, -128, -109, -113, -95, 114, -103, -106, -114, -113, -100, 74, 91, 100, -102, -83, -87, -69, 100, -111, -109, -109, -107, -93, -93, -103, -110, -103, -100, -103, -92, -87, -44, -39, -30, -43, -45, -28, -39, -33, -34, -112, -35, -27, -29, -28, -112, -46, -43, -112, -47, -46, -29, -33, -36, -27, -28, -43, -98, -112, -30, -43, -45, -43, -39, -26, -43, -44, -86, -14, -16, -1, -44, -1, -16, -8, -38, -15, -15, -2, -16, -1, -2, -51, -52, -95, -58, -57, -54, -62, -76, -57, -61, -43, -97, -46, -46, -65, -63, -58, -61, -62, -78, -51, -75, -57, -52, -62, -51, -43, -78, -79, -122, -85, -84, -81, -89, -103, -84, -88, -70, -121, -88, -73, -92, -90, -85, -88, -89, -119, -75, -78, -80, -102, -84, -79, -89, -78, -70, -102, -103, 114, -112, -97, 110, -109, -108, -105, -113, 111, -99, -116, -94, -108, -103, -110, 122, -99, -113, -112, -99, -72, -73, -110, -73, -67, -82, -69, -84, -82, -71, -67, -99, -72, -66, -84, -79, -114, -65, -82, -73, -67, -16, -30, -15, -48, -32, -17, 
        -20, -23, -23, -26, -21, -28, -47, -20, -14, -32, -27, -48, -23, -20, -19, -91, -90, -73, -99, -33, -34, -31, -99, -34, -17, -28, -14, -22, -30, -21, -15, -99, -32, -20, -21, -16, -15, -34, -21, -15, -99};
    }

    static {
        A0W();
        A1I = new int[]{R.attr.nestedScrollingEnabled};
        A1H = new int[]{R.attr.clipToPadding};
        A1C = false;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = true;
        A1E = true;
        A1F = false;
        A1G = false;
        Class<?> cls = Integer.TYPE;
        A1J = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1A = new QB();
    }

    public C09846g(Context context) {
        this(context, null);
    }

    public C09846g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C09846g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A11 = new C2103g4(this);
        this.A0r = new QW(this);
        this.A0t = new C1492Qo();
        this.A0u = new Q9(this);
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new C09876j();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new RunnableC1483Qf(this);
        this.A02 = A1E ? new C2118gJ() : null;
        this.A0s = new C1481Qd();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new C2106g7(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new QA(this);
        this.A12 = new C2109gA(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i10, 0);
            this.A0B = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = P4.A00(viewConfiguration, context);
        this.A0M = P4.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0J(this.A0f);
        A0e();
        A0O();
        if (P3.A00(this) == 0) {
            P3.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0I(1831, 13, 21));
        setAccessibilityDelegateCompat(new C2101g1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id2 = view.getId();
        while (true) {
            boolean zIsFocused = view.isFocused();
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int iCharAt = str.charAt(14);
            int lastKnownId = str2.charAt(14);
            if (iCharAt == lastKnownId) {
                throw new RuntimeException();
            }
            A19[1] = "skNAKCm7G9cheB5S1YDp1BKl7DhhyUWu";
            if (zIsFocused || !(view instanceof ViewGroup) || !view.hasFocus()) {
                break;
            }
            view = ((ViewGroup) view).getFocusedChild();
            int id3 = view.getId();
            if (id3 != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private final long A0C(AbstractC1484Qg abstractC1484Qg) {
        return this.A04.A0M() ? abstractC1484Qg.A0Q() : abstractC1484Qg.A03;
    }

    private View A0D() {
        AbstractC1484Qg abstractC1484QgA1F;
        int i10 = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int iA03 = this.A0s.A03();
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[0] = "7qfeZgEkVtoAThUnrGXSh94SPjREp60d";
        strArr[6] = "LKFRBKGk6g3UCUNb2omEsqPfgI9kqX1N";
        for (int startFocusSearchIndex = i10; startFocusSearchIndex < iA03; startFocusSearchIndex++) {
            AbstractC1484Qg abstractC1484QgA1F2 = A1F(startFocusSearchIndex);
            if (abstractC1484QgA1F2 == null) {
                break;
            }
            if (abstractC1484QgA1F2.A0H.hasFocusable()) {
                return abstractC1484QgA1F2.A0H;
            }
        }
        int startFocusSearchIndex2 = Math.min(iA03, i10);
        for (int limit = startFocusSearchIndex2 - 1; limit >= 0 && (abstractC1484QgA1F = A1F(limit)) != null; limit--) {
            if (abstractC1484QgA1F.A0H.hasFocusable()) {
                return abstractC1484QgA1F.A0H;
            }
        }
        return null;
    }

    private final AbstractC1484Qg A0E(long j10) {
        if (this.A04 == null || !this.A04.A0M()) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC1484Qg abstractC1484Qg = null;
        for (int i10 = 0; i10 < iA06; i10++) {
            AbstractC1484Qg holder = A0F(this.A01.A0A(i10));
            if (holder != null && !holder.A0g() && holder.A0Q() == j10) {
                if (this.A01.A0K(holder.A0H)) {
                    abstractC1484Qg = holder;
                } else {
                    return holder;
                }
            }
        }
        return abstractC1484Qg;
    }

    public static AbstractC1484Qg A0F(View view) {
        if (view == null) {
            return null;
        }
        return ((QP) view.getLayoutParams()).A00;
    }

    private final AbstractC1484Qg A0G(View view) {
        View itemView = A1E(view);
        if (itemView == null) {
            return null;
        }
        return A1I(itemView);
    }

    private void A0J() {
        A0T();
        setScrollState(0);
    }

    private void A0K() {
        int i10 = this.A0P;
        this.A0P = 0;
        if (i10 != 0 && A1q()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            PM.A01(event, i10);
            sendAccessibilityEventUnchecked(event);
        }
    }

    private void A0L() {
        this.A0s.A04(1);
        A1j(this.A0s);
        this.A0s.A0A = false;
        A1L();
        this.A0t.A06();
        A1M();
        A0P();
        A0U();
        this.A0s.A0E = this.A0s.A0C && this.A0H;
        this.A0H = false;
        this.A0G = false;
        this.A0s.A09 = this.A0s.A0B;
        this.A0s.A03 = this.A04.A0B();
        A0x(this.A14);
        if (this.A0s.A0C) {
            int iA05 = this.A01.A05();
            for (int i10 = 0; i10 < iA05; i10++) {
                AbstractC1484Qg holder = A0F(this.A01.A09(i10));
                if (!holder.A0l() && (!holder.A0f() || this.A04.A0M())) {
                    QK qk2 = this.A05;
                    C1481Qd c1481Qd = this.A0s;
                    int i11 = QK.A06(holder);
                    this.A0t.A0F(holder, qk2.A0F(c1481Qd, holder, i11, holder.A0R()));
                    if (this.A0s.A0E && holder.A0j() && !holder.A0g() && !holder.A0l() && !holder.A0f()) {
                        this.A0t.A08(A0C(holder), holder);
                    }
                }
            }
        }
        if (this.A0s.A0B) {
            A0i();
            boolean z10 = this.A0s.A0D;
            this.A0s.A0D = false;
            this.A06.A1w(this.A0r, this.A0s);
            this.A0s.A0D = z10;
            for (int i12 = 0; i12 < this.A01.A05(); i12++) {
                AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A09(i12));
                boolean didStructureChange = abstractC1484QgA0F.A0l();
                if (!didStructureChange) {
                    boolean didStructureChange2 = this.A0t.A0I(abstractC1484QgA0F);
                    if (!didStructureChange2) {
                        int iA06 = QK.A06(abstractC1484QgA0F);
                        boolean zA0o = abstractC1484QgA0F.A0o(Segment.SIZE);
                        if (!zA0o) {
                            iA06 |= 4096;
                        }
                        QJ qjA0F = this.A05.A0F(this.A0s, abstractC1484QgA0F, iA06, abstractC1484QgA0F.A0R());
                        if (zA0o) {
                            A1k(abstractC1484QgA0F, qjA0F);
                        } else {
                            this.A0t.A0D(abstractC1484QgA0F, qjA0F);
                        }
                    }
                }
            }
            A0X();
        } else {
            A0X();
        }
        A1N();
        A1p(false);
        this.A0s.A04 = 2;
    }

    private void A0M() {
        A1L();
        A1M();
        this.A0s.A04(6);
        this.A00.A07();
        this.A0s.A03 = this.A04.A0B();
        this.A0s.A00 = 0;
        this.A0s.A09 = false;
        this.A06.A1w(this.A0r, this.A0s);
        this.A0s.A0D = false;
        this.A0j = null;
        this.A0s.A0C = this.A0s.A0C && this.A05 != null;
        this.A0s.A04 = 4;
        A1N();
        A1p(false);
    }

    private void A0O() {
        this.A01 = new C1464Pm(new C2108g9(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0P() {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C09846g.A0P():void");
    }

    private void A0Q() {
        View viewToFocus;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            AbstractC1484Qg abstractC1484QgA0E = null;
            long j10 = this.A0s.A08;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "kf1DBtA0T6eQEv5OJ0aXYpUf8VxTHKxU";
            if (j10 != -1 && this.A04.A0M()) {
                abstractC1484QgA0E = A0E(this.A0s.A08);
            }
            View viewA0D = null;
            if (abstractC1484QgA0E == null || this.A01.A0K(abstractC1484QgA0E.A0H) || !abstractC1484QgA0E.A0H.hasFocusable()) {
                if (this.A01.A05() > 0) {
                    viewA0D = A0D();
                }
            } else {
                viewA0D = abstractC1484QgA0E.A0H;
            }
            if (viewA0D != null) {
                if (this.A0s.A02 != -1 && (viewToFocus = viewA0D.findViewById(this.A0s.A02)) != null && viewToFocus.isFocusable()) {
                    viewA0D = viewToFocus;
                }
                viewA0D.requestFocus();
            }
        }
    }

    private void A0R() {
        boolean zIsFinished = false;
        if (this.A0a != null) {
            this.A0a.onRelease();
            zIsFinished = this.A0a.isFinished();
        }
        if (this.A0c != null) {
            this.A0c.onRelease();
            boolean needsInvalidate = this.A0c.isFinished();
            zIsFinished |= needsInvalidate;
        }
        if (this.A0b != null) {
            this.A0b.onRelease();
            boolean needsInvalidate2 = this.A0b.isFinished();
            zIsFinished |= needsInvalidate2;
        }
        EdgeEffect edgeEffect = this.A0Z;
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[4] = "DUYzAwLS0Yoz3H0mkub2uXfjKU6irrBR";
        strArr[5] = "haWSXRvp1CmnNAQfK1MdvfBgKkr4J9QQ";
        if (edgeEffect != null) {
            this.A0Z.onRelease();
            boolean needsInvalidate3 = this.A0Z.isFinished();
            zIsFinished |= needsInvalidate3;
        }
        if (zIsFinished) {
            P3.A07(this);
        }
    }

    private void A0S() {
        this.A0s.A08 = -1L;
        this.A0s.A01 = -1;
        this.A0s.A02 = -1;
    }

    private void A0T() {
        if (this.A0Y != null) {
            this.A0Y.clear();
        }
        A1Z(0);
        A0R();
    }

    private void A0U() {
        int iA0M;
        View focusedChild = null;
        if (this.A0o && hasFocus()) {
            QC qc2 = this.A04;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[7] = CampaignEx.CLICKMODE_ON;
            if (qc2 != null) {
                focusedChild = getFocusedChild();
            }
        }
        AbstractC1484Qg abstractC1484QgA0G = focusedChild == null ? null : A0G(focusedChild);
        if (abstractC1484QgA0G == null) {
            A0S();
            return;
        }
        this.A0s.A08 = this.A04.A0M() ? abstractC1484QgA0G.A0Q() : -1L;
        C1481Qd c1481Qd = this.A0s;
        if (this.A0C) {
            iA0M = -1;
        } else {
            iA0M = abstractC1484QgA0G.A0g() ? abstractC1484QgA0G.A01 : abstractC1484QgA0G.A0M();
        }
        c1481Qd.A01 = iA0M;
        C1481Qd c1481Qd2 = this.A0s;
        View child = abstractC1484QgA0G.A0H;
        c1481Qd2.A02 = A0B(child);
    }

    private void A0V() {
        this.A08.A08();
        if (this.A06 != null) {
            this.A06.A0z();
        }
    }

    private final void A0X() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A0A(i10));
            if (!abstractC1484QgA0F.A0l()) {
                abstractC1484QgA0F.A0S();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Y() {
        QC qc2 = this.A04;
        String strA0I = A0I(1370, 12, 39);
        if (qc2 == null) {
            Log.e(strA0I, A0I(1123, 36, 14));
            return;
        }
        if (this.A06 == null) {
            Log.e(strA0I, A0I(1159, 43, 5));
            return;
        }
        this.A0s.A0A = false;
        if (this.A0s.A04 == 1) {
            A0L();
            this.A06.A1Q(this);
            A0M();
        } else if (this.A00.A0C() || this.A06.A0j() != getWidth() || this.A06.A0Z() != getHeight()) {
            this.A06.A1Q(this);
            A0M();
        } else {
            this.A06.A1Q(this);
        }
        A0N();
    }

    private final void A0Z() {
        int state;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            AbstractC1484Qg abstractC1484Qg = this.A0w.get(size);
            if (abstractC1484Qg.A0H.getParent() == this && !abstractC1484Qg.A0l() && (state = abstractC1484Qg.A02) != -1) {
                P3.A09(abstractC1484Qg.A0H, state);
                abstractC1484Qg.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0a() {
        if (this.A0Z != null) {
            return;
        }
        this.A0Z = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0Z.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.A0Z.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0b() {
        if (this.A0a != null) {
            return;
        }
        this.A0a = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.A0a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0c() {
        if (this.A0b != null) {
            return;
        }
        this.A0b = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0b.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        EdgeEffect edgeEffect = this.A0b;
        int measuredHeight = getMeasuredHeight();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[1] = "cbkJKTW5fmkF4V5GELAthVoRFDIiLVou";
        edgeEffect.setSize(measuredHeight, getMeasuredWidth());
    }

    private final void A0d() {
        if (this.A0c != null) {
            return;
        }
        this.A0c = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        EdgeEffect edgeEffect = this.A0c;
        int measuredWidth = getMeasuredWidth();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[7] = "g";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0e() {
        this.A00 = new C2121gM(new C2107g8(this));
    }

    private final void A0f() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0g() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            ((QP) this.A01.A0A(i10).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0h() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A0A(i10));
            if (abstractC1484QgA0F != null && !abstractC1484QgA0F.A0l()) {
                abstractC1484QgA0F.A0Z(6);
            }
        }
        A0g();
        this.A0r.A0N();
    }

    private final void A0i() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A0A(i10));
            if (!abstractC1484QgA0F.A0l()) {
                abstractC1484QgA0F.A0X();
            }
        }
    }

    private void A0j(float f10, float f11, float f12, float f13) {
        boolean z10 = false;
        if (f11 < 0.0f) {
            A0b();
            AbstractC1455Pd.A00(this.A0a, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
            z10 = true;
        } else if (f11 > 0.0f) {
            A0c();
            AbstractC1455Pd.A00(this.A0b, f11 / getWidth(), f12 / getHeight());
            z10 = true;
        }
        if (f13 < 0.0f) {
            A0d();
            AbstractC1455Pd.A00(this.A0c, (-f13) / getHeight(), f10 / getWidth());
            z10 = true;
        } else if (f13 > 0.0f) {
            A0a();
            AbstractC1455Pd.A00(this.A0Z, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            z10 = true;
        }
        if (!z10 && f11 == 0.0f) {
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SiLEOgLe53s9c6khchOb02AHEH0FRuha";
            strArr[6] = "5HcivrXWoCNvsp5G28hhclxyRqnGBHgf";
            if (f13 == 0.0f) {
                return;
            }
        }
        P3.A07(this);
    }

    private final void A0k(int i10) {
        QO qo2 = this.A06;
        if (this.A0i != null) {
            this.A0i.A0L(this, i10);
        }
        if (this.A0m != null) {
            for (int size = this.A0m.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i10);
                String[] strArr = A19;
                String str = strArr[3];
                String str2 = strArr[2];
                int iCharAt = str.charAt(2);
                int i11 = str2.charAt(2);
                if (iCharAt == i11) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[4] = "wNO3zluUeYau1J5tWYXYTZjLKyZssSra";
                strArr2[5] = "exw9q3ETOdRCiu35xcNaFWLlKD0n1alI";
            }
        }
    }

    private final void A0l(int i10, int i11, Interpolator interpolator) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
            return;
        }
        if (this.A0I) {
            return;
        }
        if (!this.A06.A22()) {
            i10 = 0;
        }
        boolean zA23 = this.A06.A23();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        A19[1] = "Tqmtltgb2GXtzJ5pgFbL4REJzj4lGX6R";
        if (!zA23) {
            i11 = 0;
        }
        if (i10 != 0 || i11 != 0) {
            this.A08.A0D(i10, i11, interpolator);
        }
    }

    private void A0m(long j10, AbstractC1484Qg abstractC1484Qg, AbstractC1484Qg abstractC1484Qg2) {
        int iA05 = this.A01.A05();
        for (int i10 = 0; i10 < iA05; i10++) {
            AbstractC1484Qg other = A0F(this.A01.A09(i10));
            if (other != abstractC1484Qg && A0C(other) == j10) {
                QC qc2 = this.A04;
                String[] strArr = A19;
                String str = strArr[0];
                String str2 = strArr[6];
                int i11 = str.charAt(14);
                int childCount = str2.charAt(14);
                if (i11 == childCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[3] = "juwPw4JUkqCkrA4IuHnNpcgybF39inA5";
                strArr2[2] = "0NBeszRVzWCIaFL2RR4GryyHu33afAAx";
                String strA0I = A0I(1, 17, 9);
                if (qc2 != null && this.A04.A0M()) {
                    throw new IllegalStateException(A0I(1696, 130, 15) + other + strA0I + abstractC1484Qg + A1J());
                }
                throw new IllegalStateException(A0I(1508, 188, 43) + other + strA0I + abstractC1484Qg + A1J());
            }
        }
        Log.e(A0I(1370, 12, 39), A0I(InterfaceC3129ae.a.f35978c, 111, 51) + abstractC1484Qg2 + A0I(18, 41, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) + abstractC1484Qg + A1J());
    }

    private void A0n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionIndex2 = this.A0V;
        if (pointerId != actionIndex2) {
            return;
        }
        int i10 = actionIndex == 0 ? 1 : 0;
        int actionIndex3 = motionEvent.getPointerId(i10);
        this.A0V = actionIndex3;
        int actionIndex4 = (int) (motionEvent.getX(i10) + 0.5f);
        this.A0S = actionIndex4;
        this.A0Q = actionIndex4;
        int actionIndex5 = (int) (motionEvent.getY(i10) + 0.5f);
        this.A0T = actionIndex5;
        this.A0R = actionIndex5;
    }

    public static void A0o(View view, Rect rect) {
        QP qp2 = (QP) view.getLayoutParams();
        Rect rect2 = qp2.A03;
        rect.set((view.getLeft() - rect2.left) - qp2.leftMargin, (view.getTop() - rect2.top) - qp2.topMargin, view.getRight() + rect2.right + qp2.rightMargin, view.getBottom() + rect2.bottom + qp2.bottomMargin);
    }

    private void A0p(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof QP) {
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            A19[1] = "MS6MXnJil8kPq55ThMmX90CfGz9dq6Ir";
            QP qp2 = (QP) layoutParams;
            if (!qp2.A01) {
                Rect insets = qp2.A03;
                this.A0p.left -= insets.left;
                this.A0p.right += insets.right;
                this.A0p.top -= insets.top;
                this.A0p.bottom += insets.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1c(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0q(QC qc2, boolean z10, boolean z11) {
        if (this.A04 != null) {
            this.A04.A0I(this.A11);
            this.A04.A0L(this);
        }
        if (!z10 || z11) {
            A1P();
        }
        this.A00.A09();
        QC qc3 = this.A04;
        this.A04 = qc2;
        if (qc2 != null) {
            qc2.A0H(this.A11);
        }
        QO qo2 = this.A06;
        QW qw2 = this.A0r;
        QC oldAdapter = this.A04;
        qw2.A0U(qc3, oldAdapter, z10);
        this.A0s.A0D = true;
        A1R();
    }

    private void A0r(AbstractC1484Qg abstractC1484Qg) {
        View view = abstractC1484Qg.A0H;
        boolean z10 = view.getParent() == this;
        this.A0r.A0Y(A1I(view));
        boolean zA0i = abstractC1484Qg.A0i();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "TiCmVlWwgQ6VOJfmkNnlNNx0y9AVJwa2";
        strArr2[2] = "F9jx2AB6s4oeG4sqKvJHQ7CgJaKOJBvs";
        if (zA0i) {
            this.A01.A0H(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0s(AbstractC1484Qg abstractC1484Qg) {
        if (abstractC1484Qg.A09 != null) {
            C09846g c09846g = abstractC1484Qg.A09.get();
            while (c09846g != null) {
                View item = abstractC1484Qg.A0H;
                if (c09846g == item) {
                    return;
                }
                Object parent = c09846g.getParent();
                if (parent instanceof View) {
                    c09846g = (View) parent;
                } else {
                    c09846g = null;
                }
            }
            abstractC1484Qg.A09 = null;
        }
    }

    private void A0t(AbstractC1484Qg abstractC1484Qg, AbstractC1484Qg abstractC1484Qg2, QJ qj2, QJ qj3, boolean z10, boolean z11) {
        abstractC1484Qg.A0d(false);
        if (z10) {
            A0r(abstractC1484Qg);
        }
        if (abstractC1484Qg != abstractC1484Qg2) {
            if (z11) {
                A0r(abstractC1484Qg2);
            }
            abstractC1484Qg.A06 = abstractC1484Qg2;
            A0r(abstractC1484Qg);
            this.A0r.A0Y(abstractC1484Qg);
            abstractC1484Qg2.A0d(false);
            abstractC1484Qg2.A07 = abstractC1484Qg;
        }
        if (this.A05.A0R(abstractC1484Qg, abstractC1484Qg2, qj2, qj3)) {
            A1O();
        }
    }

    private void A0x(int[] iArr) {
        int iA05 = this.A01.A05();
        if (iA05 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int maxPositionPreLayout = Integer.MAX_VALUE;
        int minPositionPreLayout = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < iA05; i10++) {
            AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A09(i10));
            if (!abstractC1484QgA0F.A0l()) {
                int count = abstractC1484QgA0F.A0O();
                if (count < maxPositionPreLayout) {
                    maxPositionPreLayout = count;
                }
                if (count > minPositionPreLayout) {
                    minPositionPreLayout = count;
                }
            }
        }
        iArr[0] = maxPositionPreLayout;
        iArr[1] = minPositionPreLayout;
    }

    private boolean A0y() {
        int iA05 = this.A01.A05();
        for (int i10 = 0; i10 < iA05; i10++) {
            AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A09(i10));
            if (abstractC1484QgA0F != null && !abstractC1484QgA0F.A0l()) {
                boolean zA0j = abstractC1484QgA0F.A0j();
                int i11 = A19[7].length();
                if (i11 != 1) {
                    throw new RuntimeException();
                }
                A19[1] = "5mbkKWt0hxhFdp5kkkYwhOUPEf80vh4b";
                if (zA0j) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean A0z() {
        return this.A05 != null && this.A06.A24();
    }

    private boolean A11(int i10, int i11) {
        A0x(this.A14);
        return (this.A14[0] == i10 && this.A14[1] == i11) ? false : true;
    }

    private final boolean A12(int i10, int i11) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(651, 89, 110));
            return false;
        }
        if (this.A0I) {
            return false;
        }
        boolean zA22 = this.A06.A22();
        boolean canScroll = this.A06.A23();
        if (!zA22 || Math.abs(i10) < this.A0y) {
            i10 = 0;
        }
        if (!canScroll || Math.abs(i11) < this.A0y) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "ReiKJWWZUipUJIZKdTnth4O85KfdJzFe";
        strArr2[2] = "VE75UicjWgpvWTg6gZrF4R3BQlGAuEv7";
        boolean canScrollHorizontal = dispatchNestedPreFling(f10, i11);
        if (!canScrollHorizontal) {
            boolean canScrollVertical = zA22 || canScroll;
            dispatchNestedFling(i10, i11, canScrollVertical);
            if (this.A0g != null) {
                boolean canScrollHorizontal2 = this.A0g.A0B(i10, i11);
                if (canScrollHorizontal2) {
                    return true;
                }
            }
            if (canScrollVertical) {
                int i12 = 0;
                if (zA22) {
                    i12 = 0 | 1;
                }
                if (canScroll) {
                    i12 |= 2;
                }
                A1u(i12, 1);
                int nestedScrollAxis = -this.A0x;
                int iMax = Math.max(nestedScrollAxis, Math.min(i10, this.A0x));
                int nestedScrollAxis2 = -this.A0x;
                this.A08.A09(iMax, Math.max(nestedScrollAxis2, Math.min(i11, this.A0x)));
                return true;
            }
        }
        return false;
    }

    private final boolean A13(int consumedX, int consumedY, MotionEvent motionEvent) {
        int i10 = 0;
        int i11 = 0;
        int iA1f = 0;
        int iA1g = 0;
        A1K();
        if (this.A04 != null) {
            A1L();
            A1M();
            OQ.A01(A0I(1361, 9, 51));
            A1j(this.A0s);
            if (consumedX != 0) {
                iA1f = this.A06.A1f(consumedX, this.A0r, this.A0s);
                i10 = consumedX - iA1f;
            }
            if (consumedY != 0) {
                iA1g = this.A06.A1g(consumedY, this.A0r, this.A0s);
                i11 = consumedY - iA1g;
            }
            OQ.A00();
            A1Q();
            A1N();
            A1p(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1v(iA1f, iA1g, i10, i11, this.A17, 0)) {
            this.A0S -= this.A17[0];
            this.A0T -= this.A17[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.A17[0], this.A17[1]);
            }
            int[] iArr = this.A15;
            iArr[0] = iArr[0] + this.A17[0];
            int[] iArr2 = this.A15;
            iArr2[1] = iArr2[1] + this.A17[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC1435Oj.A00(motionEvent, 8194)) {
                A0j(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            A1b(consumedX, consumedY);
        }
        if (iA1f != 0 || iA1g != 0) {
            A1d(iA1f, iA1g);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (iA1f == 0 && iA1g == 0) ? false : true;
    }

    private boolean A14(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (0 != 0) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int action2 = this.A13.size();
            if (0 < action2) {
                this.A13.get(0);
                throw new NullPointerException(A0I(1973, 21, 46));
            }
            return false;
        }
        return false;
    }

    private boolean A15(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A0h = null;
        }
        int action2 = this.A13.size();
        if (0 < action2) {
            this.A13.get(0);
            throw new NullPointerException(A0I(1973, 21, 46));
        }
        return false;
    }

    private boolean A16(View view, View view2, int i10) {
        int absHorizontal;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i10 == 2 || i10 == 1) {
            boolean z10 = this.A06.A0c() == 1;
            boolean rtl = i10 == 2;
            if (rtl ^ z10) {
                absHorizontal = 66;
            } else {
                absHorizontal = 17;
            }
            if (A17(view, view2, absHorizontal)) {
                return true;
            }
            if (i10 == 2) {
                return A17(view, view2, 130);
            }
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int iCharAt = str.charAt(14);
            int absHorizontal2 = str2.charAt(14);
            if (iCharAt == absHorizontal2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "Ohwc1756uTT166t9FAn6vugoi7AJfc0c";
            strArr2[2] = "5J1fVRqaKzeN2XjLKxMOi2uJr88KN7aK";
            return A17(view, view2, 33);
        }
        return A17(view, view2, i10);
    }

    private boolean A17(View view, View view2, int i10) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        switch (i10) {
            case 17:
                return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
            case 33:
                return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                return (this.A0p.left < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
            case 130:
                if (this.A0p.top >= this.A0z.top) {
                    Rect rect = this.A0p;
                    String[] strArr = A19;
                    if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[0] = "mOrDrwN7qo6GKKMJ6G3US4mLdoh2ETut";
                    strArr2[6] = "IWP4ZqDDS1db9pl2oaFrT53kmkniKDfl";
                    if (rect.bottom > this.A0z.top) {
                        return false;
                    }
                }
                return this.A0p.bottom < this.A0z.bottom;
            default:
                throw new IllegalArgumentException(A0I(1844, 37, 85) + i10 + A1J());
        }
    }

    private final boolean A18(AccessibilityEvent accessibilityEvent) {
        if (A1s()) {
            int iA00 = 0;
            if (accessibilityEvent != null) {
                iA00 = PM.A00(accessibilityEvent);
            }
            if (iA00 == 0) {
                iA00 = 0;
            }
            int type = this.A0P;
            this.A0P = type | iA00;
            return true;
        }
        return false;
    }

    public final int A1B(View view) {
        AbstractC1484Qg holder = A0F(view);
        if (holder != null) {
            return holder.A0O();
        }
        return -1;
    }

    public final int A1C(AbstractC1484Qg abstractC1484Qg) {
        if (abstractC1484Qg.A0o(IronSourceError.ERROR_PLACEMENT_CAPPED) || !abstractC1484Qg.A0e()) {
            return -1;
        }
        return this.A00.A05(abstractC1484Qg.A03);
    }

    public final Rect A1D(View view) {
        QP qp2 = (QP) view.getLayoutParams();
        if (!qp2.A01) {
            return qp2.A03;
        }
        if (this.A0s.A07()) {
            boolean zA01 = qp2.A01();
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "RfoZAoElzPqJKaUzlOfJ9JNtEQb3r4Q3";
            strArr[6] = "IQCpaJiMXE8HuUJ13qJ8cPkLmMUIWIfQ";
            if (zA01 || qp2.A03()) {
                return qp2.A03;
            }
        }
        Rect rect = qp2.A03;
        rect.set(0, 0, 0, 0);
        if (0 < this.A0v.size()) {
            this.A0p.set(0, 0, 0, 0);
            this.A0v.get(0);
            throw new NullPointerException(A0I(1881, 14, 112));
        }
        qp2.A01 = false;
        return rect;
    }

    public final View A1E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this) {
            boolean z10 = parent instanceof View;
            if (A19[7].length() == 1) {
                String[] strArr = A19;
                strArr[3] = "J9ctOc3byknHaiu8XEstSyzOEyaFCb7S";
                strArr[2] = "QOdc34hkOqsfpHVshThNFi46vThKtwkT";
                if (!z10) {
                    break;
                }
                view = parent;
                parent = view.getParent();
            } else {
                throw new RuntimeException();
            }
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final AbstractC1484Qg A1F(int i10) {
        if (this.A0C) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC1484Qg hidden = null;
        for (int i11 = 0; i11 < iA06; i11++) {
            AbstractC1484Qg abstractC1484QgA0F = A0F(this.A01.A0A(i11));
            if (abstractC1484QgA0F != null && !abstractC1484QgA0F.A0g()) {
                int childCount = A1C(abstractC1484QgA0F);
                if (childCount != i10) {
                    continue;
                } else if (this.A01.A0K(abstractC1484QgA0F.A0H)) {
                    hidden = abstractC1484QgA0F;
                } else {
                    return abstractC1484QgA0F;
                }
            }
        }
        return hidden;
    }

    public final AbstractC1484Qg A1G(int i10) {
        return A1H(i10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.AbstractC1484Qg A1H(int r9, boolean r10) {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.Pm r0 = r8.A01
            int r5 = r0.A06()
            r7 = 0
            r4 = 0
        L8:
            if (r4 >= r5) goto L57
            com.facebook.ads.redexgen.X.Pm r0 = r8.A01
            android.view.View r0 = r0.A0A(r4)
            com.facebook.ads.redexgen.X.Qg r3 = A0F(r0)
            if (r3 == 0) goto L22
            boolean r0 = r3.A0g()
            if (r0 != 0) goto L22
            if (r10 == 0) goto L25
            int r0 = r3.A03
            if (r0 == r9) goto L4a
        L22:
            int r4 = r4 + 1
            goto L8
        L25:
            int r6 = r3.A0O()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C09846g.A19
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L3b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C09846g.A19
            java.lang.String r1 = "DSFgyC6FMCN69yIuBkrrEJFcLDPwcLMd"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "g7Jt9Xl9pBIMUQLD2e0MPBENYY0SKHj8"
            r0 = 6
            r2[r0] = r1
            if (r6 == r9) goto L4a
            goto L22
        L4a:
            com.facebook.ads.redexgen.X.Pm r1 = r8.A01
            android.view.View r0 = r3.A0H
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L56
            r7 = r3
            goto L22
        L56:
            return r3
        L57:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C09846g.A1H(int, boolean):com.facebook.ads.redexgen.X.Qg");
    }

    public final AbstractC1484Qg A1I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0F(view);
        }
        throw new IllegalArgumentException(A0I(1826, 5, 41) + view + A0I(98, 26, 38) + this);
    }

    public final String A1J() {
        return A0I(0, 1, 23) + super.toString() + A0I(169, 10, 87) + this.A04 + A0I(PsExtractor.PRIVATE_STREAM_1, 9, 86) + this.A06 + A0I(179, 10, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1K() {
        /*
            r5 = this;
            boolean r3 = r5.A0D
            r2 = 1313(0x521, float:1.84E-42)
            r1 = 17
            r0 = 63
            java.lang.String r4 = A0I(r2, r1, r0)
            if (r3 == 0) goto L12
            boolean r0 = r5.A0C
            if (r0 == 0) goto L1c
        L12:
            com.facebook.ads.redexgen.core.OQ.A01(r4)
            r5.A0Y()
            com.facebook.ads.redexgen.core.OQ.A00()
            return
        L1c:
            com.facebook.ads.redexgen.X.gM r0 = r5.A00
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L25
            return
        L25:
            com.facebook.ads.redexgen.X.gM r3 = r5.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C09846g.A19
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C09846g.A19
            java.lang.String r1 = "cmOs2ngvAj3urs5G14jP2yS9Pox4PNUI"
            r0 = 1
            r2[r0] = r1
            r0 = 4
            boolean r0 = r3.A0D(r0)
            if (r0 == 0) goto Lb1
            com.facebook.ads.redexgen.X.gM r1 = r5.A00
            r0 = 11
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto Lb1
            r2 = 1341(0x53d, float:1.879E-42)
            r1 = 20
            r0 = 44
            java.lang.String r0 = A0I(r2, r1, r0)
            com.facebook.ads.redexgen.core.OQ.A01(r0)
            r5.A1L()
            r5.A1M()
            com.facebook.ads.redexgen.X.gM r0 = r5.A00
            r0.A08()
            boolean r0 = r5.A0J
            if (r0 != 0) goto L92
            boolean r3 = r5.A0y()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C09846g.A19
            r0 = 3
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La8
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C09846g.A19
            java.lang.String r1 = "a"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lab
        L8f:
            r5.A0Y()
        L92:
            r0 = 1
            r5.A1p(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C09846g.A19
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto Lc3
        La2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La8:
            if (r3 == 0) goto Lab
            goto L8f
        Lab:
            com.facebook.ads.redexgen.X.gM r0 = r5.A00
            r0.A06()
            goto L92
        Lb1:
            com.facebook.ads.redexgen.X.gM r0 = r5.A00
            boolean r0 = r0.A0B()
            if (r0 == 0) goto Ld5
            com.facebook.ads.redexgen.core.OQ.A01(r4)
            r5.A0Y()
            com.facebook.ads.redexgen.core.OQ.A00()
            goto Ld5
        Lc3:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C09846g.A19
            java.lang.String r1 = "rQ0jmwctWvIOIioOAlLcoJlzUDkcSysz"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "N5NmD2ge71vhim7LrdB83J9iYpsRCLkc"
            r0 = 2
            r2[r0] = r1
            r5.A1N()
            com.facebook.ads.redexgen.core.OQ.A00()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C09846g.A1K():void");
    }

    public final void A1L() {
        this.A0O++;
        if (this.A0O == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1M() {
        this.A0U++;
    }

    public final void A1N() {
        A1o(true);
    }

    public final void A1O() {
        if (!this.A0K && this.A0F) {
            P3.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1P() {
        if (this.A05 != null) {
            this.A05.A0H();
        }
        if (this.A06 != null) {
            this.A06.A1K(this.A0r);
            this.A06.A1I(this.A0r);
        }
        this.A0r.A0P();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1Q() {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.Pm r0 = r7.A01
            int r6 = r0.A05()
            r5 = 0
        L7:
            if (r5 >= r6) goto L41
            com.facebook.ads.redexgen.X.Pm r0 = r7.A01
            android.view.View r2 = r0.A09(r5)
            com.facebook.ads.redexgen.X.Qg r1 = r7.A1I(r2)
            if (r1 == 0) goto L3e
            com.facebook.ads.redexgen.X.Qg r0 = r1.A07
            if (r0 == 0) goto L3e
            com.facebook.ads.redexgen.X.Qg r0 = r1.A07
            android.view.View r4 = r0.A0H
            int r3 = r2.getLeft()
            int r2 = r2.getTop()
            int r0 = r4.getLeft()
            if (r3 != r0) goto L31
            int r0 = r4.getTop()
            if (r2 == r0) goto L3e
        L31:
            int r1 = r4.getWidth()
            int r1 = r1 + r3
            int r0 = r4.getHeight()
            int r0 = r0 + r2
            r4.layout(r3, r2, r1, r0)
        L3e:
            int r5 = r5 + 1
            goto L7
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C09846g.A1Q():void");
    }

    public final void A1R() {
        this.A0C = true;
        A0h();
    }

    public final void A1S() {
        if (this.A0m != null) {
            this.A0m.clear();
        }
    }

    public final void A1T() {
        setScrollState(0);
        A0V();
    }

    public final void A1U(int i10) {
        if (this.A06 == null) {
            return;
        }
        this.A06.A1r(i10);
        awakenScrollBars();
    }

    public final void A1V(int i10) {
        int iA05 = this.A01.A05();
        for (int i11 = 0; i11 < iA05; i11++) {
            this.A01.A09(i11).offsetLeftAndRight(i10);
        }
    }

    public final void A1W(int i10) {
        int iA05 = this.A01.A05();
        for (int i11 = 0; i11 < iA05; i11++) {
            this.A01.A09(i11).offsetTopAndBottom(i10);
        }
    }

    public final void A1X(int i10) {
        if (this.A0I) {
            return;
        }
        A1T();
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(740, 94, 12));
        } else {
            this.A06.A1r(i10);
            awakenScrollBars();
        }
    }

    public final void A1Y(int i10) {
        if (this.A0I) {
            return;
        }
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        } else {
            this.A06.A1z(this, this.A0s, i10);
        }
    }

    public final void A1Z(int i10) {
        getScrollingChildHelper().A03(i10);
    }

    public final void A1a(int i10, int i11) {
        if (i10 < 0) {
            A0b();
            this.A0a.onAbsorb(-i10);
        } else if (i10 > 0) {
            A0c();
            this.A0b.onAbsorb(i10);
        }
        if (i11 < 0) {
            A0d();
            this.A0c.onAbsorb(-i11);
        } else if (i11 > 0) {
            A0a();
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "Kq4j6FG7zvFvwW4vRC6zLjapwuK9WjkP";
            strArr2[6] = "2Xczf707pBdLKDJ5NVr429bRaPx31sq0";
            this.A0Z.onAbsorb(i11);
        }
        if (i10 != 0 || i11 != 0) {
            P3.A07(this);
        }
    }

    public final void A1b(int i10, int i11) {
        boolean zIsFinished = false;
        if (this.A0a != null) {
            boolean needsInvalidate = this.A0a.isFinished();
            if (!needsInvalidate && i10 > 0) {
                this.A0a.onRelease();
                zIsFinished = this.A0a.isFinished();
            }
        }
        if (this.A0b != null) {
            boolean needsInvalidate2 = this.A0b.isFinished();
            if (!needsInvalidate2 && i10 < 0) {
                this.A0b.onRelease();
                boolean needsInvalidate3 = this.A0b.isFinished();
                zIsFinished |= needsInvalidate3;
            }
        }
        EdgeEffect edgeEffect = this.A0c;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[0] = "hv7OcE78gRUWXZIBx5R2VkE7fvviVqXd";
        strArr2[6] = "NFDR0brV2INlGIZxgJE16fqqg8Mw1YR1";
        if (edgeEffect != null) {
            boolean needsInvalidate4 = this.A0c.isFinished();
            if (!needsInvalidate4 && i11 > 0) {
                this.A0c.onRelease();
                boolean needsInvalidate5 = this.A0c.isFinished();
                zIsFinished |= needsInvalidate5;
            }
        }
        if (this.A0Z != null) {
            boolean needsInvalidate6 = this.A0Z.isFinished();
            if (!needsInvalidate6 && i11 < 0) {
                this.A0Z.onRelease();
                boolean needsInvalidate7 = this.A0Z.isFinished();
                zIsFinished |= needsInvalidate7;
            }
        }
        if (zIsFinished) {
            P3.A07(this);
        }
    }

    public final void A1c(int i10, int i11) {
        int iA02 = QO.A02(i10, getPaddingLeft() + getPaddingRight(), P3.A03(this));
        int paddingTop = getPaddingTop();
        int width = getPaddingBottom();
        int i12 = paddingTop + width;
        int width2 = P3.A02(this);
        setMeasuredDimension(iA02, QO.A02(i11, i12, width2));
    }

    public final void A1d(int i10, int i11) {
        this.A0N++;
        int scrollY = getScrollX();
        int scrollX = getScrollY();
        onScrollChanged(scrollY, scrollX, scrollY, scrollX);
        if (this.A0i != null) {
            this.A0i.A0M(this, i10, i11);
        }
        if (this.A0m != null) {
            for (int scrollY2 = this.A0m.size() - 1; scrollY2 >= 0; scrollY2--) {
                this.A0m.get(scrollY2).A0M(this, i10, i11);
            }
        }
        this.A0N--;
    }

    public final void A1e(int i10, int i11) {
        A0l(i10, i11, null);
    }

    public final void A1f(View view) {
        int cnt;
        A0F(view);
        QC qc2 = this.A04;
        if (this.A0l != null && this.A0l.size() - 1 >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1895, 27, 67));
        }
    }

    public final void A1g(View view) {
        A0F(view);
        QC qc2 = this.A04;
        if (this.A0l != null) {
            List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "Ju6zs0r9efzkyV7LXILEyjCEKckziCxk";
            strArr2[5] = "xtNh9wS4idAx9IKZVnTROlGUKiewUtpM";
            int size = list.size() - 1;
            if (size >= 0) {
                this.A0l.get(size);
                throw new NullPointerException(A0I(1922, 29, 40));
            }
        }
    }

    public final void A1h(QT qt2) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(qt2);
    }

    public final void A1i(QT qt2) {
        if (this.A0m != null) {
            List<QT> list = this.A0m;
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "sOoQs3X4dS853ZpkNjZwaQi0LuRyF7Hc";
            strArr[2] = "YQ1nAsE5QOTVY911s6plJSU2g6bxQXkh";
            list.remove(qt2);
        }
    }

    public final void A1j(C1481Qd c1481Qd) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            c1481Qd.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            c1481Qd.A07 = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c1481Qd.A06 = 0;
            c1481Qd.A07 = 0;
        }
    }

    public final void A1k(AbstractC1484Qg abstractC1484Qg, QJ qj2) {
        abstractC1484Qg.A0a(0, Segment.SIZE);
        if (this.A0s.A0E) {
            boolean zA0j = abstractC1484Qg.A0j();
            if (A19[1].charAt(14) != '5') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SaiGfOi3tH24E262D5BQaQwya8XqTMou";
            strArr[6] = "ZNTGZnAbt95d53NkHsORUVfXJkKP7CFB";
            if (zA0j && !abstractC1484Qg.A0g() && !abstractC1484Qg.A0l()) {
                this.A0t.A08(A0C(abstractC1484Qg), abstractC1484Qg);
            }
        }
        this.A0t.A0F(abstractC1484Qg, qj2);
    }

    public final void A1l(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        abstractC1484Qg.A0d(false);
        if (this.A05.A0O(abstractC1484Qg, qj2, qj3)) {
            A1O();
        }
    }

    public final void A1m(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        A0r(abstractC1484Qg);
        abstractC1484Qg.A0d(false);
        if (this.A05.A0P(abstractC1484Qg, qj2, qj3)) {
            A1O();
        }
    }

    public final void A1n(String str) {
        if (A1s()) {
            if (str == null) {
                throw new IllegalStateException(A0I(574, 77, 103) + A1J());
            }
            throw new IllegalStateException(str);
        }
        if (this.A0N > 0) {
            Log.w(A0I(1370, 12, 39), A0I(294, 280, 93), new IllegalStateException(A0I(0, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + A1J()));
        }
    }

    public final void A1o(boolean z10) {
        this.A0U--;
        if (this.A0U < 1) {
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "VgsuIcXtp0FweJIL4JjeIuHXK9vcALAx";
            strArr2[5] = "AVlqmC2HCSNpSWUvoITeU6SwKS4OLgxH";
            this.A0U = 0;
            if (z10) {
                A0K();
                A0Z();
            }
        }
    }

    public final void A1p(boolean z10) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z10) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z10 && this.A0J) {
                boolean z11 = this.A0I;
                if (A19[1].charAt(14) != '5') {
                    throw new RuntimeException();
                }
                A19[7] = CampaignEx.JSON_KEY_AD_K;
                if (!z11 && this.A06 != null && this.A04 != null) {
                    A0Y();
                }
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1q() {
        return this.A10 != null && this.A10.isEnabled();
    }

    public final boolean A1r() {
        if (this.A0D) {
            boolean z10 = this.A0C;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[7] = "K";
            if (!z10 && !this.A00.A0B()) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1s() {
        return this.A0U > 0;
    }

    public final boolean A1t(int i10) {
        return getScrollingChildHelper().A09(i10);
    }

    public final boolean A1u(int i10, int i11) {
        return getScrollingChildHelper().A0B(i10, i11);
    }

    public final boolean A1v(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().A0D(i10, i11, i12, i13, iArr, i14);
    }

    public final boolean A1w(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().A0F(i10, i11, iArr, iArr2, i12);
    }

    public final boolean A1x(View view) {
        A1L();
        boolean zA0L = this.A01.A0L(view);
        if (zA0L) {
            AbstractC1484Qg viewHolder = A0F(view);
            this.A0r.A0Y(viewHolder);
            this.A0r.A0X(viewHolder);
        }
        boolean removed = !zA0L;
        A1p(removed);
        return zA0L;
    }

    public final boolean A1y(AbstractC1484Qg abstractC1484Qg) {
        return this.A05 == null || this.A05.A0S(abstractC1484Qg, abstractC1484Qg.A0R());
    }

    public final boolean A1z(AbstractC1484Qg abstractC1484Qg, int i10) {
        if (A1s()) {
            abstractC1484Qg.A02 = i10;
            this.A0w.add(abstractC1484Qg);
            return false;
        }
        P3.A09(abstractC1484Qg.A0H, i10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i10, int i11) {
        if (this.A06 == null || !this.A06.A1e(this, views, i10, i11)) {
            super.addFocusables(views, i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof QP) && this.A06.A1a((QP) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        if (this.A06 != null && this.A06.A22()) {
            return this.A06.A1h(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (this.A06 != null && this.A06.A22()) {
            return this.A06.A1i(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (this.A06 != null && this.A06.A22()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        if (this.A06 == null || !this.A06.A23()) {
            return 0;
        }
        QO qo2 = this.A06;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "OwG4fgggKq7icgaaysnCa6zBD064f6Q4";
        strArr2[2] = "UojYTgk0EBa2sJrZvEgoz68xRxvrHNBO";
        return qo2.A1k(this.A0s);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        if (this.A06 != null && this.A06.A23()) {
            return this.A06.A1l(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        if (this.A06 != null && this.A06.A23()) {
            return this.A06.A1m(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().A08(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().A07(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().A0C(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0199 A[PHI: r5
      0x0199: PHI (r5v4 'padding' int) = (r5v3 'padding' int), (r5v3 'padding' int), (r5v7 'padding' int) binds: [B:49:0x00e1, B:53:0x0108, B:74:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C09846g.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
    
        if (r4 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
    
        return super.focusSearch(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016c, code lost:
    
        if (r4 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016f, code lost:
    
        A0p(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0172, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C09846g.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.A06 != null) {
            return this.A06.A1q();
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1J());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.A06 != null) {
            return this.A06.A0x(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1J());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.A06 != null) {
            return this.A06.A0y(layoutParams);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1J());
    }

    public QC getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A06 != null) {
            return this.A06.A0X();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        if (0 == 0) {
            return super.getChildDrawingOrder(i10, i11);
        }
        throw new NullPointerException(A0I(1951, 22, 16));
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C2101g1 getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public QK getItemAnimator() {
        return this.A05;
    }

    public QO getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    public QR getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public QV getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C1437Ol getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C1437Ol(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z10 = true;
        this.A0F = true;
        if (!this.A0D || isLayoutRequested()) {
            z10 = false;
        }
        this.A0D = z10;
        if (this.A06 != null) {
            this.A06.A1P(this);
        }
        this.A0K = false;
        if (A1E) {
            this.A03 = RunnableC1477Pz.A07.get();
            RunnableC1477Pz runnableC1477Pz = this.A03;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "C0ehsoOGkHH4Yo5xO6QtGogVKP7uVX9B";
            strArr2[5] = "76wleFUxgdDs3CwSlu7sJ9vYK22l9wck";
            if (runnableC1477Pz == null) {
                this.A03 = new RunnableC1477Pz();
                Display displayA04 = P3.A04(this);
                float f10 = 60.0f;
                if (!isInEditMode() && displayA04 != null) {
                    float refreshRate = displayA04.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                this.A03.A00 = (long) (1.0E9f / f10);
                RunnableC1477Pz.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A05 != null) {
            this.A05.A0H();
        }
        A1T();
        this.A0F = false;
        if (this.A06 != null) {
            this.A06.A1S(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && this.A03 != null) {
            this.A03.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0v.get(i10);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float vScroll;
        float axisValue;
        if (this.A06 == null || this.A0I) {
            return false;
        }
        int action = motionEvent.getAction();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[4] = "SqJdYhJCWRyNUdRTYMkhoX0xKlvJTIzq";
        strArr2[5] = "dLZEV46oohOd8c5dsstKZ2mmKWuZBEje";
        if (action == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A23()) {
                    vScroll = -motionEvent.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.A06.A22()) {
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    axisValue = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.A06.A23()) {
                    vScroll = -axisValue;
                    axisValue = 0.0f;
                } else if (this.A06.A22()) {
                    vScroll = 0.0f;
                } else {
                    vScroll = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                axisValue = 0.0f;
            }
            if (vScroll != 0.0f || axisValue != 0.0f) {
                float hScroll = this.A0L;
                A13((int) (hScroll * axisValue), (int) (this.A0M * vScroll), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            return false;
        }
        if (A15(motionEvent)) {
            A0J();
            return true;
        }
        if (this.A06 == null) {
            return false;
        }
        boolean zA22 = this.A06.A22();
        boolean startScroll = this.A06.A23();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        this.A0Y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                boolean canScrollHorizontally = this.A0n;
                if (canScrollHorizontally) {
                    this.A0n = false;
                }
                this.A0V = motionEvent.getPointerId(0);
                int x10 = (int) (motionEvent.getX() + 0.5f);
                this.A0S = x10;
                this.A0Q = x10;
                int y10 = (int) (motionEvent.getY() + 0.5f);
                this.A0T = y10;
                this.A0R = y10;
                if (this.A0W == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    String[] strArr = A19;
                    if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                        String[] strArr2 = A19;
                        strArr2[4] = "M5UY6PcxpnTLVPVued5fx0ZBKGPv0DD6";
                        strArr2[5] = "epX9q1DqtqLsT3WNVlKQ1OkRKfkr8qoW";
                        setScrollState(1);
                    } else {
                        String[] strArr3 = A19;
                        strArr3[3] = "mz0Spg27ESm6n2CBfiNuhIq158jNl3XC";
                        strArr3[2] = "LXDJrUlN0pxLgDChp5qc6Quk8NcN491z";
                        setScrollState(1);
                    }
                }
                int[] iArr = this.A15;
                this.A15[1] = 0;
                iArr[0] = 0;
                int i10 = 0;
                if (zA22) {
                    i10 = 0 | 1;
                }
                if (startScroll) {
                    i10 |= 2;
                }
                A1u(i10, 0);
                break;
            case 1:
                this.A0Y.clear();
                A1Z(0);
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
                if (iFindPointerIndex >= 0) {
                    int index = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.A0W != 1) {
                        int i11 = index - this.A0Q;
                        int dy = y11 - this.A0R;
                        int dx2 = 0;
                        if (zA22) {
                            int x11 = Math.abs(i11);
                            int actionIndex2 = this.A0X;
                            if (A19[1].charAt(14) != '5') {
                                throw new RuntimeException();
                            }
                            A19[1] = "KTspDQ6S4I31ss5nDId9o94814z1kYXz";
                            if (x11 > actionIndex2) {
                                this.A0S = index;
                                dx2 = 1;
                            }
                        }
                        if (startScroll && Math.abs(dy) > this.A0X) {
                            this.A0T = y11;
                            dx2 = 1;
                        }
                        if (dx2 != 0) {
                            setScrollState(1);
                            break;
                        }
                    }
                } else {
                    Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 45, 102));
                    return false;
                }
                break;
            case 3:
                A0J();
                break;
            case 5:
                this.A0V = motionEvent.getPointerId(actionIndex);
                int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.A0S = x12;
                this.A0Q = x12;
                int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.A0T = y12;
                this.A0R = y12;
                break;
            case 6:
                A0n(motionEvent);
                break;
        }
        return this.A0W == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        OQ.A01(A0I(1330, 11, 34));
        A0Y();
        OQ.A00();
        this.A0D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.A06 == null) {
            A1c(i10, i11);
            return;
        }
        boolean z10 = this.A06.A06;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "7ZSgCyrANqbSR0bOMUGXtewOYYl5EtQ7";
        strArr2[2] = "EtNqJr4QhL0ASxhb1XseUjRgOzTVtavV";
        int heightMode = 0;
        if (z10) {
            int mode = View.MeasureSpec.getMode(i10);
            int widthMode = View.MeasureSpec.getMode(i11);
            if (mode == 1073741824 && widthMode == 1073741824) {
                heightMode = 1;
            }
            this.A06.A1L(this.A0r, this.A0s, i10, i11);
            if (heightMode != 0 || this.A04 == null) {
                return;
            }
            int widthMode2 = this.A0s.A04;
            if (widthMode2 == 1) {
                A0L();
            }
            this.A06.A13(i10, i11);
            this.A0s.A0A = true;
            A0M();
            this.A06.A14(i10, i11);
            if (this.A06.A21()) {
                QO qo2 = this.A06;
                int widthMode3 = getMeasuredWidth();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthMode3, 1073741824);
                int widthMode4 = getMeasuredHeight();
                qo2.A13(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(widthMode4, 1073741824));
                this.A0s.A0A = true;
                A0M();
                if (A19[1].charAt(14) != '5') {
                    this.A06.A14(i10, i11);
                    return;
                }
                String[] strArr3 = A19;
                strArr3[3] = "2scJF4Z4oabFWuCQusikCL010xDMrwfy";
                strArr3[2] = "adt4S0RTiAMMvoy66yYvZbK2iUPJlD04";
                this.A06.A14(i10, i11);
                return;
            }
            return;
        }
        if (this.A0E) {
            this.A06.A1L(this.A0r, this.A0s, i10, i11);
            return;
        }
        if (this.A0A) {
            A1L();
            A1M();
            A0P();
            A1N();
            if (this.A0s.A0B) {
                this.A0s.A09 = true;
            } else {
                this.A00.A07();
                this.A0s.A09 = false;
            }
            this.A0A = false;
            A1p(false);
        } else if (this.A0s.A0B) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (this.A04 != null) {
            this.A0s.A03 = this.A04.A0B();
        } else {
            this.A0s.A03 = 0;
        }
        A1L();
        this.A06.A1L(this.A0r, this.A0s, i10, i11);
        A1p(false);
        this.A0s.A09 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (A1s()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.A0j = (RecyclerView$SavedState) state;
        super.onRestoreInstanceState(this.A0j.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1u(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState state = this.A0j;
        if (state != null) {
            RecyclerView$SavedState state2 = this.A0j;
            recyclerView$SavedState.A03(state2);
        } else if (this.A06 != null) {
            recyclerView$SavedState.A00 = this.A06.A1n();
        } else {
            recyclerView$SavedState.A00 = null;
        }
        return new WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            A0f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C09846g.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        AbstractC1484Qg abstractC1484QgA0F = A0F(view);
        if (abstractC1484QgA0F != null) {
            if (abstractC1484QgA0F.A0i()) {
                abstractC1484QgA0F.A0V();
            } else if (!abstractC1484QgA0F.A0l()) {
                throw new IllegalArgumentException(A0I(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 75, 84) + abstractC1484QgA0F + A1J());
            }
        }
        view.clearAnimation();
        A1g(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1d(this, this.A0s, view, view2) && view2 != null) {
            A0p(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.A06.A1b(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.A13.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<QS> arrayList = this.A13;
            int i11 = A19[7].length();
            if (i11 != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "ALuvCB3Uxfwb6USvRsTQeejOaKQGJDVI";
            strArr[2] = "eH5kVfmfggziqkhtmDEzLdVkGL1u4682";
            arrayList.get(i10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0) {
            boolean z10 = this.A0I;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "DQNG7v2eQntUoXmxdvl3JfddX2pbwEnJ";
            strArr2[6] = "9dlsUD8r2K7vneFeWRut3F36hDYz7ROo";
            if (!z10) {
                super.requestLayout();
                return;
            }
        }
        this.A0J = true;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(834, 90, 48));
            return;
        }
        if (this.A0I) {
            return;
        }
        boolean zA22 = this.A06.A22();
        boolean zA23 = this.A06.A23();
        if (zA22 || zA23) {
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[1] = "hukuWuX8c8ikYD5Zh6axQSjgAUqwSCKd";
            if (!zA22) {
                i10 = 0;
            }
            A13(i10, zA23 ? i11 : 0, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w(A0I(1370, 12, 39), A0I(1382, 93, 57));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A18(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C2101g1 c2101g1) {
        this.A09 = c2101g1;
        P3.A0B(this, this.A09);
    }

    public void setAdapter(QC qc2) {
        setLayoutFrozen(false);
        A0q(qc2, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(QF qf2) {
        if (qf2 == null) {
            return;
        }
        this.A0e = qf2;
        setChildrenDrawingOrderEnabled(0 != 0);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.A0B) {
            A0f();
        }
        this.A0B = z10;
        super.setClipToPadding(z10);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z10) {
        this.A0E = z10;
    }

    public void setItemAnimator(QK qk2) {
        if (this.A05 != null) {
            this.A05.A0H();
            this.A05.A0J(null);
        }
        this.A05 = qk2;
        if (this.A05 != null) {
            this.A05.A0J(this.A0f);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.A0r.A0Q(i10);
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.A0I) {
            A1n(A0I(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, 42, 1));
            if (!z10) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "JdEcOawzhGoMi7SJTaKu9jXFd9l8G1Qn";
            strArr2[6] = "ngxMbpV1qHapbkXJW6JrwI2187obRSoG";
            this.A0I = true;
            this.A0n = true;
            A1T();
        }
    }

    public void setLayoutManager(QO qo2) {
        if (qo2 == this.A06) {
            return;
        }
        A1T();
        if (this.A06 != null) {
            if (this.A05 != null) {
                this.A05.A0H();
            }
            this.A06.A1K(this.A0r);
            this.A06.A1I(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1S(this, this.A0r);
            }
            this.A06.A1R(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = qo2;
        if (qo2 != null) {
            if (qo2.A03 == null) {
                this.A06.A1R(this);
                if (this.A0F) {
                    this.A06.A1P(this);
                }
            } else {
                throw new IllegalArgumentException(A0I(1109, 14, 42) + qo2 + A0I(59, 39, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + qo2.A03.A1J());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().A04(z10);
    }

    public void setOnFlingListener(QR qr2) {
        this.A0g = qr2;
    }

    @Deprecated
    public void setOnScrollListener(QT qt2) {
        this.A0i = qt2;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.A0o = z10;
    }

    public void setRecycledViewPool(QV qv2) {
        this.A0r.A0V(qv2);
    }

    public void setRecyclerListener(QX qx) {
        this.A07 = qx;
    }

    public void setScrollState(int i10) {
        if (i10 == this.A0W) {
            return;
        }
        this.A0W = i10;
        if (i10 != 2) {
            A0V();
        }
        A0k(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i10) {
            case 0:
                break;
            case 1:
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(A0I(1370, 12, 39), A0I(1994, 47, 98) + i10 + A0I(198, 21, 88));
                break;
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1482Qe abstractC1482Qe) {
        this.A0r.A0W(abstractC1482Qe);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().A0A(i10);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
