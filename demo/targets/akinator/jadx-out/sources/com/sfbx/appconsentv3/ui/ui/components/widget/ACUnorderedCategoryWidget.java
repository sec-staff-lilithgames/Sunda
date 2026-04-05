package com.sfbx.appconsentv3.ui.ui.components.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3AcUnorderedListWithTitleWidgetBinding;
import e4.t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;
import tu.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACUnorderedCategoryWidget extends ConstraintLayout {
    private static final String AC_UNORDERED_CATEGORY_WIDGET_LINE_THEME = "AC_UNORDERED_CATEGORY_WIDGET_LINE_THEME";
    private static final String AC_UNORDERED_CATEGORY_WIDGET_TITLE_THEME = "AC_UNORDERED_CATEGORY_WIDGET_TITLE_THEME";
    public static final Companion Companion = new Companion(null);
    private AppconsentV3AcUnorderedListWithTitleWidgetBinding _binding;
    private int _textColor;
    private Map<String, Integer> themes;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Map<String, Integer> generateTheme(int i10, int i11) {
            return p1.mapOf(e0.to(ACUnorderedCategoryWidget.AC_UNORDERED_CATEGORY_WIDGET_TITLE_THEME, Integer.valueOf(i10)), e0.to(ACUnorderedCategoryWidget.AC_UNORDERED_CATEGORY_WIDGET_LINE_THEME, Integer.valueOf(i11)));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ACUnorderedCategoryWidget(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    private final void defineTextColor() {
        if (this._textColor != -1) {
            getBinding().acUnorderedListWithTitleContent.setTextColor(this._textColor);
        }
    }

    private final void extractLineTheme(Map<String, Integer> map) {
        Integer num;
        if (!map.containsKey(AC_UNORDERED_CATEGORY_WIDGET_LINE_THEME) || (num = map.get(AC_UNORDERED_CATEGORY_WIDGET_LINE_THEME)) == null) {
            return;
        }
        getBinding().acUnorderedListWithTitleContent.setLineTheme(num.intValue());
    }

    private final void extractThemesValues() {
        Map<String, Integer> map = this.themes;
        if (map != null) {
            extractTitleTheme(map);
            extractLineTheme(map);
        }
    }

    private final void extractTitleTheme(Map<String, Integer> map) {
        Integer num;
        if (!map.containsKey(AC_UNORDERED_CATEGORY_WIDGET_TITLE_THEME) || (num = map.get(AC_UNORDERED_CATEGORY_WIDGET_TITLE_THEME)) == null || num.intValue() == -1) {
            return;
        }
        t.setTextAppearance(getBinding().acUnorderedListWithTitleTitleTextview, num.intValue());
        getBinding().acUnorderedListWithTitleTitleTextview.setBackgroundColor(0);
    }

    private final AppconsentV3AcUnorderedListWithTitleWidgetBinding getBinding() {
        return this._binding;
    }

    public final void setContent(String title, List<String> content) {
        kotlin.jvm.internal.e0.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        getBinding().acUnorderedListWithTitleTitleTextview.setText(title);
        if (this._textColor != -1) {
            getBinding().acUnorderedListWithTitleTitleTextview.setTextColor(this._textColor);
        }
        getBinding().acUnorderedListWithTitleContent.addItems(content);
    }

    public /* synthetic */ ACUnorderedCategoryWidget(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACUnorderedCategoryWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this._textColor = -1;
        AppconsentV3AcUnorderedListWithTitleWidgetBinding appconsentV3AcUnorderedListWithTitleWidgetBindingInflate = AppconsentV3AcUnorderedListWithTitleWidgetBinding.inflate(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(appconsentV3AcUnorderedListWithTitleWidgetBindingInflate, "inflate(\n            Lay…           true\n        )");
        this._binding = appconsentV3AcUnorderedListWithTitleWidgetBindingInflate;
    }

    public /* synthetic */ ACUnorderedCategoryWidget(Context context, Map map, Integer num, int i10, u uVar) {
        this(context, map, (i10 & 4) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ACUnorderedCategoryWidget(Context context, Map<String, Integer> themesAttributes, Integer num) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(themesAttributes, "themesAttributes");
        this.themes = themesAttributes;
        if (num != null) {
            this._textColor = num.intValue();
        }
        extractThemesValues();
        defineTextColor();
    }
}
