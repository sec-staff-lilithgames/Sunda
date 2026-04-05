package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzglr;
import com.google.android.gms.internal.ads.zzgms;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbs {
    public static boolean zza(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdY)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdZ)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:74|22)|71|31|32|(6:34|(2:39|40)(1:48)|51|(2:67|53)|56|(2:69|58))(6:44|(2:46|47)(0)|51|(0)|56|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0162, code lost:
    
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e A[Catch: JSONException -> 0x014e, TRY_LEAVE, TryCatch #7 {JSONException -> 0x014e, blocks: (B:31:0x0130, B:40:0x014a, B:48:0x015e, B:47:0x015a), top: B:71:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zzb(android.content.Context r17, android.view.View r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbs.zzb(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject zzc(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziM)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                com.google.android.gms.ads.internal.zzt.zzc();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("can_show_on_lock_screen", zzs.zzq(view));
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("is_keyguard_locked", zzs.zzH(context));
                return jSONObject;
            } catch (JSONException unused) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) throws JSONException {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrZzg = zzg(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrZzg2 = zzg(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = iArrZzg;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[0] - iArr[0]));
                            jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = zzl(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[0] - iArr[0]));
                                jSONObject.put("y", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziN)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziO)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziP)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    int i10 = zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                                    it2 = it;
                                    iArrZzg = iArr;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziQ)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    iArrZzg = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zzf(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point2.x));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point2.y));
                jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point.x));
                jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e11) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while putting signals into JSON object.", e11);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e12) {
            e = e12;
            jSONObject2 = jSONObject;
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] iArrZzg = zzg(view);
        return new Point(((int) motionEvent.getRawX()) - iArrZzg[0], ((int) motionEvent.getRawY()) - iArrZzg[1]);
    }

    public static boolean zzi(Context context, zzffu zzffuVar) {
        if (!zzffuVar.zzN) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziR)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziU)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziS);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzgms.zza(zzglr.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject zzj(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = zzs.zzx((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, displayMetricsZzx.widthPixels));
            jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, displayMetricsZzx.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams zzk() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziT)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject zzl(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzm(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }
}
