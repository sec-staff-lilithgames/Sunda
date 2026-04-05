package com.sfbx.appconsentv3.ui.util;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import b0.e2;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.sfbx.appconsent.core.model.BannerType;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsent.core.model.TranslatableText;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.BuildConfig;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.t;
import uu.p0;
import uu.p1;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ExtensionKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentableType.values().length];
            try {
                iArr[ConsentableType.PURPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsentableType.FEATURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConsentableType.SPECIAL_FEATURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConsentableType.STACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConsentableType.EXTRA_PURPOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ConsentableType.EXTRA_SPECIAL_PURPOSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ConsentableType.EXTRA_FEATURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ConsentableType.EXTRA_SPECIAL_FEATURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ConsentableType.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int dpToPx(float f10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static final Drawable getConsentableLogo(Consentable consentable, Context context) {
        e0.checkNotNullParameter(consentable, "<this>");
        e0.checkNotNullParameter(context, "context");
        switch (WhenMappings.$EnumSwitchMapping$0[consentable.getType().ordinal()]) {
            case 1:
                Integer iabId = consentable.getIabId();
                return m3.a.getDrawable(context, (iabId != null && iabId.intValue() == 1) ? R.drawable.appconsent_ic_v3_purpose_1 : (iabId != null && iabId.intValue() == 2) ? R.drawable.appconsent_ic_v3_purpose_2 : (iabId != null && iabId.intValue() == 3) ? R.drawable.appconsent_ic_v3_purpose_3 : (iabId != null && iabId.intValue() == 4) ? R.drawable.appconsent_ic_v3_purpose_4 : (iabId != null && iabId.intValue() == 5) ? R.drawable.appconsent_ic_v3_purpose_5 : (iabId != null && iabId.intValue() == 6) ? R.drawable.appconsent_ic_v3_purpose_6 : (iabId != null && iabId.intValue() == 7) ? R.drawable.appconsent_ic_v3_purpose_7 : (iabId != null && iabId.intValue() == 8) ? R.drawable.appconsent_ic_v3_purpose_8 : (iabId != null && iabId.intValue() == 9) ? R.drawable.appconsent_ic_v3_purpose_9 : (iabId != null && iabId.intValue() == 10) ? R.drawable.appconsent_ic_v3_purpose_10 : R.drawable.appconsent_ic_v3_purpose_11);
            case 2:
                Integer iabId2 = consentable.getIabId();
                return m3.a.getDrawable(context, (iabId2 != null && iabId2.intValue() == 1) ? R.drawable.appconsent_ic_v3_special_purpose_1 : R.drawable.appconsent_ic_v3_special_purpose_2);
            case 3:
                Integer iabId3 = consentable.getIabId();
                return m3.a.getDrawable(context, (iabId3 != null && iabId3.intValue() == 1) ? R.drawable.appconsent_ic_v3_feature_1 : (iabId3 != null && iabId3.intValue() == 2) ? R.drawable.appconsent_ic_v3_feature_2 : R.drawable.appconsent_ic_v3_feature_3);
            case 4:
                Integer iabId4 = consentable.getIabId();
                return m3.a.getDrawable(context, (iabId4 != null && iabId4.intValue() == 1) ? R.drawable.appconsent_ic_v3_special_feature_1 : R.drawable.appconsent_ic_v3_special_feature_2);
            case 5:
                return m3.a.getDrawable(context, R.drawable.appconsent_ic_v3_stack);
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return consentable.isGeolocation() ? consentable.getBannerType() == BannerType.GEOLOCATION_AD ? m3.a.getDrawable(context, R.drawable.appconsent_ic_v3_extra_geoloc_advertising) : m3.a.getDrawable(context, R.drawable.appconsent_ic_v3_extra_geoloc_marketing) : m3.a.getDrawable(context, R.drawable.appconsent_ic_v3_extra_purpose);
            default:
                throw new t();
        }
    }

    public static final String getCopyrights(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        String string = context.getString(R.string.appconsent_copyright_version_p);
        e0.checkNotNullExpressionValue(string, "getString(R.string.appconsent_copyright_version_p)");
        return e2.m(string, "format(format, *args)", 1, new Object[]{BuildConfig.VERSION_NAME});
    }

    public static final List<Consentable> getExtraCategoryDisplay(List<Consentable> list) {
        e0.checkNotNullParameter(list, "<this>");
        final String language = Locale.getDefault().getLanguage();
        List<Consentable> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getType() == ConsentableType.EXTRA_PURPOSE && !consentable.isGeolocation()) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = y0.sortedWith(arrayList, new Comparator() { // from class: com.sfbx.appconsentv3.ui.util.ExtensionKt$getExtraCategoryDisplay$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Consentable consentable2 = (Consentable) t10;
                String str = consentable2.getName().get(language);
                if (str == null) {
                    str = (String) y0.firstOrNull(consentable2.getName().values());
                }
                Consentable consentable3 = (Consentable) t11;
                String str2 = consentable3.getName().get(language);
                if (str2 == null) {
                    str2 = (String) y0.firstOrNull(consentable3.getName().values());
                }
                return d.compareValues(str, str2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            Consentable consentable2 = (Consentable) obj2;
            if (consentable2.getType() == ConsentableType.EXTRA_PURPOSE && consentable2.isGeolocation()) {
                arrayList2.add(obj2);
            }
        }
        return y0.plus((Collection) listSortedWith, (Iterable) y0.sortedWith(arrayList2, new Comparator() { // from class: com.sfbx.appconsentv3.ui.util.ExtensionKt$getExtraCategoryDisplay$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Consentable consentable3 = (Consentable) t10;
                String str = consentable3.getName().get(language);
                if (str == null) {
                    str = (String) y0.firstOrNull(consentable3.getName().values());
                }
                Consentable consentable4 = (Consentable) t11;
                String str2 = consentable4.getName().get(language);
                if (str2 == null) {
                    str2 = (String) y0.firstOrNull(consentable4.getName().values());
                }
                return d.compareValues(str, str2);
            }
        }));
    }

    public static final List<Consentable> getFeatureCategoryDisplay(List<Consentable> list) {
        Integer iabId;
        Integer iabId2;
        e0.checkNotNullParameter(list, "<this>");
        List<Consentable> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getType() == ConsentableType.PURPOSE && (iabId2 = consentable.getIabId()) != null && iabId2.intValue() == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            Consentable consentable2 = (Consentable) obj2;
            if (consentable2.getType() == ConsentableType.STACK && (iabId = consentable2.getIabId()) != null && iabId.intValue() == 1) {
                arrayList2.add(obj2);
            }
        }
        List listPlus = y0.plus((Collection) arrayList, (Iterable) arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (((Consentable) obj3).getType() == ConsentableType.SPECIAL_FEATURE) {
                arrayList3.add(obj3);
            }
        }
        return y0.plus((Collection) listPlus, (Iterable) arrayList3);
    }

    public static final List<Consentable> getPurposesCategoryDisplay(List<Consentable> list) {
        Integer iabId;
        Integer iabId2;
        e0.checkNotNullParameter(list, "<this>");
        List<Consentable> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Consentable consentable = (Consentable) obj;
            if (consentable.getType() == ConsentableType.PURPOSE && ((iabId2 = consentable.getIabId()) == null || iabId2.intValue() != 1)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            Consentable consentable2 = (Consentable) obj2;
            if (consentable2.getType() == ConsentableType.STACK && ((iabId = consentable2.getIabId()) == null || iabId.intValue() != 1)) {
                arrayList2.add(obj2);
            }
        }
        return y0.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    public static final void initImageButtonOutlined(AppCompatImageView appCompatImageView, int i10, int i11) {
        e0.checkNotNullParameter(appCompatImageView, "<this>");
        appCompatImageView.setBackground(ViewExtsKt.getBackgroundStroke$default(appCompatImageView, i10, 0, 2, null));
        Integer numValueOf = Integer.valueOf(i10);
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        if (num != null) {
            i11 = num.intValue();
        }
        p3.a.setTint(appCompatImageView.getDrawable(), i11);
    }

    public static final <T> void notNull(T t10, l f10) {
        e0.checkNotNullParameter(f10, "f");
        if (t10 != null) {
            f10.invoke(t10);
        }
    }

    public static final void notNullOrEmpty(String str, l f10) {
        e0.checkNotNullParameter(f10, "f");
        if (str == null || str.length() == 0) {
            return;
        }
        f10.invoke(str);
    }

    public static final Consentable toConsentable(Stack stack) {
        e0.checkNotNullParameter(stack, "<this>");
        return new Consentable(stack.getId(), stack.getIabId(), (String) null, stack.getName(), stack.getDescription(), p1.emptyMap(), (Map) null, ConsentableType.STACK, (BannerType) null, p0.emptyList(), stack.getStatus(), stack.getLegIntStatus(), stack.getVendorsNumber(), 324, (u) null);
    }

    public static final Consentable toConsentableWithVendors(Stack stack, List<Vendor> vendors) {
        e0.checkNotNullParameter(stack, "<this>");
        e0.checkNotNullParameter(vendors, "vendors");
        return new Consentable(stack.getId(), stack.getIabId(), (String) null, stack.getName(), stack.getDescription(), p1.emptyMap(), (Map) null, ConsentableType.STACK, (BannerType) null, vendors, stack.getStatus(), stack.getLegIntStatus(), stack.getVendorsNumber(), 324, (u) null);
    }

    public static final void notNullOrEmpty(List<TranslatableText> list, l f10) {
        e0.checkNotNullParameter(f10, "f");
        List<TranslatableText> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        f10.invoke(list);
    }

    public static final void setupCustomTitle(AppCompatActivity appCompatActivity, int i10, int i11, int i12, String str) {
        TextView textView;
        androidx.appcompat.app.a supportActionBar;
        e0.checkNotNullParameter(appCompatActivity, "<this>");
        e0.checkNotNullParameter(str, LJjmO.dqGcEqPozgZKf);
        if (i10 != 0 && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            supportActionBar.setBackgroundDrawable(new ColorDrawable(i10));
        }
        View viewInflate = View.inflate(appCompatActivity, R.layout.appconsent_v3_custom_action_bar_title, null);
        e0.checkNotNullExpressionValue(viewInflate, "inflate(\n        this,\n …title,\n        null\n    )");
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.text_title);
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (i11 != 0 && (textView = (TextView) viewInflate.findViewById(R.id.text_title)) != null) {
            textView.setTextColor(i11);
        }
        androidx.appcompat.app.a supportActionBar2 = appCompatActivity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((CharSequence) null);
            supportActionBar2.setCustomView(viewInflate);
            supportActionBar2.setDisplayShowCustomEnabled(true);
            supportActionBar2.setDisplayHomeAsUpEnabled(true);
            if (i12 != 0) {
                Drawable drawable = m3.a.getDrawable(appCompatActivity, R.drawable.appconsent_ic_v3_back_arrow);
                supportActionBar2.setHomeAsUpIndicator(drawable != null ? DrawableExtsKt.applyTint(drawable, i12) : null);
            }
            if (UIInjector.INSTANCE.isAppRuntimeAndTargetAPI35OrAbove$appconsent_ui_v3_prodXchangeRelease()) {
                supportActionBar2.setElevation(0.0f);
            }
        }
    }

    public static final int dpToPx(Context context, int i10) {
        e0.checkNotNullParameter(context, "<this>");
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }
}
