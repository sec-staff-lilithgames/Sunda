package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new e0();

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f29738b;

    /* renamed from: c, reason: collision with root package name */
    public z.f f29739c;

    /* renamed from: e, reason: collision with root package name */
    public d0 f29740e;

    public RemoteMessage(Bundle bundle) {
        this.f29738b = bundle;
    }

    public String getCollapseKey() {
        return this.f29738b.getString("collapse_key");
    }

    public Map<String, String> getData() {
        if (this.f29739c == null) {
            this.f29739c = i.extractDeveloperDefinedPayload(this.f29738b);
        }
        return this.f29739c;
    }

    public String getFrom() {
        return this.f29738b.getString("from");
    }

    public String getMessageId() {
        Bundle bundle = this.f29738b;
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public String getMessageType() {
        return this.f29738b.getString("message_type");
    }

    public d0 getNotification() {
        if (this.f29740e == null) {
            Bundle bundle = this.f29738b;
            if (z.isNotification(bundle)) {
                this.f29740e = new d0(new z(bundle));
            }
        }
        return this.f29740e;
    }

    public int getOriginalPriority() {
        Bundle bundle = this.f29738b;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public int getPriority() {
        Bundle bundle = this.f29738b;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public byte[] getRawData() {
        return this.f29738b.getByteArray("rawData");
    }

    public String getSenderId() {
        return this.f29738b.getString("google.c.sender.id");
    }

    public long getSentTime() {
        Object obj = this.f29738b.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    @Deprecated
    public String getTo() {
        return this.f29738b.getString("google.to");
    }

    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.f29738b);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f29738b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public int getTtl() {
        Object obj = this.f29738b.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w(TJzY.EVXTHutKv, "Invalid TTL: " + obj);
            return 0;
        }
    }
}
