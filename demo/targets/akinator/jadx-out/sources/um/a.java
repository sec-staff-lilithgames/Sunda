package um;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;
import com.vungle.ads.internal.Constants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f88522a = Color.parseColor("#B4FFFFFF");

    /* renamed from: b, reason: collision with root package name */
    public static final int f88523b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f88524c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f88525d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f88526e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f88527f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f88528g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f88529h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f88530i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f88531j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f88532k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f88533l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f88534m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f88535n;

    /* renamed from: o, reason: collision with root package name */
    public static final p f88536o;

    static {
        Color.parseColor("#5c000000");
        f88523b = Color.parseColor("#52000000");
        p pVar = new p();
        f88524c = pVar;
        pVar.setHorizontalPosition(5);
        pVar.setVerticalPosition(48);
        Float fValueOf = Float.valueOf(2.0f);
        pVar.setStrokeWidth(fValueOf);
        pVar.setStyle("cross");
        pVar.setMargin(8, 8, 8, 8);
        Float fValueOf2 = Float.valueOf(30.0f);
        pVar.setWidth(fValueOf2);
        pVar.setHeight(fValueOf2);
        Float fValueOf3 = Float.valueOf(3.0f);
        pVar.setHideAfter(fValueOf3);
        p pVar2 = new p();
        pVar2.setHorizontalPosition(5);
        pVar2.setVerticalPosition(48);
        pVar2.setStrokeWidth(fValueOf);
        pVar2.setStyle("skip");
        pVar2.setMargin(8, 8, 8, 8);
        pVar2.setWidth(fValueOf2);
        pVar2.setHeight(fValueOf2);
        pVar2.setHideAfter(fValueOf3);
        p pVar3 = new p();
        f88527f = pVar3;
        pVar3.setHorizontalPosition(5);
        pVar3.setVerticalPosition(48);
        pVar3.setStrokeWidth(fValueOf);
        pVar3.setStyle("circular");
        pVar3.setMargin(8, 8, 8, 8);
        pVar3.setWidth(fValueOf2);
        pVar3.setHeight(fValueOf2);
        pVar3.setFontStyle(1);
        pVar3.setHideAfter(fValueOf3);
        p pVar4 = new p();
        f88528g = pVar4;
        pVar4.setHorizontalPosition(5);
        pVar4.setVerticalPosition(48);
        Float fValueOf4 = Float.valueOf(16.0f);
        pVar4.setFontSize(fValueOf4);
        pVar4.setStrokeWidth(fValueOf);
        pVar4.setPadding(12, 2, 12, 2);
        pVar4.setContent("%1.0f%");
        pVar4.setStyle("text");
        pVar4.setMargin(8, 8, 8, 8);
        pVar4.setFontStyle(1);
        pVar4.setHideAfter(fValueOf3);
        p pVar5 = new p();
        f88526e = pVar5;
        pVar5.setHorizontalPosition(3);
        pVar5.setVerticalPosition(48);
        pVar5.setStrokeWidth(fValueOf);
        pVar5.setMargin(8, 8, 8, 8);
        pVar5.setWidth(fValueOf2);
        pVar5.setHeight(fValueOf2);
        pVar5.setHideAfter(fValueOf3);
        p pVar6 = new p();
        f88525d = pVar6;
        pVar6.setHorizontalPosition(17);
        pVar6.setVerticalPosition(48);
        pVar6.setStrokeWidth(fValueOf);
        pVar6.setMargin(8, 8, 8, 8);
        pVar6.setWidth(fValueOf2);
        pVar6.setHeight(fValueOf2);
        pVar6.setVisible(Boolean.FALSE);
        pVar6.setHideAfter(fValueOf3);
        p pVar7 = new p();
        f88533l = pVar7;
        pVar7.setHorizontalPosition(17);
        pVar7.setVerticalPosition(80);
        pVar7.setFillColor(0);
        pVar7.setStrokeWidth(fValueOf3);
        pVar7.setWidth(-1);
        pVar7.setHeight(3);
        pVar7.setStyle("linear");
        pVar7.setHideAfter(fValueOf3);
        p pVar8 = new p();
        f88532k = pVar8;
        pVar8.setHorizontalPosition(17);
        pVar8.setVerticalPosition(80);
        pVar8.setFontSize(fValueOf4);
        pVar8.setStrokeWidth(fValueOf);
        pVar8.setPadding(12, 2, 12, 2);
        pVar8.setContent("%1.0f%");
        pVar8.setStyle("text");
        pVar8.setMargin(3, 3, 3, 3);
        pVar8.setFontStyle(1);
        pVar8.setHideAfter(fValueOf3);
        p pVar9 = new p();
        f88534m = pVar9;
        pVar9.setHorizontalPosition(17);
        pVar9.setVerticalPosition(80);
        pVar9.setStrokeWidth(fValueOf);
        pVar9.setOutlined(Boolean.TRUE);
        pVar9.setStyle("circular");
        pVar9.setMargin(8, 8, 8, 8);
        pVar9.setWidth(fValueOf2);
        pVar9.setHeight(fValueOf2);
        pVar9.setFontStyle(1);
        pVar9.setHideAfter(fValueOf3);
        p pVar10 = new p();
        f88529h = pVar10;
        pVar10.setHorizontalPosition(5);
        pVar10.setVerticalPosition(80);
        pVar10.setFontSize(fValueOf4);
        pVar10.setStrokeWidth(fValueOf);
        pVar10.setPadding(16, 6, 16, 6);
        pVar10.setStyle("text");
        pVar10.setMargin(3, 3, 3, 3);
        pVar10.setFontStyle(1);
        pVar10.setHideAfter(fValueOf3);
        p pVar11 = new p();
        f88530i = pVar11;
        pVar11.setHorizontalPosition(17);
        pVar11.setVerticalPosition(80);
        pVar11.setFillColor(0);
        pVar11.setMargin(3, 3, 3, 3);
        p pVar12 = new p(pVar11);
        f88531j = pVar12;
        pVar12.setMargin(0, 0, 0, 0);
        p pVar13 = new p();
        f88535n = pVar13;
        pVar13.setHorizontalPosition(1);
        pVar13.setVerticalPosition(16);
        pVar13.setPadding(8, 8, 8, 8);
        pVar13.setStrokeWidth(fValueOf3);
        pVar13.setWidth(48);
        pVar13.setHeight(48);
        p pVar14 = new p();
        f88536o = pVar14;
        pVar14.setHorizontalPosition(3);
        pVar14.setVerticalPosition(48);
        pVar14.setFillColor(-16777216);
        pVar14.setStyle(Constants.TEMPLATE_TYPE_FULLSCREEN);
    }

    public static Bitmap getBitmapFromBase64(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static p resolveDefCloseStyle(Context context, p pVar) {
        p pVar2 = f88524c;
        if (pVar == null) {
            return pVar2;
        }
        if (!"crossfill".equals(pVar.getStyle()) && !"skipfill".equals(pVar.getStyle())) {
            return pVar2;
        }
        p pVar3 = new p();
        pVar3.setOutlined(Boolean.TRUE);
        return pVar2.copyWith(pVar3);
    }
}
