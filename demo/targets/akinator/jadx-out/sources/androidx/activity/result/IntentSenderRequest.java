package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import i.k;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final IntentSender f4653b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f4654c;

    /* renamed from: e, reason: collision with root package name */
    public final int f4655e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4656f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final IntentSender f4657a;

        /* renamed from: b, reason: collision with root package name */
        public Intent f4658b;

        /* renamed from: c, reason: collision with root package name */
        public int f4659c;

        /* renamed from: d, reason: collision with root package name */
        public int f4660d;

        public a(IntentSender intentSender) {
            e0.checkNotNullParameter(intentSender, "intentSender");
            this.f4657a = intentSender;
        }

        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.f4657a, this.f4658b, this.f4659c, this.f4660d);
        }

        public final a setFillInIntent(Intent intent) {
            this.f4658b = intent;
            return this;
        }

        public final a setFlags(int i10, int i11) {
            this.f4660d = i10;
            this.f4659c = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            e0.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            e0.checkNotNullExpressionValue(intentSender, "getIntentSender(...)");
            this(intentSender);
        }
    }

    static {
        new b(null);
        CREATOR = new k();
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        e0.checkNotNullParameter(intentSender, "intentSender");
        this.f4653b = intentSender;
        this.f4654c = intent;
        this.f4655e = i10;
        this.f4656f = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getFillInIntent() {
        return this.f4654c;
    }

    public final int getFlagsMask() {
        return this.f4655e;
    }

    public final int getFlagsValues() {
        return this.f4656f;
    }

    public final IntentSender getIntentSender() {
        return this.f4653b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        e0.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f4653b, i10);
        dest.writeParcelable(this.f4654c, i10);
        dest.writeInt(this.f4655e);
        dest.writeInt(this.f4656f);
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11, int i12, u uVar) {
        this(intentSender, (i12 & 2) != 0 ? null : intent, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        e0.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        e0.checkNotNull(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(u uVar) {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }
}
