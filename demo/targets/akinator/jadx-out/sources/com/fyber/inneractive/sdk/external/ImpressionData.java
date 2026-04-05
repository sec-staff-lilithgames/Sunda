package com.fyber.inneractive.sdk.external;

import j1.o2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class ImpressionData {

    /* renamed from: a, reason: collision with root package name */
    public Pricing f23470a = new Pricing();

    /* renamed from: b, reason: collision with root package name */
    public Video f23471b;

    /* renamed from: c, reason: collision with root package name */
    public String f23472c;

    /* renamed from: d, reason: collision with root package name */
    public Long f23473d;

    /* renamed from: e, reason: collision with root package name */
    public String f23474e;

    /* renamed from: f, reason: collision with root package name */
    public String f23475f;

    /* renamed from: g, reason: collision with root package name */
    public String f23476g;

    /* renamed from: h, reason: collision with root package name */
    public String f23477h;

    /* renamed from: i, reason: collision with root package name */
    public String f23478i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Pricing {

        /* renamed from: a, reason: collision with root package name */
        public double f23479a;

        /* renamed from: b, reason: collision with root package name */
        public String f23480b;

        public String getCurrency() {
            return this.f23480b;
        }

        public double getValue() {
            return this.f23479a;
        }

        public void setValue(double d10) {
            this.f23479a = d10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Pricing{value=");
            sb2.append(this.f23479a);
            sb2.append(", currency='");
            return o2.o(sb2, this.f23480b, "'}");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Video {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f23481a;

        /* renamed from: b, reason: collision with root package name */
        public long f23482b;

        public Video(boolean z10, long j10) {
            this.f23481a = z10;
            this.f23482b = j10;
        }

        public long getDuration() {
            return this.f23482b;
        }

        public boolean isSkippable() {
            return this.f23481a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Video{skippable=");
            sb2.append(this.f23481a);
            sb2.append(", duration=");
            return e3.g.n(sb2, this.f23482b, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public String getAdvertiserDomain() {
        return this.f23478i;
    }

    public String getCampaignId() {
        return this.f23477h;
    }

    public String getCountry() {
        return this.f23474e;
    }

    public String getCreativeId() {
        return this.f23476g;
    }

    public Long getDemandId() {
        return this.f23473d;
    }

    public String getDemandSource() {
        return this.f23472c;
    }

    public String getImpressionId() {
        return this.f23475f;
    }

    public Pricing getPricing() {
        return this.f23470a;
    }

    public Video getVideo() {
        return this.f23471b;
    }

    public void setAdvertiserDomain(String str) {
        this.f23478i = str;
    }

    public void setCampaignId(String str) {
        this.f23477h = str;
    }

    public void setCountry(String str) {
        this.f23474e = str;
    }

    public void setCpmValue(String str) throws NumberFormatException {
        double d10;
        try {
            d10 = Double.parseDouble(str);
        } catch (Exception unused) {
            d10 = 0.0d;
        }
        this.f23470a.f23479a = d10;
    }

    public void setCreativeId(String str) {
        this.f23476g = str;
    }

    public void setCurrency(String str) {
        this.f23470a.f23480b = str;
    }

    public void setDemandId(Long l9) {
        this.f23473d = l9;
    }

    public void setDemandSource(String str) {
        this.f23472c = str;
    }

    public void setDuration(long j10) {
        this.f23471b.f23482b = j10;
    }

    public void setImpressionId(String str) {
        this.f23475f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f23470a = pricing;
    }

    public void setVideo(Video video) {
        this.f23471b = video;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImpressionData{pricing=");
        sb2.append(this.f23470a);
        sb2.append(", video=");
        sb2.append(this.f23471b);
        sb2.append(", demandSource='");
        sb2.append(this.f23472c);
        sb2.append("', country='");
        sb2.append(this.f23474e);
        sb2.append("', impressionId='");
        sb2.append(this.f23475f);
        sb2.append("', creativeId='");
        sb2.append(this.f23476g);
        sb2.append("', campaignId='");
        sb2.append(this.f23477h);
        sb2.append("', advertiserDomain='");
        return o2.o(sb2, this.f23478i, "'}");
    }
}
