package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Objects;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    final Intent zza;
    private Map zzb;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public CloudMessage(Intent intent) {
        this.zza = intent;
    }

    private static int zzb(String str) {
        if (Objects.equals(str, "high")) {
            return 1;
        }
        return Objects.equals(str, "normal") ? 2 : 0;
    }

    public String getCollapseKey() {
        return this.zza.getStringExtra("collapse_key");
    }

    public synchronized Map<String, String> getData() {
        try {
            if (this.zzb == null) {
                Bundle extras = this.zza.getExtras();
                f fVar = new f();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith("google.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                                fVar.put(str, str2);
                            }
                        }
                    }
                }
                this.zzb = fVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzb;
    }

    public String getFrom() {
        return this.zza.getStringExtra("from");
    }

    public Intent getIntent() {
        return this.zza;
    }

    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra("google.message_id");
        return stringExtra == null ? this.zza.getStringExtra("message_id") : stringExtra;
    }

    public String getMessageType() {
        return this.zza.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra("google.original_priority");
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zzb(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.zza.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if (Objects.equals(this.zza.getStringExtra("google.priority_reduced"), "1")) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zzb(stringExtra);
    }

    public byte[] getRawData() {
        return this.zza.getByteArrayExtra("rawData");
    }

    public String getSenderId() {
        return this.zza.getStringExtra("google.c.sender.id");
    }

    public String getTo() {
        return this.zza.getStringExtra("google.to");
    }

    public int getTtl() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.ttl") : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("CloudMessage", "Invalid TTL: ".concat(String.valueOf(obj)));
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Integer zza() {
        if (this.zza.hasExtra("google.product_id")) {
            return Integer.valueOf(this.zza.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public long getSentTime() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.sent_time") : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("CloudMessage", OcvDtWCQ.pjCUvvmPDmlXz.concat(String.valueOf(obj)));
            return 0L;
        }
    }
}
