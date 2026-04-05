package com.bumptech.glide;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum j {
    /* JADX INFO: Fake field, exist only in values array */
    LOW(0.5f),
    NORMAL(1.0f),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH(1.5f);


    /* renamed from: b, reason: collision with root package name */
    public final float f16576b;

    j(float f10) {
        this.f16576b = f10;
    }

    public float getMultiplier() {
        return this.f16576b;
    }
}
