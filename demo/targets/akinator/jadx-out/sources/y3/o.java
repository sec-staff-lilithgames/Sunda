package y3;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityRecord f94064a;

    @Deprecated
    public o(Object obj) {
        this.f94064a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static o obtain(o oVar) {
        return new o(AccessibilityRecord.obtain(oVar.f94064a));
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        AccessibilityRecord accessibilityRecord = ((o) obj).f94064a;
        AccessibilityRecord accessibilityRecord2 = this.f94064a;
        return accessibilityRecord2 == null ? accessibilityRecord == null : accessibilityRecord2.equals(accessibilityRecord);
    }

    @Deprecated
    public int getAddedCount() {
        return this.f94064a.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.f94064a.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.f94064a.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.f94064a.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.f94064a.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.f94064a.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.f94064a;
    }

    @Deprecated
    public int getItemCount() {
        return this.f94064a.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.f94064a);
    }

    @Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.f94064a);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.f94064a.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.f94064a.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.f94064a.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.f94064a.getScrollY();
    }

    @Deprecated
    public c getSource() {
        return c.e(this.f94064a.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        return this.f94064a.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.f94064a.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.f94064a.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f94064a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.f94064a.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.f94064a.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.f94064a.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.f94064a.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.f94064a.isScrollable();
    }

    @Deprecated
    public void recycle() {
        this.f94064a.recycle();
    }

    @Deprecated
    public void setAddedCount(int i10) {
        this.f94064a.setAddedCount(i10);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        this.f94064a.setBeforeText(charSequence);
    }

    @Deprecated
    public void setChecked(boolean z10) {
        this.f94064a.setChecked(z10);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        this.f94064a.setClassName(charSequence);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        this.f94064a.setContentDescription(charSequence);
    }

    @Deprecated
    public void setCurrentItemIndex(int i10) {
        this.f94064a.setCurrentItemIndex(i10);
    }

    @Deprecated
    public void setEnabled(boolean z10) {
        this.f94064a.setEnabled(z10);
    }

    @Deprecated
    public void setFromIndex(int i10) {
        this.f94064a.setFromIndex(i10);
    }

    @Deprecated
    public void setFullScreen(boolean z10) {
        this.f94064a.setFullScreen(z10);
    }

    @Deprecated
    public void setItemCount(int i10) {
        this.f94064a.setItemCount(i10);
    }

    @Deprecated
    public void setMaxScrollX(int i10) {
        setMaxScrollX(this.f94064a, i10);
    }

    @Deprecated
    public void setMaxScrollY(int i10) {
        setMaxScrollY(this.f94064a, i10);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        this.f94064a.setParcelableData(parcelable);
    }

    @Deprecated
    public void setPassword(boolean z10) {
        this.f94064a.setPassword(z10);
    }

    @Deprecated
    public void setRemovedCount(int i10) {
        this.f94064a.setRemovedCount(i10);
    }

    @Deprecated
    public void setScrollX(int i10) {
        this.f94064a.setScrollX(i10);
    }

    @Deprecated
    public void setScrollY(int i10) {
        this.f94064a.setScrollY(i10);
    }

    @Deprecated
    public void setScrollable(boolean z10) {
        this.f94064a.setScrollable(z10);
    }

    @Deprecated
    public void setSource(View view) {
        this.f94064a.setSource(view);
    }

    @Deprecated
    public void setToIndex(int i10) {
        this.f94064a.setToIndex(i10);
    }

    @Deprecated
    public static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    @Deprecated
    public static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static o obtain() {
        return new o(AccessibilityRecord.obtain());
    }

    @Deprecated
    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    @Deprecated
    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    @Deprecated
    public void setSource(View view, int i10) {
        setSource(this.f94064a, view, i10);
    }

    @Deprecated
    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
