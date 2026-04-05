package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface LifecycleEvent {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Created implements LifecycleEvent {
        private final WeakReference<Activity> activity;
        private final Bundle bundle;

        public Created(WeakReference<Activity> activity, Bundle bundle) {
            e0.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Created copy$default(Created created, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = created.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = created.bundle;
            }
            return created.copy(weakReference, bundle);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Bundle component2() {
            return this.bundle;
        }

        public final Created copy(WeakReference<Activity> activity, Bundle bundle) {
            e0.checkNotNullParameter(activity, "activity");
            return new Created(activity, bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Created)) {
                return false;
            }
            Created created = (Created) obj;
            return e0.areEqual(getActivity(), created.getActivity()) && e0.areEqual(this.bundle, created.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public String toString() {
            return "Created(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Destroyed implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        public Destroyed(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Destroyed copy$default(Destroyed destroyed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = destroyed.getActivity();
            }
            return destroyed.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Destroyed copy(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            return new Destroyed(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Destroyed) && e0.areEqual(getActivity(), ((Destroyed) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Destroyed(activity=" + getActivity() + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Paused implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        public Paused(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Paused copy$default(Paused paused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = paused.getActivity();
            }
            return paused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Paused copy(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            return new Paused(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paused) && e0.areEqual(getActivity(), ((Paused) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Paused(activity=" + getActivity() + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Resumed implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        public Resumed(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resumed copy$default(Resumed resumed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = resumed.getActivity();
            }
            return resumed.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Resumed copy(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            return new Resumed(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resumed) && e0.areEqual(getActivity(), ((Resumed) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Resumed(activity=" + getActivity() + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveInstanceState implements LifecycleEvent {
        private final WeakReference<Activity> activity;
        private final Bundle bundle;

        public SaveInstanceState(WeakReference<Activity> activity, Bundle bundle) {
            e0.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveInstanceState copy$default(SaveInstanceState saveInstanceState, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = saveInstanceState.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = saveInstanceState.bundle;
            }
            return saveInstanceState.copy(weakReference, bundle);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Bundle component2() {
            return this.bundle;
        }

        public final SaveInstanceState copy(WeakReference<Activity> activity, Bundle bundle) {
            e0.checkNotNullParameter(activity, "activity");
            return new SaveInstanceState(activity, bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveInstanceState)) {
                return false;
            }
            SaveInstanceState saveInstanceState = (SaveInstanceState) obj;
            return e0.areEqual(getActivity(), saveInstanceState.getActivity()) && e0.areEqual(this.bundle, saveInstanceState.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public String toString() {
            return "SaveInstanceState(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Started implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        public Started(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Started copy$default(Started started, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = started.getActivity();
            }
            return started.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Started copy(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            return new Started(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Started) && e0.areEqual(getActivity(), ((Started) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Started(activity=" + getActivity() + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Stopped implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        public Stopped(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stopped copy$default(Stopped stopped, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = stopped.getActivity();
            }
            return stopped.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Stopped copy(WeakReference<Activity> activity) {
            e0.checkNotNullParameter(activity, "activity");
            return new Stopped(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stopped) && e0.areEqual(getActivity(), ((Stopped) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Stopped(activity=" + getActivity() + ')';
        }
    }

    WeakReference<Activity> getActivity();
}
