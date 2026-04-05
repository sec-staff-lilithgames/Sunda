package com.sfbx.appconsentv3.ui.ui.components.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.LinearLayoutCompat;
import ao.kwoC.zAQQWzBxnS;
import com.google.android.gms.internal.play_billing.a;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3AcUnorderedCategoryListWidgetBinding;
import com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedCategoryListWidget;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACUnorderedCategoryListWidget extends LinearLayoutCompat {
    public static final ACUnorderedCategoryListWidgetUI ACUnorderedCategoryListWidgetUI = new ACUnorderedCategoryListWidgetUI(null);
    private AppconsentV3AcUnorderedCategoryListWidgetBinding _binding;
    private List<ACUnorderedCategoryListWidgetUI.CategoryUI> _categories;
    private int lineTheme;
    private int titleTheme;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ACUnorderedCategoryListWidgetUI {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class CategoryUI {
            private final List<String> content;
            private final CategoryUIPosition position;
            private final Integer textColor;
            private final String title;

            public CategoryUI(String title, List<String> content, CategoryUIPosition position, Integer num) {
                e0.checkNotNullParameter(title, "title");
                e0.checkNotNullParameter(content, "content");
                e0.checkNotNullParameter(position, "position");
                this.title = title;
                this.content = content;
                this.position = position;
                this.textColor = num;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CategoryUI copy$default(CategoryUI categoryUI, String str, List list, CategoryUIPosition categoryUIPosition, Integer num, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = categoryUI.title;
                }
                if ((i10 & 2) != 0) {
                    list = categoryUI.content;
                }
                if ((i10 & 4) != 0) {
                    categoryUIPosition = categoryUI.position;
                }
                if ((i10 & 8) != 0) {
                    num = categoryUI.textColor;
                }
                return categoryUI.copy(str, list, categoryUIPosition, num);
            }

            public final String component1$appconsent_ui_v3_prodXchangeRelease() {
                return this.title;
            }

            public final List<String> component2$appconsent_ui_v3_prodXchangeRelease() {
                return this.content;
            }

            public final CategoryUIPosition component3$appconsent_ui_v3_prodXchangeRelease() {
                return this.position;
            }

            public final Integer component4$appconsent_ui_v3_prodXchangeRelease() {
                return this.textColor;
            }

            public final CategoryUI copy(String title, List<String> content, CategoryUIPosition position, Integer num) {
                e0.checkNotNullParameter(title, "title");
                e0.checkNotNullParameter(content, "content");
                e0.checkNotNullParameter(position, "position");
                return new CategoryUI(title, content, position, num);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!e0.areEqual(CategoryUI.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                e0.checkNotNull(obj, "null cannot be cast to non-null type com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI");
                return this.position == ((CategoryUI) obj).position;
            }

            public final List<String> getContent$appconsent_ui_v3_prodXchangeRelease() {
                return this.content;
            }

            public final CategoryUIPosition getPosition$appconsent_ui_v3_prodXchangeRelease() {
                return this.position;
            }

            public final Integer getTextColor$appconsent_ui_v3_prodXchangeRelease() {
                return this.textColor;
            }

            public final String getTitle$appconsent_ui_v3_prodXchangeRelease() {
                return this.title;
            }

            public int hashCode() {
                return this.position.hashCode();
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(zAQQWzBxnS.gbytoGMTvNnMCEz);
                sb2.append(this.title);
                sb2.append(", content=");
                sb2.append(this.content);
                sb2.append(", position=");
                sb2.append(this.position);
                sb2.append(", textColor=");
                return a.j(sb2, this.textColor, ')');
            }

            public /* synthetic */ CategoryUI(String str, List list, CategoryUIPosition categoryUIPosition, Integer num, int i10, u uVar) {
                this(str, list, categoryUIPosition, (i10 & 8) != 0 ? null : num);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum CategoryUIPosition {
            FIRST(0),
            SECOND(1),
            LAST(2);

            private final int value;

            CategoryUIPosition(int i10) {
                this.value = i10;
            }

            public final int getValue$appconsent_ui_v3_prodXchangeRelease() {
                return this.value;
            }
        }

        public /* synthetic */ ACUnorderedCategoryListWidgetUI(u uVar) {
            this();
        }

        private ACUnorderedCategoryListWidgetUI() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ACUnorderedCategoryListWidget(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final void addCategories() {
        prepareLayout();
        Iterator it = y0.sortedWith(getCategories(), new Comparator() { // from class: com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedCategoryListWidget$addCategories$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(Integer.valueOf(((ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI) t10).getPosition$appconsent_ui_v3_prodXchangeRelease().getValue$appconsent_ui_v3_prodXchangeRelease()), Integer.valueOf(((ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI) t11).getPosition$appconsent_ui_v3_prodXchangeRelease().getValue$appconsent_ui_v3_prodXchangeRelease()));
            }
        }).iterator();
        while (it.hasNext()) {
            addCategory((ACUnorderedCategoryListWidgetUI.CategoryUI) it.next());
        }
    }

    private final void addCategory(ACUnorderedCategoryListWidgetUI.CategoryUI categoryUI) {
        Map<String, Integer> mapGenerateTheme = ACUnorderedCategoryWidget.Companion.generateTheme(this.titleTheme, this.lineTheme);
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "this.context");
        final ACUnorderedCategoryWidget aCUnorderedCategoryWidget = new ACUnorderedCategoryWidget(context, mapGenerateTheme, categoryUI.getTextColor$appconsent_ui_v3_prodXchangeRelease());
        aCUnorderedCategoryWidget.setBackgroundColor(0);
        if (categoryUI.getPosition$appconsent_ui_v3_prodXchangeRelease() != ACUnorderedCategoryListWidgetUI.CategoryUIPosition.FIRST) {
            aCUnorderedCategoryWidget.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedCategoryListWidget$addCategory$1$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() throws Resources.NotFoundException {
                    int iDpToPx;
                    try {
                        iDpToPx = aCUnorderedCategoryWidget.getContext().getResources().getDimensionPixelSize(R.dimen.appconsent_v3_margin_xs);
                    } catch (Exception unused) {
                        Context context2 = aCUnorderedCategoryWidget.getContext();
                        e0.checkNotNullExpressionValue(context2, "acUnorderedCategoryWidget.context");
                        iDpToPx = ExtensionKt.dpToPx(context2, 8);
                    }
                    ViewGroup.LayoutParams layoutParams = aCUnorderedCategoryWidget.getLayoutParams();
                    e0.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = iDpToPx;
                    aCUnorderedCategoryWidget.setLayoutParams(marginLayoutParams);
                    aCUnorderedCategoryWidget.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
        aCUnorderedCategoryWidget.setContent(categoryUI.getTitle$appconsent_ui_v3_prodXchangeRelease(), categoryUI.getContent$appconsent_ui_v3_prodXchangeRelease());
        getBinding().acUnorderedCategoryListWidget.addView(aCUnorderedCategoryWidget);
    }

    private final AppconsentV3AcUnorderedCategoryListWidgetBinding getBinding() {
        return this._binding;
    }

    private final List<ACUnorderedCategoryListWidgetUI.CategoryUI> getCategories() {
        return this._categories;
    }

    private final void prepareLayout() {
        getBinding().acUnorderedCategoryListWidget.removeAllViews();
    }

    public final void refreshViewAndAddCategory(ACUnorderedCategoryListWidgetUI.CategoryUI category) {
        e0.checkNotNullParameter(category, "category");
        if (this._categories.contains(category)) {
            return;
        }
        this._categories.add(category);
        addCategories();
    }

    public /* synthetic */ ACUnorderedCategoryListWidget(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACUnorderedCategoryListWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.titleTheme = -1;
        this.lineTheme = -1;
        this._categories = new ArrayList();
        AppconsentV3AcUnorderedCategoryListWidgetBinding appconsentV3AcUnorderedCategoryListWidgetBindingInflate = AppconsentV3AcUnorderedCategoryListWidgetBinding.inflate(LayoutInflater.from(context), this, true);
        e0.checkNotNullExpressionValue(appconsentV3AcUnorderedCategoryListWidgetBindingInflate, "inflate(\n            Lay…           true\n        )");
        this._binding = appconsentV3AcUnorderedCategoryListWidgetBindingInflate;
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ACUnorderedCategoryListWidget);
            e0.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…rderedCategoryListWidget)");
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ACUnorderedCategoryListWidget_ac_list_titleTheme)) {
                this.titleTheme = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ACUnorderedCategoryListWidget_ac_list_titleTheme, -1);
            }
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ACUnorderedCategoryListWidget_ac_list_lineTheme)) {
                this.lineTheme = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ACUnorderedCategoryListWidget_ac_list_lineTheme, -1);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
