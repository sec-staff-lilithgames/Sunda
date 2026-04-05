package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class InAppMessageParams {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12609a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f12610a = new HashSet();

        public Builder addAllInAppMessageCategoriesToShow() {
            this.f12610a.add(2);
            return this;
        }

        public Builder addInAppMessageCategoryToShow(int i10) {
            this.f12610a.add(Integer.valueOf(i10));
            return this;
        }

        public InAppMessageParams build() {
            return new InAppMessageParams(this.f12610a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    public /* synthetic */ InAppMessageParams(HashSet hashSet) {
        this.f12609a = new ArrayList(Collections.unmodifiableList(new ArrayList(hashSet)));
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
