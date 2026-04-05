package k3;

import android.app.Notification;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h0 {
    public static j0 a(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null) {
            return null;
        }
        i0 i0Var = bubbleMetadata.getShortcutId() != null ? new i0(bubbleMetadata.getShortcutId()) : new i0(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
        i0Var.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            i0Var.setDesiredHeight(bubbleMetadata.getDesiredHeight());
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            i0Var.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
        }
        return i0Var.build();
    }

    public static Notification.BubbleMetadata b(j0 j0Var) {
        if (j0Var == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = j0Var.getShortcutId() != null ? new Notification.BubbleMetadata.Builder(j0Var.getShortcutId()) : new Notification.BubbleMetadata.Builder(j0Var.getIntent(), j0Var.getIcon().toIcon());
        builder.setDeleteIntent(j0Var.getDeleteIntent()).setAutoExpandBubble(j0Var.getAutoExpandBubble()).setSuppressNotification(j0Var.isNotificationSuppressed());
        if (j0Var.getDesiredHeight() != 0) {
            builder.setDesiredHeight(j0Var.getDesiredHeight());
        }
        if (j0Var.getDesiredHeightResId() != 0) {
            builder.setDesiredHeightResId(j0Var.getDesiredHeightResId());
        }
        return builder.build();
    }
}
