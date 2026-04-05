package com.sfbx.appconsentv3.ui.ui.components.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3AcUnorderedListWidgetBinding;
import com.sfbx.appconsentv3.ui.ui.components.molecule.ACListMolecule;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACUnorderedListWidget extends LinearLayoutCompat {
    private Integer _textColor;
    private int lineTheme;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ACUnorderedListWidget(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final void addItem(String str) {
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "this.context");
        ACListMolecule aCListMolecule = new ACListMolecule(context, this.lineTheme, this._textColor);
        aCListMolecule.setBackgroundColor(0);
        aCListMolecule.setContent(str);
        addView(aCListMolecule);
    }

    public final void addItems(List<String> contentsToDisplay) {
        e0.checkNotNullParameter(contentsToDisplay, "contentsToDisplay");
        Iterator<T> it = contentsToDisplay.iterator();
        while (it.hasNext()) {
            addItem((String) it.next());
        }
    }

    public final void setLineTheme(int i10) {
        this.lineTheme = i10;
    }

    public final void setTextColor(int i10) {
        this._textColor = Integer.valueOf(i10);
    }

    public /* synthetic */ ACUnorderedListWidget(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACUnorderedListWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.lineTheme = -1;
        AppconsentV3AcUnorderedListWidgetBinding.inflate(LayoutInflater.from(context), this, true);
        setOrientation(1);
    }
}
