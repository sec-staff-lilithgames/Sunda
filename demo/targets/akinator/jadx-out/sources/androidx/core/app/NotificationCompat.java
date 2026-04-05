package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.appcompat.app.j0;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.device.ads.DTBMetricReport;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.messaging.b0;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k3.b1;
import k3.c1;
import k3.f1;
import k3.g1;
import k3.k0;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_VOICEMAIL = "voicemail";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_PROGRESS_POINTS = "android.progressPoints";
    public static final String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
    public static final String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";
    public static final String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f5634a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f5635b;

        /* renamed from: c, reason: collision with root package name */
        public final g1[] f5636c;

        /* renamed from: d, reason: collision with root package name */
        public final g1[] f5637d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f5638e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f5639f;

        /* renamed from: g, reason: collision with root package name */
        public final int f5640g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f5641h;

        /* renamed from: i, reason: collision with root package name */
        public final int f5642i;

        /* renamed from: j, reason: collision with root package name */
        public final CharSequence f5643j;

        /* renamed from: k, reason: collision with root package name */
        public final PendingIntent f5644k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f5645l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: androidx.core.app.NotificationCompat$a$a, reason: collision with other inner class name */
        public static final class C0003a {

            /* renamed from: a, reason: collision with root package name */
            public final IconCompat f5646a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f5647b;

            /* renamed from: c, reason: collision with root package name */
            public final PendingIntent f5648c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f5649d;

            /* renamed from: e, reason: collision with root package name */
            public final Bundle f5650e;

            /* renamed from: f, reason: collision with root package name */
            public ArrayList f5651f;

            /* renamed from: g, reason: collision with root package name */
            public int f5652g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f5653h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f5654i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f5655j;

            public C0003a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public static C0003a fromAndroidAction(Notification.Action action) {
                Set setU;
                C0003a c0003a = androidx.core.app.b.a(action) != null ? new C0003a(IconCompat.createFromIconOrNullIfZeroResId(androidx.core.app.b.a(action)), action.title, action.actionIntent) : new C0003a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputArrB = androidx.core.app.a.b(action);
                if (remoteInputArrB != null && remoteInputArrB.length != 0) {
                    for (RemoteInput remoteInput : remoteInputArrB) {
                        f1 f1VarAddExtras = new f1(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
                        if (Build.VERSION.SDK_INT >= 26 && (setU = j0.u(remoteInput)) != null) {
                            Iterator it = setU.iterator();
                            while (it.hasNext()) {
                                f1VarAddExtras.setAllowDataType((String) it.next(), true);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            f1VarAddExtras.setEditChoicesBeforeSending(b0.j(remoteInput));
                        }
                        c0003a.addRemoteInput(f1VarAddExtras.build());
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                c0003a.f5649d = androidx.core.app.c.a(action);
                if (i10 >= 28) {
                    c0003a.setSemanticAction(androidx.core.app.d.a(action));
                }
                if (i10 >= 29) {
                    c0003a.setContextual(androidx.core.app.e.a(action));
                }
                if (i10 >= 31) {
                    c0003a.setAuthenticationRequired(androidx.core.app.f.a(action));
                }
                c0003a.addExtras(androidx.core.app.a.a(action));
                return c0003a;
            }

            public C0003a addExtras(Bundle bundle) {
                if (bundle != null) {
                    this.f5650e.putAll(bundle);
                }
                return this;
            }

            public C0003a addRemoteInput(g1 g1Var) {
                if (this.f5651f == null) {
                    this.f5651f = new ArrayList();
                }
                if (g1Var != null) {
                    this.f5651f.add(g1Var);
                }
                return this;
            }

            public a build() {
                if (this.f5654i && this.f5648c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f5651f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        g1 g1Var = (g1) it.next();
                        if (g1Var.isDataOnly()) {
                            arrayList.add(g1Var);
                        } else {
                            arrayList2.add(g1Var);
                        }
                    }
                }
                return new a(this.f5646a, this.f5647b, this.f5648c, this.f5650e, arrayList2.isEmpty() ? null : (g1[]) arrayList2.toArray(new g1[arrayList2.size()]), arrayList.isEmpty() ? null : (g1[]) arrayList.toArray(new g1[arrayList.size()]), this.f5649d, this.f5652g, this.f5653h, this.f5654i, this.f5655j);
            }

            public C0003a extend(androidx.core.app.g gVar) {
                gVar.a();
                return this;
            }

            public Bundle getExtras() {
                return this.f5650e;
            }

            public C0003a setAllowGeneratedReplies(boolean z10) {
                this.f5649d = z10;
                return this;
            }

            public C0003a setAuthenticationRequired(boolean z10) {
                this.f5655j = z10;
                return this;
            }

            public C0003a setContextual(boolean z10) {
                this.f5654i = z10;
                return this;
            }

            public C0003a setSemanticAction(int i10) {
                this.f5652g = i10;
                return this;
            }

            public C0003a setShowsUserInterface(boolean z10) {
                this.f5653h = z10;
                return this;
            }

            public C0003a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.createWithResource(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0003a(a aVar) {
                this(aVar.getIconCompat(), aVar.f5643j, aVar.f5644k, new Bundle(aVar.f5634a), aVar.getRemoteInputs(), aVar.getAllowGeneratedReplies(), aVar.getSemanticAction(), aVar.f5639f, aVar.isContextual(), aVar.isAuthenticationRequired());
            }

            public C0003a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, g1[] g1VarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f5649d = true;
                this.f5653h = true;
                this.f5646a = iconCompat;
                this.f5647b = d.a(charSequence);
                this.f5648c = pendingIntent;
                this.f5650e = bundle;
                this.f5651f = g1VarArr == null ? null : new ArrayList(Arrays.asList(g1VarArr));
                this.f5649d = z10;
                this.f5652g = i10;
                this.f5653h = z11;
                this.f5654i = z12;
                this.f5655j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.createWithResource(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent getActionIntent() {
            return this.f5644k;
        }

        public boolean getAllowGeneratedReplies() {
            return this.f5638e;
        }

        public g1[] getDataOnlyRemoteInputs() {
            return this.f5637d;
        }

        public Bundle getExtras() {
            return this.f5634a;
        }

        @Deprecated
        public int getIcon() {
            return this.f5642i;
        }

        public IconCompat getIconCompat() {
            int i10;
            if (this.f5635b == null && (i10 = this.f5642i) != 0) {
                this.f5635b = IconCompat.createWithResource(null, "", i10);
            }
            return this.f5635b;
        }

        public g1[] getRemoteInputs() {
            return this.f5636c;
        }

        public int getSemanticAction() {
            return this.f5640g;
        }

        public boolean getShowsUserInterface() {
            return this.f5639f;
        }

        public CharSequence getTitle() {
            return this.f5643j;
        }

        public boolean isAuthenticationRequired() {
            return this.f5645l;
        }

        public boolean isContextual() {
            return this.f5641h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (g1[]) null, (g1[]) null, true, 0, true, false, false);
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, g1[] g1VarArr, g1[] g1VarArr2, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
            this(i10 != 0 ? IconCompat.createWithResource(null, "", i10) : null, charSequence, pendingIntent, bundle, g1VarArr, g1VarArr2, z10, i11, z11, z12, z13);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, g1[] g1VarArr, g1[] g1VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f5639f = true;
            this.f5635b = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.f5642i = iconCompat.getResId();
            }
            this.f5643j = d.a(charSequence);
            this.f5644k = pendingIntent;
            this.f5634a = bundle == null ? new Bundle() : bundle;
            this.f5636c = g1VarArr;
            this.f5637d = g1VarArr2;
            this.f5638e = z10;
            this.f5640g = i10;
            this.f5639f = z11;
            this.f5641h = z12;
            this.f5645l = z13;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends j {

        /* renamed from: e, reason: collision with root package name */
        public IconCompat f5656e;

        /* renamed from: f, reason: collision with root package name */
        public IconCompat f5657f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f5658g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f5659h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f5660i;

        public b() {
        }

        public static IconCompat f(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.createFromIcon((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat getPictureIcon(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            return parcelable != null ? f(parcelable) : f(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void apply(k3.b0 b0Var) {
            z zVar = (z) b0Var;
            Notification.Builder builder = zVar.getBuilder();
            Context context = zVar.f5743a;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.f5725b);
            IconCompat iconCompat = this.f5656e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    androidx.core.app.i.a(bigContentTitle, iconCompat.toIcon(context));
                } else if (iconCompat.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f5656e.getBitmap());
                }
            }
            if (this.f5658g) {
                IconCompat iconCompat2 = this.f5657f;
                if (iconCompat2 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    androidx.core.app.h.a(bigContentTitle, iconCompat2.toIcon(context));
                }
            }
            if (this.f5727d) {
                bigContentTitle.setSummaryText(this.f5726c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                androidx.core.app.i.c(bigContentTitle, this.f5660i);
                androidx.core.app.i.b(bigContentTitle, this.f5659h);
            }
        }

        public b bigLargeIcon(Bitmap bitmap) {
            this.f5657f = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            this.f5658g = true;
            return this;
        }

        public b bigPicture(Bitmap bitmap) {
            this.f5656e = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final String d() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void e(Bundle bundle) {
            super.e(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.f5657f = f(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.f5658g = true;
            }
            this.f5656e = getPictureIcon(bundle);
            this.f5660i = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public b setBigContentTitle(CharSequence charSequence) {
            this.f5725b = d.a(charSequence);
            return this;
        }

        public b setContentDescription(CharSequence charSequence) {
            this.f5659h = charSequence;
            return this;
        }

        public b setSummaryText(CharSequence charSequence) {
            this.f5726c = d.a(charSequence);
            this.f5727d = true;
            return this;
        }

        public b showBigPictureWhenCollapsed(boolean z10) {
            this.f5660i = z10;
            return this;
        }

        public b(d dVar) {
            setBuilder(dVar);
        }

        public b bigPicture(Icon icon) {
            this.f5656e = IconCompat.createFromIcon(icon);
            return this;
        }

        public b bigLargeIcon(Icon icon) {
            this.f5657f = icon == null ? null : IconCompat.createFromIcon(icon);
            this.f5658g = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends j {

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f5661e;

        public c() {
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void apply(k3.b0 b0Var) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((z) b0Var).getBuilder()).setBigContentTitle(this.f5725b).bigText(this.f5661e);
            if (this.f5727d) {
                bigTextStyleBigText.setSummaryText(this.f5726c);
            }
        }

        public c bigText(CharSequence charSequence) {
            this.f5661e = d.a(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final String d() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void e(Bundle bundle) {
            super.e(bundle);
            this.f5661e = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        public c setBigContentTitle(CharSequence charSequence) {
            this.f5725b = d.a(charSequence);
            return this;
        }

        public c setSummaryText(CharSequence charSequence) {
            this.f5726c = d.a(charSequence);
            this.f5727d = true;
            return this;
        }

        public c(d dVar) {
            setBuilder(dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {
        public String A;
        public boolean B;
        public boolean C;
        public boolean D;
        public String E;
        public Bundle F;
        public int G;
        public int H;
        public Notification I;
        public RemoteViews J;
        public RemoteViews K;
        public RemoteViews L;
        public String M;
        public int N;
        public String O;
        public m3.e P;
        public long Q;
        public int R;
        public int S;
        public boolean T;
        public k3.j0 U;
        public final Notification V;
        public boolean W;
        public Icon X;
        public final ArrayList Y;

        /* renamed from: a, reason: collision with root package name */
        public final Context f5662a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f5663b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f5664c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f5665d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f5666e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f5667f;

        /* renamed from: g, reason: collision with root package name */
        public String f5668g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f5669h;

        /* renamed from: i, reason: collision with root package name */
        public PendingIntent f5670i;

        /* renamed from: j, reason: collision with root package name */
        public RemoteViews f5671j;

        /* renamed from: k, reason: collision with root package name */
        public IconCompat f5672k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f5673l;

        /* renamed from: m, reason: collision with root package name */
        public int f5674m;

        /* renamed from: n, reason: collision with root package name */
        public int f5675n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f5676o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f5677p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f5678q;

        /* renamed from: r, reason: collision with root package name */
        public j f5679r;

        /* renamed from: s, reason: collision with root package name */
        public CharSequence f5680s;

        /* renamed from: t, reason: collision with root package name */
        public CharSequence f5681t;

        /* renamed from: u, reason: collision with root package name */
        public CharSequence[] f5682u;

        /* renamed from: v, reason: collision with root package name */
        public int f5683v;

        /* renamed from: w, reason: collision with root package name */
        public int f5684w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f5685x;

        /* renamed from: y, reason: collision with root package name */
        public String f5686y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f5687z;

        public d(Context context, Notification notification) {
            Bundle bundle;
            ArrayList parcelableArrayList;
            this(context, NotificationCompat.getChannelId(notification));
            Bundle bundle2 = notification.extras;
            j jVarExtractStyleFromNotification = j.extractStyleFromNotification(notification);
            d smallIcon = setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(jVarExtractStyleFromNotification).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle2.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle2.getInt(NotificationCompat.EXTRA_PROGRESS), bundle2.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel);
            if (notification.extras == null) {
                bundle = null;
            } else {
                Bundle bundle3 = new Bundle(notification.extras);
                bundle3.remove(NotificationCompat.EXTRA_TITLE);
                bundle3.remove(NotificationCompat.EXTRA_TEXT);
                bundle3.remove(NotificationCompat.EXTRA_INFO_TEXT);
                bundle3.remove(NotificationCompat.EXTRA_SUB_TEXT);
                if (Build.VERSION.SDK_INT >= 36) {
                    bundle3.remove(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT);
                }
                bundle3.remove(NotificationCompat.EXTRA_CHANNEL_ID);
                bundle3.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
                bundle3.remove(NotificationCompat.EXTRA_SHOW_WHEN);
                bundle3.remove(NotificationCompat.EXTRA_PROGRESS);
                bundle3.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
                bundle3.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
                bundle3.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
                bundle3.remove(NotificationCompat.EXTRA_COLORIZED);
                bundle3.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
                bundle3.remove(NotificationCompat.EXTRA_PEOPLE);
                bundle3.remove("android.support.sortKey");
                bundle3.remove("android.support.groupKey");
                bundle3.remove("android.support.isGroupSummary");
                bundle3.remove("android.support.localOnly");
                bundle3.remove("android.support.actionExtras");
                Bundle bundle4 = bundle3.getBundle("android.car.EXTENSIONS");
                if (bundle4 != null) {
                    Bundle bundle5 = new Bundle(bundle4);
                    bundle5.remove("invisible_actions");
                    bundle3.putBundle("android.car.EXTENSIONS", bundle5);
                }
                if (jVarExtractStyleFromNotification != null) {
                    jVarExtractStyleFromNotification.a(bundle3);
                }
                bundle = bundle3;
            }
            smallIcon.addExtras(bundle);
            this.X = k.b(notification);
            Icon iconA = k.a(notification);
            if (iconA != null) {
                this.f5672k = IconCompat.createFromIcon(iconA);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    addAction(a.C0003a.fromAndroidAction(action).build());
                }
            }
            List<a> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                Iterator<a> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    addPerson(c1.fromAndroidPerson(j1.u.e(it2.next())));
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            if (bundle2.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle2.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i10 >= 26 && bundle2.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                setColorized(bundle2.getBoolean(NotificationCompat.EXTRA_COLORIZED));
            }
            if (i10 < 36 || !bundle2.containsKey(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT)) {
                return;
            }
            setShortCriticalText(bundle2.getString(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT));
        }

        public static CharSequence a(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public d addAction(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f5663b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public d addExtras(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.F;
                if (bundle2 == null) {
                    this.F = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public d addInvisibleAction(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f5665d.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        @Deprecated
        public d addPerson(String str) {
            if (str != null && !str.isEmpty()) {
                this.Y.add(str);
            }
            return this;
        }

        public final void b(int i10, boolean z10) {
            Notification notification = this.V;
            if (z10) {
                notification.flags = i10 | notification.flags;
            } else {
                notification.flags = (~i10) & notification.flags;
            }
        }

        public Notification build() {
            return new z(this).build();
        }

        public d clearActions() {
            this.f5663b.clear();
            return this;
        }

        public d clearInvisibleActions() {
            this.f5665d.clear();
            Bundle bundle = this.F.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.F.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        public d clearPeople() {
            this.f5664c.clear();
            this.Y.clear();
            return this;
        }

        public RemoteViews createBigContentView() {
            RemoteViews remoteViewsMakeBigContentView;
            j jVar;
            if (this.K != null && ((jVar = this.f5679r) == null || !jVar.displayCustomViewInline())) {
                return this.K;
            }
            z zVar = new z(this);
            j jVar2 = this.f5679r;
            return (jVar2 == null || (remoteViewsMakeBigContentView = jVar2.makeBigContentView(zVar)) == null) ? l.a(l.d(this.f5662a, zVar.build())) : remoteViewsMakeBigContentView;
        }

        public RemoteViews createContentView() {
            RemoteViews remoteViewsMakeContentView;
            j jVar;
            if (this.J != null && ((jVar = this.f5679r) == null || !jVar.displayCustomViewInline())) {
                return this.J;
            }
            z zVar = new z(this);
            j jVar2 = this.f5679r;
            return (jVar2 == null || (remoteViewsMakeContentView = jVar2.makeContentView(zVar)) == null) ? l.b(l.d(this.f5662a, zVar.build())) : remoteViewsMakeContentView;
        }

        public RemoteViews createHeadsUpContentView() {
            RemoteViews remoteViewsMakeHeadsUpContentView;
            j jVar;
            if (this.L != null && ((jVar = this.f5679r) == null || !jVar.displayCustomViewInline())) {
                return this.L;
            }
            z zVar = new z(this);
            j jVar2 = this.f5679r;
            return (jVar2 == null || (remoteViewsMakeHeadsUpContentView = jVar2.makeHeadsUpContentView(zVar)) == null) ? l.c(l.d(this.f5662a, zVar.build())) : remoteViewsMakeHeadsUpContentView;
        }

        public d extend(r rVar) {
            rVar.a();
            return this;
        }

        public RemoteViews getBigContentView() {
            return this.K;
        }

        public k3.j0 getBubbleMetadata() {
            return this.U;
        }

        public int getColor() {
            return this.G;
        }

        public RemoteViews getContentView() {
            return this.J;
        }

        public Bundle getExtras() {
            if (this.F == null) {
                this.F = new Bundle();
            }
            return this.F;
        }

        public int getForegroundServiceBehavior() {
            return this.S;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.L;
        }

        @Deprecated
        public Notification getNotification() {
            return build();
        }

        public int getPriority() {
            return this.f5675n;
        }

        public long getWhenIfShowing() {
            if (this.f5676o) {
                return this.V.when;
            }
            return 0L;
        }

        public d setAllowSystemGeneratedContextualActions(boolean z10) {
            this.T = z10;
            return this;
        }

        public d setAutoCancel(boolean z10) {
            b(16, z10);
            return this;
        }

        public d setBadgeIconType(int i10) {
            this.N = i10;
            return this;
        }

        public d setBubbleMetadata(k3.j0 j0Var) {
            this.U = j0Var;
            return this;
        }

        public d setCategory(String str) {
            this.E = str;
            return this;
        }

        public d setChannelId(String str) {
            this.M = str;
            return this;
        }

        public d setChronometerCountDown(boolean z10) {
            this.f5678q = z10;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z10);
            return this;
        }

        public d setColor(int i10) {
            this.G = i10;
            return this;
        }

        public d setColorized(boolean z10) {
            this.C = z10;
            this.D = true;
            return this;
        }

        public d setContent(RemoteViews remoteViews) {
            this.V.contentView = remoteViews;
            return this;
        }

        public d setContentInfo(CharSequence charSequence) {
            this.f5673l = a(charSequence);
            return this;
        }

        public d setContentIntent(PendingIntent pendingIntent) {
            this.f5669h = pendingIntent;
            return this;
        }

        public d setContentText(CharSequence charSequence) {
            this.f5667f = a(charSequence);
            return this;
        }

        public d setContentTitle(CharSequence charSequence) {
            this.f5666e = a(charSequence);
            return this;
        }

        public d setCustomBigContentView(RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        public d setCustomContentView(RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        public d setCustomHeadsUpContentView(RemoteViews remoteViews) {
            this.L = remoteViews;
            return this;
        }

        public d setDefaults(int i10) {
            Notification notification = this.V;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public d setDeleteIntent(PendingIntent pendingIntent) {
            this.V.deleteIntent = pendingIntent;
            return this;
        }

        public d setExtras(Bundle bundle) {
            this.F = bundle;
            return this;
        }

        public d setForegroundServiceBehavior(int i10) {
            this.S = i10;
            return this;
        }

        public d setFullScreenIntent(PendingIntent pendingIntent, boolean z10) {
            this.f5670i = pendingIntent;
            b(128, z10);
            return this;
        }

        public d setGroup(String str) {
            this.f5686y = str;
            return this;
        }

        public d setGroupAlertBehavior(int i10) {
            this.R = i10;
            return this;
        }

        public d setGroupSummary(boolean z10) {
            this.f5687z = z10;
            return this;
        }

        public d setLargeIcon(Bitmap bitmap) {
            this.f5672k = bitmap == null ? null : IconCompat.createWithBitmap(NotificationCompat.reduceLargeIconSize(this.f5662a, bitmap));
            return this;
        }

        public d setLights(int i10, int i11, int i12) {
            Notification notification = this.V;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public d setLocalOnly(boolean z10) {
            this.B = z10;
            return this;
        }

        public d setLocusId(m3.e eVar) {
            this.P = eVar;
            return this;
        }

        @Deprecated
        public d setNotificationSilent() {
            this.W = true;
            return this;
        }

        public d setNumber(int i10) {
            this.f5674m = i10;
            return this;
        }

        public d setOngoing(boolean z10) {
            b(2, z10);
            return this;
        }

        public d setOnlyAlertOnce(boolean z10) {
            b(8, z10);
            return this;
        }

        public d setPriority(int i10) {
            this.f5675n = i10;
            return this;
        }

        public d setProgress(int i10, int i11, boolean z10) {
            this.f5683v = i10;
            this.f5684w = i11;
            this.f5685x = z10;
            return this;
        }

        public d setPublicVersion(Notification notification) {
            this.I = notification;
            return this;
        }

        public d setRemoteInputHistory(CharSequence[] charSequenceArr) {
            this.f5682u = charSequenceArr;
            return this;
        }

        public d setRequestPromotedOngoing(boolean z10) {
            getExtras().putBoolean(NotificationCompat.EXTRA_REQUEST_PROMOTED_ONGOING, z10);
            return this;
        }

        public d setSettingsText(CharSequence charSequence) {
            this.f5681t = a(charSequence);
            return this;
        }

        public d setShortCriticalText(String str) {
            this.f5668g = str;
            if (Build.VERSION.SDK_INT < 36) {
                getExtras().putString(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT, str);
            }
            return this;
        }

        public d setShortcutId(String str) {
            this.O = str;
            return this;
        }

        public d setShowWhen(boolean z10) {
            this.f5676o = z10;
            return this;
        }

        public d setSilent(boolean z10) {
            this.W = z10;
            return this;
        }

        public d setSmallIcon(IconCompat iconCompat) {
            this.X = iconCompat.toIcon(this.f5662a);
            return this;
        }

        public d setSortKey(String str) {
            this.A = str;
            return this;
        }

        public d setSound(Uri uri) {
            Notification notification = this.V;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = androidx.core.app.j.a(androidx.core.app.j.e(androidx.core.app.j.c(androidx.core.app.j.b(), 4), 5));
            return this;
        }

        public d setStyle(j jVar) {
            if (this.f5679r != jVar) {
                this.f5679r = jVar;
                if (jVar != null) {
                    jVar.setBuilder(this);
                }
            }
            return this;
        }

        public d setSubText(CharSequence charSequence) {
            this.f5680s = a(charSequence);
            return this;
        }

        public d setTicker(CharSequence charSequence) {
            this.V.tickerText = a(charSequence);
            return this;
        }

        public d setTimeoutAfter(long j10) {
            this.Q = j10;
            return this;
        }

        public d setUsesChronometer(boolean z10) {
            this.f5677p = z10;
            return this;
        }

        public d setVibrate(long[] jArr) {
            this.V.vibrate = jArr;
            return this;
        }

        public d setVisibility(int i10) {
            this.H = i10;
            return this;
        }

        public d setWhen(long j10) {
            this.V.when = j10;
            return this;
        }

        public d addAction(a aVar) {
            if (aVar != null) {
                this.f5663b.add(aVar);
            }
            return this;
        }

        public d addInvisibleAction(a aVar) {
            if (aVar != null) {
                this.f5665d.add(aVar);
            }
            return this;
        }

        public d setSmallIcon(int i10) {
            this.V.icon = i10;
            return this;
        }

        @Deprecated
        public d setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            this.V.tickerText = a(charSequence);
            this.f5671j = remoteViews;
            return this;
        }

        public d addPerson(c1 c1Var) {
            if (c1Var != null) {
                this.f5664c.add(c1Var);
            }
            return this;
        }

        public d setSmallIcon(int i10, int i11) {
            Notification notification = this.V;
            notification.icon = i10;
            notification.iconLevel = i11;
            return this;
        }

        public d setLargeIcon(Icon icon) {
            this.f5672k = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public d setSound(Uri uri, int i10) {
            Notification notification = this.V;
            notification.sound = uri;
            notification.audioStreamType = i10;
            notification.audioAttributes = androidx.core.app.j.a(androidx.core.app.j.d(androidx.core.app.j.c(androidx.core.app.j.b(), 4), i10));
            return this;
        }

        public d setShortcutInfo(androidx.core.content.pm.a aVar) {
            return this;
        }

        public d(Context context, String str) {
            this.f5663b = new ArrayList();
            this.f5664c = new ArrayList();
            this.f5665d = new ArrayList();
            this.f5676o = true;
            this.B = false;
            this.G = 0;
            this.H = 0;
            this.N = 0;
            this.R = 0;
            this.S = 0;
            Notification notification = new Notification();
            this.V = notification;
            this.f5662a = context;
            this.M = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.f5675n = 0;
            this.Y = new ArrayList();
            this.T = true;
        }

        @Deprecated
        public d(Context context) {
            this(context, (String) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends j {

        /* renamed from: e, reason: collision with root package name */
        public int f5688e;

        /* renamed from: f, reason: collision with root package name */
        public c1 f5689f;

        /* renamed from: g, reason: collision with root package name */
        public PendingIntent f5690g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f5691h;

        /* renamed from: i, reason: collision with root package name */
        public PendingIntent f5692i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f5693j;

        /* renamed from: k, reason: collision with root package name */
        public Integer f5694k;

        /* renamed from: l, reason: collision with root package name */
        public Integer f5695l;

        /* renamed from: m, reason: collision with root package name */
        public IconCompat f5696m;

        /* renamed from: n, reason: collision with root package name */
        public CharSequence f5697n;

        public e() {
        }

        public static e forIncomingCall(c1 c1Var, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new e(1, c1Var, null, pendingIntent, pendingIntent2);
        }

        public static e forOngoingCall(c1 c1Var, PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new e(2, c1Var, pendingIntent, null, null);
        }

        public static e forScreeningCall(c1 c1Var, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new e(3, c1Var, pendingIntent, null, pendingIntent2);
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.f5688e);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.f5693j);
            c1 c1Var = this.f5689f;
            if (c1Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, o.b(c1Var.toAndroidPerson()));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, c1Var.toBundle());
                }
            }
            IconCompat iconCompat = this.f5696m;
            if (iconCompat != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, n.a(iconCompat.toIcon(this.f5724a.f5662a)));
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.f5697n);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.f5690g);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.f5691h);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.f5692i);
            Integer num = this.f5694k;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.f5695l;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void apply(k3.b0 b0Var) throws Resources.NotFoundException {
            int i10 = Build.VERSION.SDK_INT;
            String string = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            if (i10 < 31) {
                Notification.Builder builder = ((z) b0Var).getBuilder();
                c1 c1Var = this.f5689f;
                builder.setContentTitle(c1Var != null ? c1Var.getName() : null);
                Bundle bundle = this.f5724a.F;
                CharSequence charSequence = (bundle == null || !bundle.containsKey(NotificationCompat.EXTRA_TEXT)) ? null : this.f5724a.F.getCharSequence(NotificationCompat.EXTRA_TEXT);
                if (charSequence == null) {
                    int i11 = this.f5688e;
                    if (i11 == 1) {
                        string = this.f5724a.f5662a.getResources().getString(R.string.call_notification_incoming_text);
                    } else if (i11 == 2) {
                        string = this.f5724a.f5662a.getResources().getString(R.string.call_notification_ongoing_text);
                    } else if (i11 == 3) {
                        string = this.f5724a.f5662a.getResources().getString(R.string.call_notification_screening_text);
                    }
                    charSequence = string;
                }
                builder.setContentText(charSequence);
                c1 c1Var2 = this.f5689f;
                if (c1Var2 != null) {
                    if (c1Var2.getIcon() != null) {
                        n.b(builder, this.f5689f.getIcon().toIcon(this.f5724a.f5662a));
                    }
                    if (i10 >= 28) {
                        o.a(builder, this.f5689f.toAndroidPerson());
                    } else {
                        m.a(builder, this.f5689f.getUri());
                    }
                }
                m.b(builder, NotificationCompat.CATEGORY_CALL);
                return;
            }
            int i12 = this.f5688e;
            if (i12 == 1) {
                callStyleA = p.a(this.f5689f.toAndroidPerson(), this.f5691h, this.f5690g);
            } else if (i12 == 2) {
                callStyleA = p.b(this.f5689f.toAndroidPerson(), this.f5692i);
            } else if (i12 == 3) {
                callStyleA = p.c(this.f5689f.toAndroidPerson(), this.f5692i, this.f5690g);
            } else if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                Log.d(NotificationCompat.TAG, "Unrecognized call type in CallStyle: " + String.valueOf(this.f5688e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(((z) b0Var).getBuilder());
                Integer num = this.f5694k;
                if (num != null) {
                    p.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f5695l;
                if (num2 != null) {
                    p.e(callStyleA, num2.intValue());
                }
                p.h(callStyleA, this.f5697n);
                IconCompat iconCompat = this.f5696m;
                if (iconCompat != null) {
                    p.g(callStyleA, iconCompat.toIcon(this.f5724a.f5662a));
                }
                p.f(callStyleA, this.f5693j);
            }
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final String d() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.NotificationCompat.j
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void e(Bundle bundle) {
            super.e(bundle);
            this.f5688e = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.f5693j = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.f5689f = c1.fromAndroidPerson(j1.u.e(bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.f5689f = c1.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.f5696m = IconCompat.createFromIcon((Icon) bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.f5696m = IconCompat.createFromBundle(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.f5697n = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.f5690g = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.f5691h = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.f5692i = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            this.f5694k = bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
            this.f5695l = bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR)) : null;
        }

        public final a f(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(m3.a.getColor(this.f5724a.f5662a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f5724a.f5662a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarBuild = new a.C0003a(IconCompat.createWithResource(this.f5724a.f5662a, i10), spannableStringBuilder, pendingIntent).build();
            aVarBuild.getExtras().putBoolean("key_action_priority", true);
            return aVarBuild;
        }

        public ArrayList<a> getActionsListWithSystemActions() {
            e eVar;
            a aVarF;
            e eVar2;
            a aVarF2;
            PendingIntent pendingIntent = this.f5691h;
            if (pendingIntent == null) {
                aVarF = f(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, this.f5695l, R.color.call_notification_decline_color, this.f5692i);
                eVar = this;
            } else {
                eVar = this;
                aVarF = eVar.f(R.drawable.ic_call_decline, R.string.call_notification_decline_action, this.f5695l, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = eVar.f5690g;
            if (pendingIntent2 == null) {
                eVar2 = eVar;
                aVarF2 = null;
            } else {
                boolean z10 = eVar.f5693j;
                int i10 = z10 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer;
                int i11 = z10 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action;
                eVar2 = eVar;
                aVarF2 = eVar2.f(i10, i11, eVar.f5694k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarF);
            ArrayList arrayList2 = eVar2.f5724a.f5663b;
            int i12 = 2;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.isContextual()) {
                        arrayList.add(aVar);
                    } else if (!aVar.getExtras().getBoolean("key_action_priority")) {
                        arrayList.add(aVar);
                        i12--;
                    }
                    if (aVarF2 != null && i12 == 1) {
                        arrayList.add(aVarF2);
                        i12--;
                    }
                }
            }
            if (aVarF2 != null && i12 >= 1) {
                arrayList.add(aVarF2);
            }
            return arrayList;
        }

        public e setAnswerButtonColorHint(int i10) {
            this.f5694k = Integer.valueOf(i10);
            return this;
        }

        public e setDeclineButtonColorHint(int i10) {
            this.f5695l = Integer.valueOf(i10);
            return this;
        }

        public e setIsVideo(boolean z10) {
            this.f5693j = z10;
            return this;
        }

        public e setVerificationIcon(Icon icon) {
            this.f5696m = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public e setVerificationText(CharSequence charSequence) {
            this.f5697n = charSequence;
            return this;
        }

        public e(d dVar) {
            setBuilder(dVar);
        }

        public e setVerificationIcon(Bitmap bitmap) {
            this.f5696m = IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public e(int i10, c1 c1Var, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (c1Var != null && !TextUtils.isEmpty(c1Var.getName())) {
                this.f5688e = i10;
                this.f5689f = c1Var;
                this.f5690g = pendingIntent3;
                this.f5691h = pendingIntent2;
                this.f5692i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f extends j {
        public static void f(View view, ArrayList arrayList) {
            CharSequence text;
            if (!(view instanceof ViewGroup)) {
                return;
            }
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    return;
                }
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof TextView) && (text = ((TextView) childAt).getText()) != null && text.length() > 0) {
                    arrayList.add(text);
                }
                if (childAt instanceof ViewGroup) {
                    f(childAt, arrayList);
                }
                i10++;
            }
        }

        public static List<CharSequence> getTextsFromContentView(Context context, Notification notification) throws PackageManager.NameNotFoundException {
            if (!Notification.DecoratedCustomViewStyle.class.getName().equals(notification.extras.getString(NotificationCompat.EXTRA_TEMPLATE))) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews = notification.contentView;
            if (remoteViews == null && notification.bigContentView == null && notification.headsUpContentView == null) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews2 = notification.bigContentView;
            if (remoteViews2 != null) {
                remoteViews = remoteViews2;
            } else if (remoteViews == null) {
                remoteViews = notification.headsUpContentView;
            }
            String str = remoteViews.getPackage();
            try {
                Context contextCreatePackageContext = context.createPackageContext(str, 0);
                contextCreatePackageContext.setTheme(context.getPackageManager().getApplicationInfo(str, 0).theme);
                View viewApply = remoteViews.apply(contextCreatePackageContext, null);
                ArrayList arrayList = new ArrayList();
                f(viewApply, arrayList);
                return arrayList;
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void apply(k3.b0 b0Var) {
            ((z) b0Var).getBuilder().setStyle(q.a());
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final String d() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.j
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public RemoteViews makeBigContentView(k3.b0 b0Var) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public RemoteViews makeContentView(k3.b0 b0Var) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public RemoteViews makeHeadsUpContentView(k3.b0 b0Var) {
            return null;
        }
    }

    @Deprecated
    public NotificationCompat() {
    }

    public static a getAction(Notification notification, int i10) {
        return getActionCompatFromAction(notification.actions[i10]);
    }

    public static a getActionCompatFromAction(Notification.Action action) {
        g1[] g1VarArr;
        int i10;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            g1VarArr = null;
        } else {
            g1[] g1VarArr2 = new g1[remoteInputs.length];
            for (int i11 = 0; i11 < remoteInputs.length; i11++) {
                RemoteInput remoteInput = remoteInputs[i11];
                g1VarArr2[i11] = new g1(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? b0.i(remoteInput) : 0, remoteInput.getExtras(), null);
            }
            g1VarArr = g1VarArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z11 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int iR = i12 >= 28 ? e4.q.r(action) : action.getExtras().getInt("android.support.action.semanticAction", 0);
        boolean zO = i12 >= 29 ? b0.o(action) : false;
        boolean zC = i12 >= 31 ? k3.a.c(action) : false;
        if (action.getIcon() != null || (i10 = action.icon) == 0) {
            return new a(action.getIcon() != null ? IconCompat.createFromIconOrNullIfZeroResId(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), g1VarArr, (g1[]) null, z10, iR, z11, zO, zC);
        }
        return new a(i10, action.title, action.actionIntent, action.getExtras(), g1VarArr, (g1[]) null, z10, iR, z11, zO, zC);
    }

    public static int getActionCount(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b0.g(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j0.C(notification);
        }
        return 0;
    }

    public static k3.j0 getBubbleMetadata(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return k3.j0.fromPlatform(b0.h(notification));
        }
        return null;
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static String getChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j0.D(notification);
        }
        return null;
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Deprecated
    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static String getGroup(Notification notification) {
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j0.K(notification);
        }
        return 0;
    }

    public static boolean getHighPriority(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static List<a> getInvisibleActions(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                Bundle bundle3 = bundle.getBundle(Integer.toString(i10));
                Bundle bundle4 = bundle3.getBundle("extras");
                arrayList.add(new a(bundle3.getInt("icon"), bundle3.getCharSequence("title"), (PendingIntent) bundle3.getParcelable("actionIntent"), bundle3.getBundle("extras"), a0.b(a0.d(bundle3, "remoteInputs")), a0.b(a0.d(bundle3, "dataOnlyRemoteInputs")), bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, false));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & FLAG_LOCAL_ONLY) != 0;
    }

    public static m3.e getLocusId(Notification notification) {
        LocusId locusIdL;
        if (Build.VERSION.SDK_INT < 29 || (locusIdL = b0.l(notification)) == null) {
            return null;
        }
        return m3.e.toLocusIdCompat(locusIdL);
    }

    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static List<c1> getPeople(Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(c1.fromAndroidPerson(j1.u.e(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new b1().setUri(str).build());
                }
            }
        }
        return arrayList;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence getSettingsText(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j0.b0(notification);
        }
        return null;
    }

    public static String getShortCriticalText(Notification notification) {
        return notification.extras.getString(EXTRA_SHORT_CRITICAL_TEXT);
    }

    public static String getShortcutId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j0.c0(notification);
        }
        return null;
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static String getSortKey(Notification notification) {
        return notification.getSortKey();
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j0.e0(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static boolean hasPromotableCharacteristics(Notification notification) {
        if (Build.VERSION.SDK_INT >= 36) {
            return androidx.browser.customtabs.x.b(notification);
        }
        return false;
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static boolean isRequestPromotedOngoing(Notification notification) {
        return notification.extras.getBoolean(EXTRA_REQUEST_PROMOTED_ONGOING, false);
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) throws Resources.NotFoundException {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g extends j {

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f5698e = new ArrayList();

        public g() {
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        public g addLine(CharSequence charSequence) {
            if (charSequence != null) {
                this.f5698e.add(d.a(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void apply(k3.b0 b0Var) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((z) b0Var).getBuilder()).setBigContentTitle(this.f5725b);
            if (this.f5727d) {
                bigContentTitle.setSummaryText(this.f5726c);
            }
            Iterator it = this.f5698e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final String d() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void e(Bundle bundle) {
            super.e(bundle);
            ArrayList arrayList = this.f5698e;
            arrayList.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(arrayList, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        public g setBigContentTitle(CharSequence charSequence) {
            this.f5725b = d.a(charSequence);
            return this;
        }

        public g setSummaryText(CharSequence charSequence) {
            this.f5726c = d.a(charSequence);
            this.f5727d = true;
            return this;
        }

        public g(d dVar) {
            setBuilder(dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static class i extends j {

        /* renamed from: h, reason: collision with root package name */
        public boolean f5713h;

        /* renamed from: j, reason: collision with root package name */
        public IconCompat f5715j;

        /* renamed from: k, reason: collision with root package name */
        public IconCompat f5716k;

        /* renamed from: l, reason: collision with root package name */
        public IconCompat f5717l;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f5710e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f5711f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public int f5712g = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f5714i = true;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final int f5718a;

            /* renamed from: b, reason: collision with root package name */
            public int f5719b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f5720c = 0;

            public a(int i10) {
                this.f5718a = i10;
            }

            public int getColor() {
                return this.f5720c;
            }

            public int getId() {
                return this.f5719b;
            }

            public int getPosition() {
                return this.f5718a;
            }

            public a setColor(int i10) {
                this.f5720c = i10;
                return this;
            }

            public a setId(int i10) {
                this.f5719b = i10;
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* loaded from: classes.dex */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final int f5721a;

            /* renamed from: b, reason: collision with root package name */
            public int f5722b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f5723c = 0;

            public b(int i10) {
                this.f5721a = i10;
            }

            public int getColor() {
                return this.f5723c;
            }

            public int getId() {
                return this.f5722b;
            }

            public int getLength() {
                return this.f5721a;
            }

            public b setColor(int i10) {
                this.f5723c = i10;
                return this;
            }

            public b setId(int i10) {
                this.f5722b = i10;
                return this;
            }
        }

        public static IconCompat f(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.createFromIcon((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            if (Build.VERSION.SDK_INT < 36) {
                ArrayList arrayList = this.f5710e;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        b bVar = (b) arrayList.get(i10);
                        if (bVar.getLength() > 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("length", bVar.getLength());
                            bundle2.putInt("id", bVar.getId());
                            bundle2.putInt("colorInt", bVar.getColor());
                            arrayList2.add(bundle2);
                        }
                    }
                }
                bundle.putParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_SEGMENTS, arrayList2);
                ArrayList arrayList3 = this.f5711f;
                ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        a aVar = (a) arrayList3.get(i11);
                        if (aVar.getPosition() >= 0) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt(C3191e4.h.L, aVar.getPosition());
                            bundle3.putInt("id", aVar.getId());
                            bundle3.putInt("colorInt", aVar.getColor());
                            arrayList4.add(bundle3);
                        }
                    }
                }
                bundle.putParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_POINTS, arrayList4);
                bundle.putInt(NotificationCompat.EXTRA_PROGRESS, this.f5712g);
                bundle.putBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, this.f5713h);
                bundle.putInt(NotificationCompat.EXTRA_PROGRESS_MAX, getProgressMax());
                bundle.putBoolean(NotificationCompat.EXTRA_STYLED_BY_PROGRESS, this.f5714i);
                d dVar = this.f5724a;
                Context context = dVar != null ? dVar.f5662a : null;
                if (context != null) {
                    IconCompat iconCompat = this.f5715j;
                    if (iconCompat != null) {
                        bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, iconCompat.toIcon(context));
                    } else {
                        bundle.remove(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON);
                    }
                    IconCompat iconCompat2 = this.f5716k;
                    if (iconCompat2 != null) {
                        bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_START_ICON, iconCompat2.toIcon(context));
                    } else {
                        bundle.remove(NotificationCompat.EXTRA_PROGRESS_START_ICON);
                    }
                    IconCompat iconCompat3 = this.f5717l;
                    if (iconCompat3 != null) {
                        bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_END_ICON, iconCompat3.toIcon(context));
                    } else {
                        bundle.remove(NotificationCompat.EXTRA_PROGRESS_END_ICON);
                    }
                }
            }
        }

        public i addProgressPoint(a aVar) {
            if (this.f5711f == null) {
                this.f5711f = new ArrayList();
            }
            if (aVar.getPosition() > 0) {
                this.f5711f.add(aVar);
            }
            return this;
        }

        public i addProgressSegment(b bVar) {
            if (this.f5710e == null) {
                this.f5710e = new ArrayList();
            }
            if (bVar.getLength() > 0) {
                this.f5710e.add(bVar);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void apply(k3.b0 b0Var) {
            z zVar = (z) b0Var;
            Notification.Builder builder = zVar.getBuilder();
            if (Build.VERSION.SDK_INT < 36) {
                int progressMax = getProgressMax();
                builder.setProgress(progressMax, Math.min(this.f5712g, progressMax), this.f5713h);
                return;
            }
            Context context = zVar.f5743a;
            Notification.ProgressStyle progressStyleA = k0.a();
            x.h(progressStyleA, this.f5714i);
            x.a(progressStyleA, this.f5712g);
            x.c(progressStyleA, this.f5713h);
            IconCompat iconCompat = this.f5716k;
            x.f(progressStyleA, iconCompat != null ? iconCompat.toIcon(context) : null);
            IconCompat iconCompat2 = this.f5717l;
            x.b(progressStyleA, iconCompat2 != null ? iconCompat2.toIcon(context) : null);
            IconCompat iconCompat3 = this.f5715j;
            x.g(progressStyleA, iconCompat3 != null ? iconCompat3.toIcon(context) : null);
            x.d(progressStyleA, this.f5711f);
            x.e(progressStyleA, this.f5710e);
            builder.setStyle(progressStyleA);
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final String d() {
            return "androidx.core.app.NotificationCompat$ProgressStyle";
        }

        @Override // androidx.core.app.NotificationCompat.j
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void e(Bundle bundle) {
            super.e(bundle);
            ArrayList parcelableArrayList = t3.d.getParcelableArrayList(bundle, NotificationCompat.EXTRA_PROGRESS_SEGMENTS, Bundle.class);
            ArrayList arrayList = new ArrayList();
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                    Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                    int i11 = bundle2.getInt("length");
                    if (i11 > 0) {
                        arrayList.add(new b(i11).setId(bundle2.getInt("id")).setColor(bundle2.getInt("colorInt", 0)));
                    }
                }
            }
            this.f5710e = arrayList;
            this.f5712g = bundle.getInt(NotificationCompat.EXTRA_PROGRESS, 0);
            this.f5713h = bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, false);
            this.f5714i = bundle.getBoolean(NotificationCompat.EXTRA_STYLED_BY_PROGRESS, true);
            ArrayList parcelableArrayList2 = t3.d.getParcelableArrayList(bundle, NotificationCompat.EXTRA_PROGRESS_POINTS, Bundle.class);
            ArrayList arrayList2 = new ArrayList();
            if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                for (int i12 = 0; i12 < parcelableArrayList2.size(); i12++) {
                    Bundle bundle3 = (Bundle) parcelableArrayList2.get(i12);
                    int i13 = bundle3.getInt(C3191e4.h.L);
                    if (i13 >= 0) {
                        arrayList2.add(new a(i13).setId(bundle3.getInt("id")).setColor(bundle3.getInt("colorInt", 0)));
                    }
                }
            }
            this.f5711f = arrayList2;
            this.f5715j = f((Parcelable) t3.d.getParcelable(bundle, NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, Icon.class));
            this.f5716k = f((Parcelable) t3.d.getParcelable(bundle, NotificationCompat.EXTRA_PROGRESS_START_ICON, Icon.class));
            this.f5717l = f((Parcelable) t3.d.getParcelable(bundle, NotificationCompat.EXTRA_PROGRESS_END_ICON, Icon.class));
        }

        public int getProgress() {
            return this.f5712g;
        }

        public IconCompat getProgressEndIcon() {
            return this.f5717l;
        }

        public int getProgressMax() {
            ArrayList arrayList = this.f5710e;
            if (arrayList != null && !arrayList.isEmpty()) {
                int i10 = 0;
                int iAddExact = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    int length = ((b) arrayList.get(i11)).getLength();
                    if (length > 0) {
                        try {
                            iAddExact = Math.addExact(iAddExact, length);
                            i10++;
                        } catch (ArithmeticException unused) {
                            return 100;
                        }
                    }
                }
                if (i10 != 0) {
                    return iAddExact;
                }
            }
            return 100;
        }

        public List<a> getProgressPoints() {
            return this.f5711f;
        }

        public List<b> getProgressSegments() {
            return this.f5710e;
        }

        public IconCompat getProgressStartIcon() {
            return this.f5716k;
        }

        public IconCompat getProgressTrackerIcon() {
            return this.f5715j;
        }

        public boolean isProgressIndeterminate() {
            return this.f5713h;
        }

        public boolean isStyledByProgress() {
            return this.f5714i;
        }

        public i setProgress(int i10) {
            this.f5712g = i10;
            return this;
        }

        public i setProgressEndIcon(IconCompat iconCompat) {
            this.f5717l = iconCompat;
            return this;
        }

        public i setProgressIndeterminate(boolean z10) {
            this.f5713h = z10;
            return this;
        }

        public i setProgressPoints(List<a> list) {
            if (this.f5711f == null) {
                this.f5711f = new ArrayList();
            }
            this.f5711f.clear();
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                addProgressPoint(it.next());
            }
            return this;
        }

        public i setProgressSegments(List<b> list) {
            if (this.f5710e == null) {
                this.f5710e = new ArrayList();
            }
            this.f5710e.clear();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                addProgressSegment(it.next());
            }
            return this;
        }

        public i setProgressStartIcon(IconCompat iconCompat) {
            this.f5716k = iconCompat;
            return this;
        }

        public i setProgressTrackerIcon(IconCompat iconCompat) {
            this.f5715j = iconCompat;
            return this;
        }

        public i setStyledByProgress(boolean z10) {
            this.f5714i = z10;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_SEGMENTS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_STYLED_BY_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_START_ICON);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_END_ICON);
            bundle.remove(uQjDr.CWA);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h extends j {

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f5699e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f5700f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public c1 f5701g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f5702h;

        /* renamed from: i, reason: collision with root package name */
        public Boolean f5703i;

        public h() {
        }

        public static h extractMessagingStyleFromNotification(Notification notification) {
            j jVarExtractStyleFromNotification = j.extractStyleFromNotification(notification);
            if (jVarExtractStyleFromNotification instanceof h) {
                return (h) jVarExtractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.f5701g.getName());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.f5701g.toBundle());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.f5702h);
            if (this.f5702h != null && this.f5703i.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.f5702h);
            }
            ArrayList arrayList = this.f5699e;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, a.a(arrayList));
            }
            ArrayList arrayList2 = this.f5700f;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, a.a(arrayList2));
            }
            Boolean bool = this.f5703i;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        public h addHistoricMessage(a aVar) {
            if (aVar != null) {
                ArrayList arrayList = this.f5700f;
                arrayList.add(aVar);
                if (arrayList.size() > 25) {
                    arrayList.remove(0);
                }
            }
            return this;
        }

        @Deprecated
        public h addMessage(CharSequence charSequence, long j10, CharSequence charSequence2) {
            a aVar = new a(charSequence, j10, new b1().setName(charSequence2).build());
            ArrayList arrayList = this.f5699e;
            arrayList.add(aVar);
            if (arrayList.size() > 25) {
                arrayList.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.j
        public void apply(k3.b0 b0Var) {
            setGroupConversation(isGroupConversation());
            Notification.MessagingStyle messagingStyleA = Build.VERSION.SDK_INT >= 28 ? u.a(this.f5701g.toAndroidPerson()) : s.b(this.f5701g.getName());
            Iterator it = this.f5699e.iterator();
            while (it.hasNext()) {
                s.a(messagingStyleA, ((a) it.next()).c());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f5700f.iterator();
                while (it2.hasNext()) {
                    t.a(messagingStyleA, ((a) it2.next()).c());
                }
            }
            if (this.f5703i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                s.c(messagingStyleA, this.f5702h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                u.b(messagingStyleA, this.f5703i.booleanValue());
            }
            messagingStyleA.setBuilder(((z) b0Var).getBuilder());
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final String d() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.NotificationCompat.j
        public final void e(Bundle bundle) {
            super.e(bundle);
            ArrayList arrayList = this.f5699e;
            arrayList.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.f5701g = c1.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.f5701g = new b1().setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.f5702h = charSequence;
            if (charSequence == null) {
                this.f5702h = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                arrayList.addAll(a.b(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.f5700f.addAll(a.b(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.f5703i = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        public CharSequence getConversationTitle() {
            return this.f5702h;
        }

        public List<a> getHistoricMessages() {
            return this.f5700f;
        }

        public List<a> getMessages() {
            return this.f5699e;
        }

        public c1 getUser() {
            return this.f5701g;
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.f5701g.getName();
        }

        public boolean isGroupConversation() {
            d dVar = this.f5724a;
            if (dVar != null && dVar.f5662a.getApplicationInfo().targetSdkVersion < 28 && this.f5703i == null) {
                return this.f5702h != null;
            }
            Boolean bool = this.f5703i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public h setConversationTitle(CharSequence charSequence) {
            this.f5702h = charSequence;
            return this;
        }

        public h setGroupConversation(boolean z10) {
            this.f5703i = Boolean.valueOf(z10);
            return this;
        }

        @Deprecated
        public h(CharSequence charSequence) {
            this.f5701g = new b1().setName(charSequence).build();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f5704a;

            /* renamed from: b, reason: collision with root package name */
            public final long f5705b;

            /* renamed from: c, reason: collision with root package name */
            public final c1 f5706c;

            /* renamed from: d, reason: collision with root package name */
            public final Bundle f5707d;

            /* renamed from: e, reason: collision with root package name */
            public String f5708e;

            /* renamed from: f, reason: collision with root package name */
            public Uri f5709f;

            public a(CharSequence charSequence, long j10, c1 c1Var) {
                this.f5707d = new Bundle();
                this.f5704a = charSequence;
                this.f5705b = j10;
                this.f5706c = c1Var;
            }

            public static Bundle[] a(ArrayList arrayList) {
                Bundle[] bundleArr = new Bundle[arrayList.size()];
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a aVar = (a) arrayList.get(i10);
                    c1 c1Var = aVar.f5706c;
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = aVar.f5704a;
                    if (charSequence != null) {
                        bundle.putCharSequence("text", charSequence);
                    }
                    bundle.putLong(DTBMetricReport.TIME, aVar.f5705b);
                    if (c1Var != null) {
                        bundle.putCharSequence("sender", c1Var.getName());
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle.putParcelable("sender_person", w.a(c1Var.toAndroidPerson()));
                        } else {
                            bundle.putBundle("person", c1Var.toBundle());
                        }
                    }
                    String str = aVar.f5708e;
                    if (str != null) {
                        bundle.putString("type", str);
                    }
                    Uri uri = aVar.f5709f;
                    if (uri != null) {
                        bundle.putParcelable("uri", uri);
                    }
                    Bundle bundle2 = aVar.f5707d;
                    if (bundle2 != null) {
                        bundle.putBundle("extras", bundle2);
                    }
                    bundleArr[i10] = bundle;
                }
                return bundleArr;
            }

            public static ArrayList b(Parcelable[] parcelableArr) {
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if (parcelable instanceof Bundle) {
                        Bundle bundle = (Bundle) parcelable;
                        a aVar = null;
                        try {
                            if (bundle.containsKey("text") && bundle.containsKey(DTBMetricReport.TIME)) {
                                a aVar2 = new a(bundle.getCharSequence("text"), bundle.getLong(DTBMetricReport.TIME), bundle.containsKey("person") ? c1.fromBundle(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new b1().setName(bundle.getCharSequence("sender")).build() : null : c1.fromAndroidPerson((Person) bundle.getParcelable("sender_person")));
                                if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                    aVar2.setData(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                                }
                                if (bundle.containsKey("extras")) {
                                    aVar2.getExtras().putAll(bundle.getBundle("extras"));
                                }
                                aVar = aVar2;
                            }
                        } catch (ClassCastException unused) {
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                }
                return arrayList;
            }

            public final Notification.MessagingStyle.Message c() {
                Notification.MessagingStyle.Message messageA;
                c1 person = getPerson();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageA = w.b(getText(), getTimestamp(), person != null ? person.toAndroidPerson() : null);
                } else {
                    messageA = v.a(getText(), getTimestamp(), person != null ? person.getName() : null);
                }
                if (getDataMimeType() != null) {
                    v.b(messageA, getDataMimeType(), getDataUri());
                }
                return messageA;
            }

            public String getDataMimeType() {
                return this.f5708e;
            }

            public Uri getDataUri() {
                return this.f5709f;
            }

            public Bundle getExtras() {
                return this.f5707d;
            }

            public c1 getPerson() {
                return this.f5706c;
            }

            @Deprecated
            public CharSequence getSender() {
                c1 c1Var = this.f5706c;
                if (c1Var == null) {
                    return null;
                }
                return c1Var.getName();
            }

            public CharSequence getText() {
                return this.f5704a;
            }

            public long getTimestamp() {
                return this.f5705b;
            }

            public a setData(String str, Uri uri) {
                this.f5708e = str;
                this.f5709f = uri;
                return this;
            }

            @Deprecated
            public a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                this(charSequence, j10, new b1().setName(charSequence2).build());
            }
        }

        public h addMessage(CharSequence charSequence, long j10, c1 c1Var) {
            addMessage(new a(charSequence, j10, c1Var));
            return this;
        }

        public h addMessage(a aVar) {
            if (aVar != null) {
                ArrayList arrayList = this.f5699e;
                arrayList.add(aVar);
                if (arrayList.size() > 25) {
                    arrayList.remove(0);
                }
            }
            return this;
        }

        public h(c1 c1Var) {
            if (!TextUtils.isEmpty(c1Var.getName())) {
                this.f5701g = c1Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public d f5724a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f5725b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f5726c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5727d = false;

        /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0179  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static androidx.core.app.NotificationCompat.j extractStyleFromNotification(android.app.Notification r4) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.j.extractStyleFromNotification(android.app.Notification):androidx.core.app.NotificationCompat$j");
        }

        public void a(Bundle bundle) {
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        public void addCompatExtras(Bundle bundle) {
            if (this.f5727d) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f5726c);
            }
            CharSequence charSequence = this.f5725b;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String strD = d();
            if (strD != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, strD);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x018c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r13, int r14, boolean r15) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.j.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        public final Bitmap b(IconCompat iconCompat, int i10, int i11) {
            Drawable drawableLoadDrawable = iconCompat.loadDrawable(this.f5724a.f5662a);
            int intrinsicWidth = i11 == 0 ? drawableLoadDrawable.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = drawableLoadDrawable.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                drawableLoadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        public Notification build() {
            d dVar = this.f5724a;
            if (dVar != null) {
                return dVar.build();
            }
            return null;
        }

        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) throws Resources.NotFoundException {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
            remoteViews.removeAllViews(R.id.notification_main_column);
            remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(R.id.notification_main_column, 0);
            Resources resources = this.f5724a.f5662a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float f10 = resources.getConfiguration().fontScale;
            if (f10 < 1.0f) {
                f10 = 1.0f;
            } else if (f10 > 1.3f) {
                f10 = 1.3f;
            }
            float f11 = (f10 - 1.0f) / 0.29999995f;
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, Math.round((f11 * dimensionPixelSize2) + ((1.0f - f11) * dimensionPixelSize)), 0, 0);
        }

        public final Bitmap c(int i10, int i11, int i12, int i13) {
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap bitmapB = b(IconCompat.createWithResource(this.f5724a.f5662a, R.drawable.notification_icon_background), i13, i11);
            Canvas canvas = new Canvas(bitmapB);
            Drawable drawableMutate = this.f5724a.f5662a.getResources().getDrawable(i10).mutate();
            drawableMutate.setFilterBitmap(true);
            int i14 = (i11 - i12) / 2;
            int i15 = i12 + i14;
            drawableMutate.setBounds(i14, i14, i15, i15);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapB;
        }

        public Bitmap createColoredBitmap(int i10, int i11) {
            return b(IconCompat.createWithResource(this.f5724a.f5662a, i10), i11, 0);
        }

        public String d() {
            return null;
        }

        public boolean displayCustomViewInline() {
            return false;
        }

        public void e(Bundle bundle) {
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.f5726c = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.f5727d = true;
            }
            this.f5725b = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public RemoteViews makeBigContentView(k3.b0 b0Var) {
            return null;
        }

        public RemoteViews makeContentView(k3.b0 b0Var) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(k3.b0 b0Var) {
            return null;
        }

        public void setBuilder(d dVar) {
            if (this.f5724a != dVar) {
                this.f5724a = dVar;
                if (dVar != null) {
                    dVar.setStyle(this);
                }
            }
        }

        public void apply(k3.b0 b0Var) {
        }
    }
}
