package com.mbridge.msdk.dycreator.utils;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBHorizontalScrollView;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.utils.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0261a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40269a;

        static {
            int[] iArr = new int[com.mbridge.msdk.dycreator.engine.c.values().length];
            f40269a = iArr;
            try {
                iArr[com.mbridge.msdk.dycreator.engine.c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.paddingTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.paddingBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.paddingLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.paddingRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.paddingStart.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.paddingEnd.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.orientation.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.ellipsize.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.fadingEdge.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.scrollHorizontally.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.textColor.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.textSize.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.textStyle.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.style.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.tag.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.gravity.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.verticalSpacing.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.numColumns.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.splitMotionEvents.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.cacheColorHint.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.horizontalSpacing.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.singleLine.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.lines.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.drawableLeft.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.drawablePadding.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.src.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.scaleType.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.divider.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.scrollbars.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f40269a[com.mbridge.msdk.dycreator.engine.c.listSelector.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    private static void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:4:0x000a, B:9:0x001f, B:11:0x0025, B:6:0x0011, B:8:0x0019), top: B:16:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(android.view.View r2, java.lang.String r3) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "@+id/"
            boolean r1 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L11
            r0 = 5
            java.lang.String r3 = r3.substring(r0)     // Catch: java.lang.Exception -> L2d
        Lf:
            r0 = r3
            goto L1f
        L11:
            java.lang.String r1 = "@id/"
            boolean r1 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L1f
            r0 = 4
            java.lang.String r3 = r3.substring(r0)     // Catch: java.lang.Exception -> L2d
            goto Lf
        L1f:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L2d
            if (r3 != 0) goto L2c
            int r3 = r0.hashCode()     // Catch: java.lang.Exception -> L2d
            r2.setId(r3)     // Catch: java.lang.Exception -> L2d
        L2c:
            return
        L2d:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "AttributeUtil"
            com.mbridge.msdk.foundation.tools.p0.b(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.utils.a.b(android.view.View, java.lang.String):void");
    }

    private static void c(View view, String str) {
        String[] strArrSplit;
        try {
            if (!str.startsWith("#")) {
                if (str.startsWith("@color/")) {
                    view.setBackgroundColor(com.mbridge.msdk.dycreator.engine.b.a().d(str));
                    return;
                } else {
                    if (str.startsWith("@drawable/")) {
                        view.setBackgroundResource(com.mbridge.msdk.foundation.controller.c.m().d().getResources().getIdentifier(str.substring(10), "drawable", com.mbridge.msdk.foundation.controller.c.m().d().getPackageName()));
                        return;
                    }
                    return;
                }
            }
            try {
                strArrSplit = str.split("-");
            } catch (Exception unused) {
                strArrSplit = null;
            }
            if (strArrSplit != null && strArrSplit.length <= 2) {
                view.setBackgroundColor(com.mbridge.msdk.dycreator.engine.b.a().d(str));
                return;
            }
            if (strArrSplit == null || strArrSplit.length != 3) {
                return;
            }
            GradientDrawable gradientDrawableA = com.mbridge.msdk.dycreator.engine.b.a().a(strArrSplit);
            if (gradientDrawableA != null) {
                view.setBackground(gradientDrawableA);
            } else {
                view.setBackgroundColor(com.mbridge.msdk.dycreator.engine.b.a().d(str));
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(FrameLayout frameLayout, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
    }

    private static void a(ScrollView scrollView, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
    }

    private static void d(View view, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.equals(VPCjETNfjxu.nNeaWuK)) {
                    view.setVisibility(4);
                } else if (str.equalsIgnoreCase("gone")) {
                    view.setVisibility(8);
                }
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(MBHorizontalScrollView mBHorizontalScrollView, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
    }

    public static void a(View view, AttributeSet attributeSet) {
        if (view == null || attributeSet == null) {
            return;
        }
        try {
            HashMap<String, com.mbridge.msdk.dycreator.engine.c> mapC = com.mbridge.msdk.dycreator.engine.b.a().c();
            if (mapC != null && !mapC.isEmpty()) {
                int attributeCount = attributeSet.getAttributeCount();
                int iA = 0;
                int iA2 = 0;
                int iA3 = 0;
                int iA4 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    com.mbridge.msdk.dycreator.engine.c cVar = mapC.get(attributeSet.getAttributeName(i10));
                    if (cVar != null) {
                        switch (C0261a.f40269a[cVar.ordinal()]) {
                            case 1:
                                b(view, attributeSet.getAttributeValue(i10));
                                break;
                            case 2:
                                c(view, attributeSet.getAttributeValue(i10));
                                break;
                            case 3:
                                d(view, attributeSet.getAttributeValue(i10));
                                break;
                            case 4:
                                a(view, attributeSet.getAttributeValue(i10));
                                break;
                            case 5:
                                int iA5 = com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10));
                                view.setPadding(iA5, iA5, iA5, iA5);
                                break;
                            case 6:
                                iA2 = com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10));
                                view.setPadding(iA, iA2, iA3, iA4);
                                break;
                            case 7:
                                iA4 = com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10));
                                view.setPadding(iA, iA2, iA3, iA4);
                                break;
                            case 8:
                                iA = com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10));
                                view.setPadding(iA, iA2, iA3, iA4);
                                break;
                            case 9:
                                iA3 = com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10));
                                view.setPadding(iA, iA2, iA3, iA4);
                                break;
                            case 10:
                                view.setPadding(com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10)), iA2, iA3, iA4);
                                break;
                            case 11:
                                view.setPadding(iA, iA2, com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10)), iA4);
                                break;
                        }
                        if (view instanceof EditText) {
                            a();
                        } else if (view instanceof Button) {
                            a((Button) view, cVar, attributeSet, i10);
                        } else if (view instanceof TextView) {
                            a((TextView) view, cVar, attributeSet, i10);
                        } else if (view instanceof ImageView) {
                            a((ImageView) view, cVar, attributeSet, i10);
                        } else if (view instanceof ListView) {
                            a((ListView) view, cVar, attributeSet, i10);
                        } else if (view instanceof GridView) {
                            a((GridView) view, cVar, attributeSet, i10);
                        } else if (view instanceof ScrollView) {
                            a((ScrollView) view, cVar, attributeSet, i10);
                        } else if (view instanceof PlayerView) {
                            a((PlayerView) view, cVar, attributeSet, i10);
                        } else if (view instanceof MBHorizontalScrollView) {
                            a((MBHorizontalScrollView) view, cVar, attributeSet, i10);
                        } else if (view instanceof LinearLayout) {
                            a((LinearLayout) view, cVar, attributeSet, i10);
                        } else if (view instanceof RelativeLayout) {
                            a((RelativeLayout) view, cVar, attributeSet, i10);
                        } else if (view instanceof FrameLayout) {
                            a((FrameLayout) view, cVar, attributeSet, i10);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(PlayerView playerView, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            if (C0261a.f40269a[cVar.ordinal()] != 12) {
                return;
            }
            if ("horizontal".equalsIgnoreCase(attributeSet.getAttributeValue(i10))) {
                playerView.setOrientation(0);
            } else {
                playerView.setOrientation(1);
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(Button button, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            switch (C0261a.f40269a[cVar.ordinal()]) {
                case 13:
                    button.setText(com.mbridge.msdk.dycreator.engine.b.a().f(attributeSet.getAttributeValue(i10)));
                    break;
                case 14:
                    if (attributeSet.getAttributeBooleanValue(i10, false)) {
                        button.setFocusable(true);
                        button.setFocusableInTouchMode(true);
                        button.setSingleLine(true);
                        button.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        button.setMarqueeRepeatLimit(1000);
                        button.setSingleLine();
                        button.setHorizontallyScrolling(true);
                        button.requestFocus();
                        break;
                    }
                    break;
                case 15:
                    button.setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                    break;
                case 16:
                    button.setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i10, false));
                    break;
                case 17:
                    button.setTextColor(com.mbridge.msdk.dycreator.engine.b.a().d(attributeSet.getAttributeValue(i10)));
                    break;
                case 18:
                    if (!TextUtils.isEmpty(attributeSet.getAttributeValue(i10))) {
                        button.setTextSize(com.mbridge.msdk.dycreator.engine.b.a().a(r4));
                        break;
                    }
                    break;
                case 19:
                    if (TtmlNode.BOLD.equalsIgnoreCase(attributeSet.getAttributeValue(i10))) {
                        button.setTypeface(Typeface.defaultFromStyle(1));
                        break;
                    }
                    break;
                case 20:
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    String strSubstring = attributeValue.substring(attributeValue.indexOf("/") + 1);
                    button.setTextAppearance(com.mbridge.msdk.foundation.controller.c.m().d(), com.mbridge.msdk.dycreator.engine.b.a().c("R.style." + strSubstring));
                    break;
                case 21:
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue2)) {
                        String str = b.f40270a.get(attributeValue2.substring(8));
                        if (!TextUtils.isEmpty(str)) {
                            button.setTag(str);
                            break;
                        }
                    }
                    break;
                case 22:
                    button.setGravity(1);
                    break;
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(GridView gridView, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            int i11 = C0261a.f40269a[cVar.ordinal()];
            if (i11 != 1) {
                switch (i11) {
                    case 23:
                        gridView.setVerticalSpacing(e.a(com.mbridge.msdk.foundation.controller.c.m().d(), com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10))));
                        break;
                    case 24:
                        gridView.setNumColumns(attributeSet.getAttributeIntValue(i10, 2));
                        break;
                    case 25:
                        gridView.setMotionEventSplittingEnabled(!attributeSet.getAttributeValue(i10).equals("false"));
                        break;
                    case 26:
                        gridView.setCacheColorHint(com.mbridge.msdk.dycreator.engine.b.a().d(attributeSet.getAttributeValue(i10)));
                        break;
                    case 27:
                        gridView.setHorizontalSpacing(e.a(com.mbridge.msdk.foundation.controller.c.m().d(), com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10))));
                        break;
                }
            }
            String attributeValue = attributeSet.getAttributeValue(i10);
            if (attributeValue.startsWith("@+id/")) {
                gridView.setId(attributeValue.substring(5).hashCode());
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(View view, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str2 = b.f40270a.get(str.substring(8));
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            view.setContentDescription(str2);
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(LinearLayout linearLayout, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            if (C0261a.f40269a[cVar.ordinal()] != 12) {
                return;
            }
            if ("horizontal".equalsIgnoreCase(attributeSet.getAttributeValue(i10))) {
                linearLayout.setOrientation(0);
            } else {
                linearLayout.setOrientation(1);
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(RelativeLayout relativeLayout, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            if (C0261a.f40269a[cVar.ordinal()] != 22) {
                return;
            }
            relativeLayout.setGravity(com.mbridge.msdk.dycreator.engine.b.a().b(attributeSet.getAttributeValue(i10)));
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(TextView textView, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            int i11 = C0261a.f40269a[cVar.ordinal()];
            switch (i11) {
                case 13:
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.startsWith("@string/")) {
                            textView.setText(com.mbridge.msdk.dycreator.engine.b.a().f(attributeSet.getAttributeValue(i10)));
                            break;
                        } else {
                            textView.setText(attributeValue);
                            break;
                        }
                    }
                    break;
                case 14:
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue2)) {
                        if (attributeValue2.equals(TtmlNode.END)) {
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                        if (attributeValue2.equals("start")) {
                            textView.setEllipsize(TextUtils.TruncateAt.START);
                        }
                        if (attributeValue2.equals("middle")) {
                            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        }
                        if (attributeValue2.equals("marquee")) {
                            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                            break;
                        }
                    }
                    break;
                case 15:
                    textView.setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                    break;
                case 16:
                    textView.setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i10, false));
                    break;
                case 17:
                    textView.setTextColor(com.mbridge.msdk.dycreator.engine.b.a().d(attributeSet.getAttributeValue(i10)));
                    break;
                case 18:
                    if (!TextUtils.isEmpty(attributeSet.getAttributeValue(i10))) {
                        textView.setTextSize(com.mbridge.msdk.dycreator.engine.b.a().a(r4));
                        break;
                    }
                    break;
                case 19:
                    if (TtmlNode.BOLD.equalsIgnoreCase(attributeSet.getAttributeValue(i10))) {
                        textView.setTypeface(Typeface.defaultFromStyle(1));
                        break;
                    }
                    break;
                case 20:
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    String strSubstring = attributeValue3.substring(attributeValue3.indexOf("/") + 1);
                    com.mbridge.msdk.dycreator.engine.b.a().c("R.style." + strSubstring);
                    break;
                case 21:
                    String attributeValue4 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue4)) {
                        String str = b.f40270a.get(attributeValue4.substring(8));
                        if (!TextUtils.isEmpty(str)) {
                            textView.setTag(str);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case 22:
                    textView.setGravity(com.mbridge.msdk.dycreator.engine.b.a().b(attributeSet.getAttributeValue(i10)));
                    break;
                default:
                    switch (i11) {
                        case 28:
                            textView.setSingleLine(attributeSet.getAttributeBooleanValue(i10, false));
                            break;
                        case 29:
                            textView.setLines(attributeSet.getAttributeIntValue(i10, 1));
                            break;
                        case 30:
                            String attributeValue5 = attributeSet.getAttributeValue(i10);
                            String strSubstring2 = "";
                            if (attributeValue5.startsWith("@drawable/")) {
                                strSubstring2 = attributeValue5.substring(10);
                            }
                            if (!TextUtils.isEmpty(strSubstring2)) {
                                textView.setCompoundDrawables(textView.getResources().getDrawable(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), strSubstring2, "drawable")), null, null, null);
                                break;
                            }
                            break;
                        case 31:
                            textView.setCompoundDrawablePadding(com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10)));
                            break;
                    }
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(ImageView imageView, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            int i11 = C0261a.f40269a[cVar.ordinal()];
            if (i11 == 32) {
                com.mbridge.msdk.dycreator.engine.b.a().a(attributeSet.getAttributeValue(i10), imageView);
                return;
            }
            if (i11 != 33) {
                return;
            }
            String attributeValue = attributeSet.getAttributeValue(i10);
            if (TextUtils.isEmpty(attributeValue)) {
                return;
            }
            if (attributeValue.equals("fitXY")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                return;
            }
            if (attributeValue.equals("centerInside")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else if (attributeValue.equals("centerCrop")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else if (attributeValue.equals("fitStart")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
            }
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(ListView listView, com.mbridge.msdk.dycreator.engine.c cVar, AttributeSet attributeSet, int i10) {
        try {
            int i11 = C0261a.f40269a[cVar.ordinal()];
            if (i11 == 25) {
                listView.setMotionEventSplittingEnabled(!attributeSet.getAttributeValue(i10).equals("false"));
                return;
            }
            if (i11 != 26) {
                switch (i11) {
                    case 34:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue) && attributeValue.startsWith("@null")) {
                            listView.setDivider(null);
                            break;
                        }
                        break;
                    case 35:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue2)) {
                            if (attributeValue2.equals("none")) {
                                listView.setVerticalScrollBarEnabled(false);
                            }
                            if (attributeValue2.equals("false")) {
                                listView.setScrollbarFadingEnabled(false);
                                break;
                            }
                        }
                        break;
                    case 36:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            listView.setSelector(com.mbridge.msdk.dycreator.engine.b.a().d(attributeValue3));
                            break;
                        }
                        break;
                }
                return;
            }
            listView.setCacheColorHint(com.mbridge.msdk.dycreator.engine.b.a().d(attributeSet.getAttributeValue(i10)));
        } catch (Exception e10) {
            p0.b("AttributeUtil", e10.getMessage());
        }
    }
}
