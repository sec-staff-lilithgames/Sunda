package g0;

import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e4 {
    public static final s3 ValueInsets(o3.c insets, String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return new s3(toInsetsValues(insets), name);
    }

    public static final boolean getAreNavigationBarsVisible(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(710310464);
        boolean zIsVisible = x3.f56628v.current(wVar, 8).getNavigationBars().isVisible();
        wVar.endReplaceableGroup();
        return zIsVisible;
    }

    public static final boolean getAreStatusBarsVisible(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(1613283456);
        boolean zIsVisible = x3.f56628v.current(wVar, 8).getStatusBars().isVisible();
        wVar.endReplaceableGroup();
        return zIsVisible;
    }

    public static final boolean getAreSystemBarsVisible(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(1985490720);
        boolean zIsVisible = x3.f56628v.current(wVar, 8).getSystemBars().isVisible();
        wVar.endReplaceableGroup();
        return zIsVisible;
    }

    public static final v3 getCaptionBar(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1832025528);
        c captionBar = x3.f56628v.current(wVar, 8).getCaptionBar();
        wVar.endReplaceableGroup();
        return captionBar;
    }

    public static final v3 getCaptionBarIgnoringVisibility(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1731251574);
        s3 captionBarIgnoringVisibility = x3.f56628v.current(wVar, 8).getCaptionBarIgnoringVisibility();
        wVar.endReplaceableGroup();
        return captionBarIgnoringVisibility;
    }

    public static final boolean getConsumeWindowInsets(a2.h2 h2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(h2Var, "<this>");
        Object tag = h2Var.getTag(R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final v3 getDisplayCutout(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(1324817724);
        c displayCutout = x3.f56628v.current(wVar, 8).getDisplayCutout();
        wVar.endReplaceableGroup();
        return displayCutout;
    }

    public static final v3 getIme(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1466917860);
        c ime = x3.f56628v.current(wVar, 8).getIme();
        wVar.endReplaceableGroup();
        return ime;
    }

    public static final v3 getMandatorySystemGestures(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(1369492988);
        c mandatorySystemGestures = x3.f56628v.current(wVar, 8).getMandatorySystemGestures();
        wVar.endReplaceableGroup();
        return mandatorySystemGestures;
    }

    public static final v3 getNavigationBars(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(1596175702);
        c navigationBars = x3.f56628v.current(wVar, 8).getNavigationBars();
        wVar.endReplaceableGroup();
        return navigationBars;
    }

    public static final v3 getNavigationBarsIgnoringVisibility(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1990981160);
        s3 navigationBarsIgnoringVisibility = x3.f56628v.current(wVar, 8).getNavigationBarsIgnoringVisibility();
        wVar.endReplaceableGroup();
        return navigationBarsIgnoringVisibility;
    }

    public static final v3 getSafeContent(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-2026663876);
        v3 safeContent = x3.f56628v.current(wVar, 8).getSafeContent();
        wVar.endReplaceableGroup();
        return safeContent;
    }

    public static final v3 getSafeDrawing(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-49441252);
        v3 safeDrawing = x3.f56628v.current(wVar, 8).getSafeDrawing();
        wVar.endReplaceableGroup();
        return safeDrawing;
    }

    public static final v3 getSafeGestures(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1594247780);
        v3 safeGestures = x3.f56628v.current(wVar, 8).getSafeGestures();
        wVar.endReplaceableGroup();
        return safeGestures;
    }

    public static final v3 getStatusBars(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-675090670);
        c statusBars = x3.f56628v.current(wVar, 8).getStatusBars();
        wVar.endReplaceableGroup();
        return statusBars;
    }

    public static final v3 getStatusBarsIgnoringVisibility(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(594020756);
        s3 statusBarsIgnoringVisibility = x3.f56628v.current(wVar, 8).getStatusBarsIgnoringVisibility();
        wVar.endReplaceableGroup();
        return statusBarsIgnoringVisibility;
    }

    public static final v3 getSystemBars(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-282936756);
        c systemBars = x3.f56628v.current(wVar, 8).getSystemBars();
        wVar.endReplaceableGroup();
        return systemBars;
    }

    public static final v3 getSystemBarsIgnoringVisibility(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(1564566798);
        s3 systemBarsIgnoringVisibility = x3.f56628v.current(wVar, 8).getSystemBarsIgnoringVisibility();
        wVar.endReplaceableGroup();
        return systemBarsIgnoringVisibility;
    }

    public static final v3 getSystemGestures(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(989216224);
        c systemGestures = x3.f56628v.current(wVar, 8).getSystemGestures();
        wVar.endReplaceableGroup();
        return systemGestures;
    }

    public static final v3 getTappableElement(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1994205284);
        c tappableElement = x3.f56628v.current(wVar, 8).getTappableElement();
        wVar.endReplaceableGroup();
        return tappableElement;
    }

    public static final v3 getTappableElementIgnoringVisibility(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1488788292);
        s3 tappableElementIgnoringVisibility = x3.f56628v.current(wVar, 8).getTappableElementIgnoringVisibility();
        wVar.endReplaceableGroup();
        return tappableElementIgnoringVisibility;
    }

    public static final v3 getWaterfall(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(1943241020);
        s3 waterfall = x3.f56628v.current(wVar, 8).getWaterfall();
        wVar.endReplaceableGroup();
        return waterfall;
    }

    public static final boolean isCaptionBarVisible(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-501076620);
        boolean zIsVisible = x3.f56628v.current(wVar, 8).getCaptionBar().isVisible();
        wVar.endReplaceableGroup();
        return zIsVisible;
    }

    public static final boolean isImeVisible(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1873571424);
        boolean zIsVisible = x3.f56628v.current(wVar, 8).getIme().isVisible();
        wVar.endReplaceableGroup();
        return zIsVisible;
    }

    public static final boolean isTappableElementVisible(u3 u3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u3Var, "<this>");
        wVar.startReplaceableGroup(-1737201120);
        boolean zIsVisible = x3.f56628v.current(wVar, 8).getTappableElement().isVisible();
        wVar.endReplaceableGroup();
        return zIsVisible;
    }

    public static final void setConsumeWindowInsets(a2.h2 h2Var, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(h2Var, "<this>");
        h2Var.setTag(R.id.consume_window_insets_tag, Boolean.valueOf(z10));
    }

    public static final b1 toInsetsValues(o3.c cVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cVar, "<this>");
        return new b1(cVar.f77432a, cVar.f77433b, cVar.f77434c, cVar.f77435d);
    }

    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void getAreStatusBarsVisible$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void getAreSystemBarsVisible$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void isCaptionBarVisible$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void isImeVisible$annotations(u3 u3Var) {
    }

    public static /* synthetic */ void isTappableElementVisible$annotations(u3 u3Var) {
    }
}
