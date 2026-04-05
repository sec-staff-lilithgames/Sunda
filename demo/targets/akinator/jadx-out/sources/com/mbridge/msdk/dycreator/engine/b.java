package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.G5;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.dycreator.utils.g;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static volatile b f40200g;

    /* renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, c>> f40201a;

    /* renamed from: b, reason: collision with root package name */
    private SoftReference<HashMap<String, String>> f40202b;

    /* renamed from: c, reason: collision with root package name */
    private SoftReference<HashMap<String, c>> f40203c;

    /* renamed from: d, reason: collision with root package name */
    private String f40204d;

    /* renamed from: e, reason: collision with root package name */
    private String f40205e;

    /* renamed from: f, reason: collision with root package name */
    private Context f40206f;

    private b() {
    }

    public static b a() {
        if (f40200g == null) {
            synchronized (b.class) {
                try {
                    if (f40200g == null) {
                        f40200g = new b();
                    }
                } finally {
                }
            }
        }
        return f40200g;
    }

    public HashMap b() {
        SoftReference<HashMap<String, c>> softReference = this.f40201a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", c.layout_width);
            map.put("layout_height", c.layout_height);
            map.put("orientation", c.orientation);
            map.put("layout_centerHorizontal", c.layout_centerHorizontal);
            map.put("layout_centerVertical", c.layout_centerVertical);
            c cVar = c.layout_marginLeft;
            map.put("layout_marginLeft", cVar);
            c cVar2 = c.layout_marginRight;
            map.put("layout_marginRight", cVar2);
            map.put("layout_margin", c.layout_margin);
            map.put("layout_gravity", c.layout_gravity);
            map.put("layout_alignParentRight", c.layout_alignParentRight);
            map.put("layout_weight", c.layout_weight);
            map.put("contentDescription", c.contentDescription);
            map.put("gravity", c.gravity);
            map.put("id", c.id);
            map.put("layout_below", c.layout_below);
            map.put("layout_above", c.layout_above);
            map.put("layout_toLeftOf", c.layout_toLeftOf);
            map.put("layout_toRightOf", c.layout_toRightOf);
            map.put("layout_toEndOf", c.layout_toEndOf);
            map.put("background", c.background);
            map.put("layout_marginTop", c.layout_marginTop);
            map.put("layout_marginBottom", c.layout_marginBottom);
            map.put("layout_marginLeft", cVar);
            map.put("layout_marginRight", cVar2);
            map.put("layout_alignParentBottom", c.layout_alignParentBottom);
            map.put("layout_alignParentTop", c.layout_alignParentTop);
            map.put("layout_alignParentLeft", c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", c.layout_alignTop);
            map.put("layout_alignBottom", c.layout_alignBottom);
            map.put("layout_alignLeft", c.layout_alignLeft);
            map.put("layout_alignRight", c.layout_alignRight);
            map.put("layout_centerInParent", c.layout_centerInParent);
            map.put("layout_alignParentEnd", c.layout_alignParentEnd);
            this.f40201a = new SoftReference<>(map);
        }
        return this.f40201a.get();
    }

    public HashMap<String, c> c() {
        SoftReference<HashMap<String, c>> softReference = this.f40203c;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(55);
            map.put("id", c.id);
            map.put("text", c.text);
            map.put("ellipsize", c.ellipsize);
            map.put("singleLine", c.singleLine);
            map.put("lines", c.lines);
            map.put("maxLength", c.maxLength);
            map.put("drawableLeft", c.drawableLeft);
            map.put("drawablePadding", c.drawablePadding);
            map.put("fadingEdge", c.fadingEdge);
            map.put("scrollHorizontally", c.scrollHorizontally);
            map.put("textColor", c.textColor);
            map.put("textSize", c.textSize);
            map.put("visibility", c.visibility);
            c cVar = c.background;
            map.put("background", cVar);
            map.put("textStyle", c.textStyle);
            map.put(TtmlNode.TAG_STYLE, c.style);
            map.put("layout_width", c.layout_width);
            map.put("layout_height", c.layout_height);
            map.put("layout_below", c.layout_below);
            map.put("layout_centerInParent", c.layout_centerInParent);
            map.put("contentDescription", c.contentDescription);
            map.put("src", c.src);
            map.put("gravity", c.gravity);
            map.put("orientation", c.orientation);
            map.put("numColumns", c.numColumns);
            map.put("verticalSpacing", c.verticalSpacing);
            map.put("horizontalSpacing", c.horizontalSpacing);
            map.put("background", cVar);
            map.put("layout_marginBottom", c.layout_marginBottom);
            map.put("scaleType", c.scaleType);
            map.put("tag", c.tag);
            map.put("layout_gravity", c.layout_gravity);
            map.put("parent_view", c.parent_view);
            map.put("padding", c.padding);
            map.put("paddingTop", c.paddingTop);
            map.put("paddingBottom", c.paddingBottom);
            map.put("paddingLeft", c.paddingLeft);
            map.put("paddingRight", c.paddingRight);
            map.put("divider", c.divider);
            map.put("scrollbars", c.scrollbars);
            map.put("listSelector", c.listSelector);
            this.f40203c = new SoftReference<>(map);
        }
        return this.f40203c.get();
    }

    public int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (!str.startsWith("#")) {
            if (!str.startsWith("@color/")) {
                return -16777216;
            }
            return com.mbridge.msdk.foundation.controller.c.m().d().getColor(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), str.substring(7), "color"));
        }
        int length = str.length();
        if (length == 7) {
            return (int) Long.decode(str.replace("#", "#FF")).longValue();
        }
        if (length == 9) {
            return (int) Long.decode(str).longValue();
        }
        g.a("返回白色背景");
        return -1;
    }

    public View e(String str) {
        if (this.f40206f != null) {
            try {
                a aVar = new a(this.f40206f);
                new String();
                g.a(str.toString());
                return aVar.a(str, (ViewGroup) null);
            } catch (Exception e10) {
                p0.b("MBResource", e10.getMessage());
            }
        }
        return null;
    }

    public String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("@")) {
            return str;
        }
        SoftReference<HashMap<String, String>> softReference = this.f40202b;
        if (softReference == null || softReference.get() == null) {
            this.f40202b = new SoftReference<>(d());
        }
        String strSubstring = str.substring(8);
        if (this.f40202b.get() == null || this.f40202b.get().size() <= 0) {
            return null;
        }
        String str2 = this.f40202b.get().get(strSubstring);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            return com.mbridge.msdk.foundation.controller.c.m().d().getString(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), strSubstring, "string"));
        } catch (Exception e10) {
            p0.b("MBResource", e10.getMessage());
            return null;
        }
    }

    public void a(Context context, String str) {
        try {
            if (g.f40273a) {
                this.f40204d = context.getFilesDir().toString();
            } else {
                this.f40204d = str;
            }
            if (e.a(context).heightPixels <= 320 || g.f40273a) {
                this.f40205e = "/drawable-mdpi/";
            } else {
                this.f40205e = "/drawable-hdpi/";
            }
            this.f40206f = context;
            com.mbridge.msdk.dycreator.utils.b.f40270a = a().d();
        } catch (Exception e10) {
            p0.b("MBResource", e10.getMessage());
        }
    }

    public HashMap<String, String> d() throws XmlPullParserException, IOException {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = this.f40206f.getAssets().open("rv_binddatas.xml");
        } catch (IOException e10) {
            e10.printStackTrace();
            inputStreamOpen = null;
        }
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(inputStreamOpen, G5.N);
            HashMap<String, String> map = new HashMap<>();
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2) {
                    if ("string".equals(xmlPullParserNewPullParser.getName())) {
                        map.put(xmlPullParserNewPullParser.getAttributeValue(0), xmlPullParserNewPullParser.nextText());
                    }
                }
            }
            return map;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public void a(Context context) {
        try {
            if (e.a(context).heightPixels <= 320 || g.f40273a) {
                this.f40205e = "/drawable-mdpi/";
            } else {
                this.f40205e = "/drawable-hdpi/";
            }
            this.f40206f = context;
            com.mbridge.msdk.dycreator.utils.b.f40270a = a().d();
        } catch (Exception e10) {
            p0.b("MBResource", e10.getMessage());
        }
    }

    public GradientDrawable a(String[] strArr) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
            gradientDrawable.setGradientType(0);
            return gradientDrawable;
        } catch (Exception e10) {
            p0.b("MBResource", e10.getMessage());
            return null;
        }
    }

    public int a(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
            int iIndexOf2 = str.indexOf(ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i10 = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                return e.a(this.f40206f, i10);
            }
            str.contains(ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
            return i10;
        }
    }

    public int b(String str) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        String[] strArrSplit = str.toUpperCase().split("\\|");
        int i10 = 48;
        try {
            Class<?> cls = Class.forName("android.view.Gravity");
            for (String str2 : strArrSplit) {
                i10 = cls.getField(str2).getInt(null);
            }
            return i10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    public void a(String str, ImageView imageView) {
        Context context;
        if (str == null || !str.startsWith("@drawable/") || (context = this.f40206f) == null) {
            return;
        }
        try {
            Resources resources = context.getResources();
            String strH = com.mbridge.msdk.foundation.controller.c.m().h();
            if (TextUtils.isEmpty(strH)) {
                strH = this.f40206f.getPackageName();
            }
            imageView.setImageResource(resources.getIdentifier(str, "drawable", strH));
        } catch (Exception e10) {
            p0.b("MBResource", e10.getMessage());
        }
    }

    public int c(String str) throws IllegalAccessException, NoSuchFieldException, InstantiationException, ClassNotFoundException, SecurityException {
        if (this.f40206f == null) {
            return 0;
        }
        String strH = com.mbridge.msdk.foundation.controller.c.m().h();
        if (TextUtils.isEmpty(strH)) {
            strH = this.f40206f.getPackageName();
        }
        StringBuilder sbT = a.b.t(strH, ".R$");
        String[] strArrSplit = str.split("\\.");
        sbT.append(strArrSplit[1]);
        try {
            Class<?> cls = Class.forName(sbT.toString());
            Object objNewInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(strArrSplit[2]);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(objNewInstance)).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
