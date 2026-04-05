package k3;

import android.app.Notification;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g0 {
    public static j0 a(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
            return null;
        }
        i0 suppressNotification = new i0(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
        }
        return suppressNotification.build();
    }

    public static Notification.BubbleMetadata b(j0 j0Var) {
        if (j0Var == null || j0Var.getIntent() == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(j0Var.getIcon().toIcon()).setIntent(j0Var.getIntent()).setDeleteIntent(j0Var.getDeleteIntent()).setAutoExpandBubble(j0Var.getAutoExpandBubble()).setSuppressNotification(j0Var.isNotificationSuppressed());
        if (j0Var.getDesiredHeight() != 0) {
            suppressNotification.setDesiredHeight(j0Var.getDesiredHeight());
        }
        if (j0Var.getDesiredHeightResId() != 0) {
            suppressNotification.setDesiredHeightResId(j0Var.getDesiredHeightResId());
        }
        return suppressNotification.build();
    }
}
