package io.ktor.http;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import j1.o2;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.i0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HeaderValue {
    private final List<HeaderValueParam> params;
    private final double quality;
    private final String value;

    public HeaderValue(String value, List<HeaderValueParam> params) {
        Double d10;
        Object next;
        String value2;
        Double doubleOrNull;
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(params, "params");
        this.value = value;
        this.params = params;
        Iterator<T> it = params.iterator();
        while (true) {
            d10 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (e0.areEqual(((HeaderValueParam) next).getName(), CampaignEx.JSON_KEY_AD_Q)) {
                    break;
                }
            }
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) next;
        double dDoubleValue = 1.0d;
        if (headerValueParam != null && (value2 = headerValueParam.getValue()) != null && (doubleOrNull = i0.toDoubleOrNull(value2)) != null) {
            double dDoubleValue2 = doubleOrNull.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d10 = doubleOrNull;
            }
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            }
        }
        this.quality = dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderValue copy$default(HeaderValue headerValue, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerValue.value;
        }
        if ((i10 & 2) != 0) {
            list = headerValue.params;
        }
        return headerValue.copy(str, list);
    }

    public final String component1() {
        return this.value;
    }

    public final List<HeaderValueParam> component2() {
        return this.params;
    }

    public final HeaderValue copy(String value, List<HeaderValueParam> params) {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(params, "params");
        return new HeaderValue(value, params);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderValue)) {
            return false;
        }
        HeaderValue headerValue = (HeaderValue) obj;
        return e0.areEqual(this.value, headerValue.value) && e0.areEqual(this.params, headerValue.params);
    }

    public final List<HeaderValueParam> getParams() {
        return this.params;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.value.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValue(value=");
        sb2.append(this.value);
        sb2.append(", params=");
        return o2.p(sb2, this.params, ')');
    }

    public /* synthetic */ HeaderValue(String str, List list, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? p0.emptyList() : list);
    }
}
