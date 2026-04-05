package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import qg.d;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f29284i = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public boolean f29285f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29286g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29287h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public boolean f29288e;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f29288e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29288e = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isCheckable() {
        return this.f29286g;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29285f;
    }

    public boolean isPressable() {
        return this.f29287h;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        return this.f29285f ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f29284i) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f29288e);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29288e = this.f29285f;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f29286g != z10) {
            this.f29286g = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f29286g || this.f29285f == z10) {
            return;
        }
        this.f29285f = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f29287h = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f29287h) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f29285f);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29286g = true;
        this.f29287h = true;
        z1.setAccessibilityDelegate(this, new d(this));
    }
}
