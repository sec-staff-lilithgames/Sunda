package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ra extends GeneratedMessageLite.Builder implements sa {
    public ra addAllButtons(Iterable<? extends UserIntent$UserAdInteractionExt.Button> iterable) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).addAllButtons(iterable);
        return this;
    }

    public ra addButtons(UserIntent$UserAdInteractionExt.Button button) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).addButtons(button);
        return this;
    }

    public ra clearButtons() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).clearButtons();
        return this;
    }

    public ra clearClickPos() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).clearClickPos();
        return this;
    }

    public ra clearScreenSize() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).clearScreenSize();
        return this;
    }

    public ra clearViewPos() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).clearViewPos();
        return this;
    }

    public ra clearViewSize() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).clearViewSize();
        return this;
    }

    @Override // com.moloco.sdk.sa
    public UserIntent$UserAdInteractionExt.Button getButtons(int i10) {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).getButtons(i10);
    }

    @Override // com.moloco.sdk.sa
    public int getButtonsCount() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).getButtonsCount();
    }

    @Override // com.moloco.sdk.sa
    public List<UserIntent$UserAdInteractionExt.Button> getButtonsList() {
        return Collections.unmodifiableList(((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).getButtonsList());
    }

    @Override // com.moloco.sdk.sa
    public UserIntent$UserAdInteractionExt.Position getClickPos() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).getClickPos();
    }

    @Override // com.moloco.sdk.sa
    public UserIntent$UserAdInteractionExt.Size getScreenSize() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).getScreenSize();
    }

    @Override // com.moloco.sdk.sa
    public UserIntent$UserAdInteractionExt.Position getViewPos() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).getViewPos();
    }

    @Override // com.moloco.sdk.sa
    public UserIntent$UserAdInteractionExt.Size getViewSize() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).getViewSize();
    }

    @Override // com.moloco.sdk.sa
    public boolean hasClickPos() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).hasClickPos();
    }

    @Override // com.moloco.sdk.sa
    public boolean hasScreenSize() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).hasScreenSize();
    }

    @Override // com.moloco.sdk.sa
    public boolean hasViewPos() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).hasViewPos();
    }

    @Override // com.moloco.sdk.sa
    public boolean hasViewSize() {
        return ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).hasViewSize();
    }

    public ra mergeClickPos(UserIntent$UserAdInteractionExt.Position position) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).mergeClickPos(position);
        return this;
    }

    public ra mergeScreenSize(UserIntent$UserAdInteractionExt.Size size) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).mergeScreenSize(size);
        return this;
    }

    public ra mergeViewPos(UserIntent$UserAdInteractionExt.Position position) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).mergeViewPos(position);
        return this;
    }

    public ra mergeViewSize(UserIntent$UserAdInteractionExt.Size size) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).mergeViewSize(size);
        return this;
    }

    public ra removeButtons(int i10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).removeButtons(i10);
        return this;
    }

    public ra setButtons(int i10, UserIntent$UserAdInteractionExt.Button button) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setButtons(i10, button);
        return this;
    }

    public ra setClickPos(UserIntent$UserAdInteractionExt.Position position) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setClickPos(position);
        return this;
    }

    public ra setScreenSize(UserIntent$UserAdInteractionExt.Size size) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setScreenSize(size);
        return this;
    }

    public ra setViewPos(UserIntent$UserAdInteractionExt.Position position) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setViewPos(position);
        return this;
    }

    public ra setViewSize(UserIntent$UserAdInteractionExt.Size size) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setViewSize(size);
        return this;
    }

    public ra addButtons(int i10, UserIntent$UserAdInteractionExt.Button button) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).addButtons(i10, button);
        return this;
    }

    public ra setButtons(int i10, ma maVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setButtons(i10, (UserIntent$UserAdInteractionExt.Button) maVar.build());
        return this;
    }

    public ra setClickPos(hb hbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setClickPos((UserIntent$UserAdInteractionExt.Position) hbVar.build());
        return this;
    }

    public ra setScreenSize(jb jbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setScreenSize((UserIntent$UserAdInteractionExt.Size) jbVar.build());
        return this;
    }

    public ra setViewPos(hb hbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setViewPos((UserIntent$UserAdInteractionExt.Position) hbVar.build());
        return this;
    }

    public ra setViewSize(jb jbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).setViewSize((UserIntent$UserAdInteractionExt.Size) jbVar.build());
        return this;
    }

    public ra addButtons(ma maVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).addButtons((UserIntent$UserAdInteractionExt.Button) maVar.build());
        return this;
    }

    public ra addButtons(int i10, ma maVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.ClickInteraction) this.instance).addButtons(i10, (UserIntent$UserAdInteractionExt.Button) maVar.build());
        return this;
    }
}
