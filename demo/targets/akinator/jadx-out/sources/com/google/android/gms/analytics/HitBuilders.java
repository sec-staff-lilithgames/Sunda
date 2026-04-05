package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.gtm.zzen;
import com.google.android.gms.internal.gtm.zzff;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class HitBuilders {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public static class AppViewBuilder extends HitBuilder<AppViewBuilder> {
        public AppViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ExceptionBuilder extends HitBuilder<ExceptionBuilder> {
        public ExceptionBuilder() {
            set("&t", "exception");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        public ExceptionBuilder setDescription(String str) {
            set("&exd", str);
            return this;
        }

        public ExceptionBuilder setFatal(boolean z10) {
            set("&exf", zzff.zzc(z10));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public static class ItemBuilder extends HitBuilder<ItemBuilder> {
        public ItemBuilder() {
            set("&t", "item");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        public ItemBuilder setCategory(String str) {
            set("&iv", str);
            return this;
        }

        public ItemBuilder setCurrencyCode(String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        public ItemBuilder setName(String str) {
            set("&in", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        public ItemBuilder setPrice(double d10) {
            set("&ip", Double.toString(d10));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }

        public ItemBuilder setQuantity(long j10) {
            set("&iq", Long.toString(j10));
            return this;
        }

        public ItemBuilder setSku(String str) {
            set("&ic", str);
            return this;
        }

        public ItemBuilder setTransactionId(String str) {
            set("&ti", str);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ScreenViewBuilder extends HitBuilder<ScreenViewBuilder> {
        public ScreenViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SocialBuilder extends HitBuilder<SocialBuilder> {
        public SocialBuilder() {
            set("&t", NotificationCompat.CATEGORY_SOCIAL);
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        public SocialBuilder setAction(String str) {
            set("&sa", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        public SocialBuilder setNetwork(String str) {
            set("&sn", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }

        public SocialBuilder setTarget(String str) {
            set("&st", str);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public static class TransactionBuilder extends HitBuilder<TransactionBuilder> {
        public TransactionBuilder() {
            set("&t", "transaction");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        public TransactionBuilder setAffiliation(String str) {
            set("&ta", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        public TransactionBuilder setCurrencyCode(String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }

        public TransactionBuilder setRevenue(double d10) {
            set("&tr", Double.toString(d10));
            return this;
        }

        public TransactionBuilder setShipping(double d10) {
            set("&ts", Double.toString(d10));
            return this;
        }

        public TransactionBuilder setTax(double d10) {
            set("&tt", Double.toString(d10));
            return this;
        }

        public TransactionBuilder setTransactionId(String str) {
            set("&ti", str);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class EventBuilder extends HitBuilder<EventBuilder> {
        public EventBuilder() {
            set("&t", NotificationCompat.CATEGORY_EVENT);
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        public EventBuilder setAction(String str) {
            set("&ea", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        public EventBuilder setCategory(String str) {
            set("&ec", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        public EventBuilder setLabel(String str) {
            set("&el", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }

        public EventBuilder setValue(long j10) {
            set("&ev", Long.toString(j10));
            return this;
        }

        public EventBuilder(String str, String str2) {
            this();
            setCategory(str);
            setAction(str2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class HitBuilder<T extends HitBuilder> {
        ProductAction zza;
        private final Map zze = new HashMap();
        final Map zzb = new HashMap();
        final List zzc = new ArrayList();
        final List zzd = new ArrayList();

        private final HitBuilder zza(String str, String str2) {
            if (str2 != null) {
                this.zze.put(str, str2);
            }
            return this;
        }

        public T addImpression(Product product, String str) {
            if (product == null) {
                zzen.zze("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, new ArrayList());
            }
            ((List) this.zzb.get(str)).add(product);
            return this;
        }

        public T addProduct(Product product) {
            if (product == null) {
                zzen.zze("product should be non-null");
                return this;
            }
            this.zzd.add(product);
            return this;
        }

        public T addPromotion(Promotion promotion) {
            if (promotion == null) {
                zzen.zze("promotion should be non-null");
                return this;
            }
            this.zzc.add(promotion);
            return this;
        }

        public Map<String, String> build() {
            HashMap map = new HashMap(this.zze);
            ProductAction productAction = this.zza;
            if (productAction != null) {
                map.putAll(productAction.zza());
            }
            Iterator it = this.zzc.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                map.putAll(((Promotion) it.next()).zza(zzd.zzl(i10)));
                i10++;
            }
            Iterator it2 = this.zzd.iterator();
            int i11 = 1;
            while (it2.hasNext()) {
                map.putAll(((Product) it2.next()).zza(zzd.zzj(i11)));
                i11++;
            }
            int i12 = 1;
            for (Map.Entry entry : this.zzb.entrySet()) {
                List list = (List) entry.getValue();
                String strZzg = zzd.zzg(i12);
                Iterator it3 = list.iterator();
                int i13 = 1;
                while (it3.hasNext()) {
                    map.putAll(((Product) it3.next()).zza(strZzg.concat(zzd.zzi(i13))));
                    i13++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    map.put(strZzg.concat("nm"), (String) entry.getKey());
                }
                i12++;
            }
            return map;
        }

        public String get(String str) {
            return (String) this.zze.get(str);
        }

        public final T set(String str, String str2) {
            if (str != null) {
                this.zze.put(str, str2);
                return this;
            }
            zzen.zze("HitBuilder.set() called with a null paramName.");
            return this;
        }

        public final T setAll(Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.zze.putAll(new HashMap(map));
            return this;
        }

        public T setCustomDimension(int i10, String str) {
            set(zzd.zza(i10), str);
            return this;
        }

        public T setCustomMetric(int i10, float f10) {
            set(zzd.zzd(i10), Float.toString(f10));
            return this;
        }

        public T setHitType(String str) {
            set("&t", str);
            return this;
        }

        public T setNewSession() {
            set("&sc", "start");
            return this;
        }

        public T setNonInteraction(boolean z10) {
            set("&ni", zzff.zzc(z10));
            return this;
        }

        public T setProductAction(ProductAction productAction) {
            this.zza = productAction;
            return this;
        }

        public T setPromotionAction(String str) {
            this.zze.put("&promoa", str);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T setCampaignParamsFromUrl(java.lang.String r15) throws java.io.UnsupportedEncodingException {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.HitBuilders.HitBuilder.setCampaignParamsFromUrl(java.lang.String):com.google.android.gms.analytics.HitBuilders$HitBuilder");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class TimingBuilder extends HitBuilder<TimingBuilder> {
        public TimingBuilder() {
            set("&t", "timing");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(String str) throws UnsupportedEncodingException {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        public TimingBuilder setCategory(String str) {
            set("&utc", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i10, String str) {
            super.setCustomDimension(i10, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i10, float f10) {
            super.setCustomMetric(i10, f10);
            return this;
        }

        public TimingBuilder setLabel(String str) {
            set("&utl", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z10) {
            super.setNonInteraction(z10);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(String str) {
            super.setPromotionAction(str);
            return this;
        }

        public TimingBuilder setValue(long j10) {
            set("&utt", Long.toString(j10));
            return this;
        }

        public TimingBuilder setVariable(String str) {
            set("&utv", str);
            return this;
        }

        public TimingBuilder(String str, String str2, long j10) {
            this();
            setVariable(str2);
            setValue(j10);
            setCategory(str);
        }
    }
}
