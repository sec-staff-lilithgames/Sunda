package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new l0();

    /* renamed from: b, reason: collision with root package name */
    public final int f4566b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4567c;

    /* renamed from: e, reason: collision with root package name */
    public final long f4568e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4569f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4570g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4571h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f4572i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4573j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4574k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4575l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f4576m;

    /* renamed from: n, reason: collision with root package name */
    public PlaybackState f4577n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f4583a;

        /* renamed from: b, reason: collision with root package name */
        public int f4584b;

        /* renamed from: c, reason: collision with root package name */
        public long f4585c;

        /* renamed from: d, reason: collision with root package name */
        public long f4586d;

        /* renamed from: e, reason: collision with root package name */
        public float f4587e;

        /* renamed from: f, reason: collision with root package name */
        public long f4588f;

        /* renamed from: g, reason: collision with root package name */
        public int f4589g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f4590h;

        /* renamed from: i, reason: collision with root package name */
        public long f4591i;

        /* renamed from: j, reason: collision with root package name */
        public long f4592j;

        /* renamed from: k, reason: collision with root package name */
        public Bundle f4593k;

        public a() {
            this.f4583a = new ArrayList();
            this.f4592j = -1L;
        }

        public a addCustomAction(String str, String str2, int i10) {
            return addCustomAction(new CustomAction(str, str2, i10, null));
        }

        public PlaybackStateCompat build() {
            return new PlaybackStateCompat(this.f4584b, this.f4585c, this.f4586d, this.f4587e, this.f4588f, this.f4589g, this.f4590h, this.f4591i, this.f4583a, this.f4592j, this.f4593k);
        }

        public a setActions(long j10) {
            this.f4588f = j10;
            return this;
        }

        public a setActiveQueueItemId(long j10) {
            this.f4592j = j10;
            return this;
        }

        public a setBufferedPosition(long j10) {
            this.f4586d = j10;
            return this;
        }

        @Deprecated
        public a setErrorMessage(CharSequence charSequence) {
            this.f4590h = charSequence;
            return this;
        }

        public a setExtras(Bundle bundle) {
            this.f4593k = bundle;
            return this;
        }

        public a setState(int i10, long j10, float f10) {
            return setState(i10, j10, f10, SystemClock.elapsedRealtime());
        }

        public a addCustomAction(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.f4583a.add(customAction);
            return this;
        }

        public a setErrorMessage(int i10, CharSequence charSequence) {
            this.f4589g = i10;
            this.f4590h = charSequence;
            return this;
        }

        public a setState(int i10, long j10, float f10, long j11) {
            this.f4584b = i10;
            this.f4585c = j10;
            this.f4591i = j11;
            this.f4587e = f10;
            return this;
        }

        public a(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f4583a = arrayList;
            this.f4592j = -1L;
            this.f4584b = playbackStateCompat.f4566b;
            this.f4585c = playbackStateCompat.f4567c;
            this.f4587e = playbackStateCompat.f4569f;
            this.f4591i = playbackStateCompat.f4573j;
            this.f4586d = playbackStateCompat.f4568e;
            this.f4588f = playbackStateCompat.f4570g;
            this.f4589g = playbackStateCompat.f4571h;
            this.f4590h = playbackStateCompat.f4572i;
            ArrayList arrayList2 = playbackStateCompat.f4574k;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            this.f4592j = playbackStateCompat.f4575l;
            this.f4593k = playbackStateCompat.f4576m;
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f4566b = i10;
        this.f4567c = j10;
        this.f4568e = j11;
        this.f4569f = f10;
        this.f4570g = j12;
        this.f4571h = i11;
        this.f4572i = charSequence;
        this.f4573j = j13;
        this.f4574k = new ArrayList(arrayList);
        this.f4575l = j14;
        this.f4576m = bundle;
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listJ = m0.j(playbackState);
        if (listJ != null) {
            arrayList = new ArrayList(listJ.size());
            Iterator<PlaybackState.CustomAction> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.fromCustomAction(it.next()));
            }
        }
        Bundle bundleA = n0.a(playbackState);
        MediaSessionCompat.ensureClassLoader(bundleA);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(m0.r(playbackState), m0.q(playbackState), m0.i(playbackState), m0.p(playbackState), m0.g(playbackState), 0, m0.k(playbackState), m0.n(playbackState), arrayList, m0.h(playbackState), bundleA);
        playbackStateCompat.f4577n = playbackState;
        return playbackStateCompat;
    }

    public static int toKeyCode(long j10) {
        if (j10 == 4) {
            return 126;
        }
        if (j10 == 2) {
            return 127;
        }
        if (j10 == 32) {
            return 87;
        }
        if (j10 == 16) {
            return 88;
        }
        if (j10 == 1) {
            return 86;
        }
        if (j10 == 64) {
            return 90;
        }
        if (j10 == 8) {
            return 89;
        }
        return j10 == 512 ? 85 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getActions() {
        return this.f4570g;
    }

    public long getActiveQueueItemId() {
        return this.f4575l;
    }

    public long getBufferedPosition() {
        return this.f4568e;
    }

    public long getCurrentPosition(Long l9) {
        return Math.max(0L, this.f4567c + ((long) (this.f4569f * (l9 != null ? l9.longValue() : SystemClock.elapsedRealtime() - this.f4573j))));
    }

    public List<CustomAction> getCustomActions() {
        return this.f4574k;
    }

    public int getErrorCode() {
        return this.f4571h;
    }

    public CharSequence getErrorMessage() {
        return this.f4572i;
    }

    public Bundle getExtras() {
        return this.f4576m;
    }

    public long getLastPositionUpdateTime() {
        return this.f4573j;
    }

    public float getPlaybackSpeed() {
        return this.f4569f;
    }

    public Object getPlaybackState() {
        if (this.f4577n == null) {
            PlaybackState.Builder builderD = m0.d();
            m0.x(builderD, this.f4566b, this.f4567c, this.f4569f, this.f4573j);
            m0.u(builderD, this.f4568e);
            m0.s(builderD, this.f4570g);
            m0.v(builderD, this.f4572i);
            Iterator it = this.f4574k.iterator();
            while (it.hasNext()) {
                m0.a(builderD, (PlaybackState.CustomAction) ((CustomAction) it.next()).getCustomAction());
            }
            m0.t(builderD, this.f4575l);
            n0.b(builderD, this.f4576m);
            this.f4577n = m0.c(builderD);
        }
        return this.f4577n;
    }

    public long getPosition() {
        return this.f4567c;
    }

    public int getState() {
        return this.f4566b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f4566b);
        sb2.append(", position=");
        sb2.append(this.f4567c);
        sb2.append(", buffered position=");
        sb2.append(this.f4568e);
        sb2.append(", speed=");
        sb2.append(this.f4569f);
        sb2.append(", updated=");
        sb2.append(this.f4573j);
        sb2.append(", actions=");
        sb2.append(this.f4570g);
        sb2.append(", error code=");
        sb2.append(this.f4571h);
        sb2.append(", error message=");
        sb2.append(this.f4572i);
        sb2.append(", custom actions=");
        sb2.append(this.f4574k);
        sb2.append(", active item id=");
        return a.b.g(this.f4575l, "}", sb2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4566b);
        parcel.writeLong(this.f4567c);
        parcel.writeFloat(this.f4569f);
        parcel.writeLong(this.f4573j);
        parcel.writeLong(this.f4568e);
        parcel.writeLong(this.f4570g);
        TextUtils.writeToParcel(this.f4572i, parcel, i10);
        parcel.writeTypedList(this.f4574k);
        parcel.writeLong(this.f4575l);
        parcel.writeBundle(this.f4576m);
        parcel.writeInt(this.f4571h);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new o0();

        /* renamed from: b, reason: collision with root package name */
        public final String f4578b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f4579c;

        /* renamed from: e, reason: collision with root package name */
        public final int f4580e;

        /* renamed from: f, reason: collision with root package name */
        public final Bundle f4581f;

        /* renamed from: g, reason: collision with root package name */
        public PlaybackState.CustomAction f4582g;

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f4578b = str;
            this.f4579c = charSequence;
            this.f4580e = i10;
            this.f4581f = bundle;
        }

        public static CustomAction fromCustomAction(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle bundleL = m0.l(customAction);
            MediaSessionCompat.ensureClassLoader(bundleL);
            CustomAction customAction2 = new CustomAction(m0.f(customAction), m0.o(customAction), m0.m(customAction), bundleL);
            customAction2.f4582g = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAction() {
            return this.f4578b;
        }

        public Object getCustomAction() {
            PlaybackState.CustomAction customAction = this.f4582g;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builderE = m0.e(this.f4578b, this.f4579c, this.f4580e);
            m0.w(builderE, this.f4581f);
            return m0.b(builderE);
        }

        public Bundle getExtras() {
            return this.f4581f;
        }

        public int getIcon() {
            return this.f4580e;
        }

        public CharSequence getName() {
            return this.f4579c;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f4579c) + ", mIcon=" + this.f4580e + ", mExtras=" + this.f4581f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f4578b);
            TextUtils.writeToParcel(this.f4579c, parcel, i10);
            parcel.writeInt(this.f4580e);
            parcel.writeBundle(this.f4581f);
        }

        public CustomAction(Parcel parcel) {
            this.f4578b = parcel.readString();
            this.f4579c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4580e = parcel.readInt();
            this.f4581f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f4566b = parcel.readInt();
        this.f4567c = parcel.readLong();
        this.f4569f = parcel.readFloat();
        this.f4573j = parcel.readLong();
        this.f4568e = parcel.readLong();
        this.f4570g = parcel.readLong();
        this.f4572i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4574k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f4575l = parcel.readLong();
        this.f4576m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f4571h = parcel.readInt();
    }
}
