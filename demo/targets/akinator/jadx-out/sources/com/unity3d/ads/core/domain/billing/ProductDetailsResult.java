package com.unity3d.ads.core.domain.billing;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class ProductDetailsResult {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Failure extends ProductDetailsResult {
        private final BillingResultBridge billingResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(BillingResultBridge billingResult) {
            super(null);
            e0.checkNotNullParameter(billingResult, "billingResult");
            this.billingResult = billingResult;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        public final BillingResultBridge component1() {
            return this.billingResult;
        }

        public final Failure copy(BillingResultBridge billingResult) {
            e0.checkNotNullParameter(billingResult, "billingResult");
            return new Failure(billingResult);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && e0.areEqual(this.billingResult, ((Failure) obj).billingResult);
        }

        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NotFound extends ProductDetailsResult {
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Success extends ProductDetailsResult {
        private final String productDetailsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String productDetailsJson) {
            super(null);
            e0.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            this.productDetailsJson = productDetailsJson;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.productDetailsJson;
        }

        public final Success copy(String productDetailsJson) {
            e0.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            return new Success(productDetailsJson);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && e0.areEqual(this.productDetailsJson, ((Success) obj).productDetailsJson);
        }

        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        public String toString() {
            return o2.q(new StringBuilder("Success(productDetailsJson="), this.productDetailsJson, ')');
        }
    }

    public /* synthetic */ ProductDetailsResult(u uVar) {
        this();
    }

    private ProductDetailsResult() {
    }
}
