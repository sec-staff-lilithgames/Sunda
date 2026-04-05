package rj;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$BannerMessage;
import com.google.firebase.inappmessaging.MessagesProto$Button;
import com.google.firebase.inappmessaging.MessagesProto$CardMessage;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.firebase.inappmessaging.MessagesProto$ImageOnlyMessage;
import com.google.firebase.inappmessaging.MessagesProto$ModalMessage;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import mh.p1;
import nj.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s {
    public static a a(MessagesProto$Action messagesProto$Action) {
        a aVarBuilder = b.builder();
        if (!TextUtils.isEmpty(messagesProto$Action.getActionUrl())) {
            aVarBuilder.setActionUrl(messagesProto$Action.getActionUrl());
        }
        return aVarBuilder;
    }

    public static b b(MessagesProto$Action messagesProto$Action, MessagesProto$Button messagesProto$Button) {
        a aVarA = a(messagesProto$Action);
        if (!messagesProto$Button.equals(MessagesProto$Button.getDefaultInstance())) {
            g gVarBuilder = h.builder();
            if (!TextUtils.isEmpty(messagesProto$Button.getButtonHexColor())) {
                gVarBuilder.setButtonHexColor(messagesProto$Button.getButtonHexColor());
            }
            if (messagesProto$Button.hasText()) {
                w wVarBuilder = x.builder();
                MessagesProto$Text text = messagesProto$Button.getText();
                if (!TextUtils.isEmpty(text.getText())) {
                    wVarBuilder.setText(text.getText());
                }
                if (!TextUtils.isEmpty(text.getHexColor())) {
                    wVarBuilder.setHexColor(text.getHexColor());
                }
                gVarBuilder.setText(wVarBuilder.build());
            }
            aVarA.setButton(gVarBuilder.build());
        }
        return aVarA.build();
    }

    public static x c(MessagesProto$Text messagesProto$Text) {
        w wVarBuilder = x.builder();
        if (!TextUtils.isEmpty(messagesProto$Text.getHexColor())) {
            wVarBuilder.setHexColor(messagesProto$Text.getHexColor());
        }
        if (!TextUtils.isEmpty(messagesProto$Text.getText())) {
            wVarBuilder.setText(messagesProto$Text.getText());
        }
        return wVarBuilder.build();
    }

    public static o decode(MessagesProto$Content messagesProto$Content, String str, String str2, boolean z10, Map<String, String> map) {
        p1.checkNotNull(messagesProto$Content, "FirebaseInAppMessaging content cannot be null.");
        p1.checkNotNull(str, "FirebaseInAppMessaging campaign id cannot be null.");
        p1.checkNotNull(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        j0.logd("Decoding message: " + messagesProto$Content.toString());
        i iVar = new i(str, str2, z10);
        int iOrdinal = messagesProto$Content.getMessageDetailsCase().ordinal();
        if (iOrdinal == 0) {
            MessagesProto$BannerMessage banner = messagesProto$Content.getBanner();
            e eVarBuilder = f.builder();
            if (!TextUtils.isEmpty(banner.getBackgroundHexColor())) {
                eVarBuilder.setBackgroundHexColor(banner.getBackgroundHexColor());
            }
            if (!TextUtils.isEmpty(banner.getImageUrl())) {
                eVarBuilder.setImageData(l.builder().setImageUrl(banner.getImageUrl()).build());
            }
            if (banner.hasAction()) {
                eVarBuilder.setAction(a(banner.getAction()).build());
            }
            if (banner.hasBody()) {
                eVarBuilder.setBody(c(banner.getBody()));
            }
            if (banner.hasTitle()) {
                eVarBuilder.setTitle(c(banner.getTitle()));
            }
            return eVarBuilder.build(iVar, map);
        }
        if (iOrdinal == 1) {
            MessagesProto$ModalMessage modal = messagesProto$Content.getModal();
            p pVarBuilder = q.builder();
            if (!TextUtils.isEmpty(modal.getBackgroundHexColor())) {
                pVarBuilder.setBackgroundHexColor(modal.getBackgroundHexColor());
            }
            if (!TextUtils.isEmpty(modal.getImageUrl())) {
                pVarBuilder.setImageData(l.builder().setImageUrl(modal.getImageUrl()).build());
            }
            if (modal.hasAction()) {
                pVarBuilder.setAction(b(modal.getAction(), modal.getActionButton()));
            }
            if (modal.hasBody()) {
                pVarBuilder.setBody(c(modal.getBody()));
            }
            if (modal.hasTitle()) {
                pVarBuilder.setTitle(c(modal.getTitle()));
            }
            return pVarBuilder.build(iVar, map);
        }
        if (iOrdinal == 2) {
            MessagesProto$ImageOnlyMessage imageOnly = messagesProto$Content.getImageOnly();
            m mVarBuilder = n.builder();
            if (!TextUtils.isEmpty(imageOnly.getImageUrl())) {
                mVarBuilder.setImageData(l.builder().setImageUrl(imageOnly.getImageUrl()).build());
            }
            if (imageOnly.hasAction()) {
                mVarBuilder.setAction(a(imageOnly.getAction()).build());
            }
            return mVarBuilder.build(iVar, map);
        }
        if (iOrdinal != 3) {
            return new r(new i(str, str2, z10), MessageType.UNSUPPORTED, map);
        }
        MessagesProto$CardMessage card = messagesProto$Content.getCard();
        j jVarBuilder = k.builder();
        if (card.hasTitle()) {
            jVarBuilder.setTitle(c(card.getTitle()));
        }
        if (card.hasBody()) {
            jVarBuilder.setBody(c(card.getBody()));
        }
        if (!TextUtils.isEmpty(card.getBackgroundHexColor())) {
            jVarBuilder.setBackgroundHexColor(card.getBackgroundHexColor());
        }
        if (card.hasPrimaryAction() || card.hasPrimaryActionButton()) {
            jVarBuilder.setPrimaryAction(b(card.getPrimaryAction(), card.getPrimaryActionButton()));
        }
        if (card.hasSecondaryAction() || card.hasSecondaryActionButton()) {
            jVarBuilder.setSecondaryAction(b(card.getSecondaryAction(), card.getSecondaryActionButton()));
        }
        if (!TextUtils.isEmpty(card.getPortraitImageUrl())) {
            jVarBuilder.setPortraitImageData(l.builder().setImageUrl(card.getPortraitImageUrl()).build());
        }
        if (!TextUtils.isEmpty(card.getLandscapeImageUrl())) {
            jVarBuilder.setLandscapeImageData(l.builder().setImageUrl(card.getLandscapeImageUrl()).build());
        }
        return jVarBuilder.build(iVar, map);
    }
}
