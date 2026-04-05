package com.unity3d.services.core.webview.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebViewCallback implements Parcelable {
    public static final Parcelable.Creator<WebViewCallback> CREATOR = new Parcelable.Creator<WebViewCallback>() { // from class: com.unity3d.services.core.webview.bridge.WebViewCallback.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewCallback createFromParcel(Parcel parcel) {
            return new WebViewCallback(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewCallback[] newArray(int i10) {
            return new WebViewCallback[i10];
        }
    };
    private String _callbackId;
    private int _invocationId;
    private boolean _invoked;

    public WebViewCallback(String str, int i10) {
        this._callbackId = str;
        this._invocationId = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 45678;
    }

    public void error(Enum r22, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        invoke(CallbackStatus.ERROR, r22, objArr);
    }

    public String getCallbackId() {
        return this._callbackId;
    }

    public int getInvocationId() {
        return this._invocationId;
    }

    public void invoke(Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        invoke(CallbackStatus.OK, null, objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this._callbackId);
        parcel.writeByte(this._invoked ? (byte) 1 : (byte) 0);
        parcel.writeInt(this._invocationId);
    }

    private void invoke(CallbackStatus callbackStatus, Enum r42, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        if (this._invoked || (str = this._callbackId) == null || str.length() == 0) {
            return;
        }
        this._invoked = true;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        arrayList.add(0, this._callbackId);
        Invocation invocationById = Invocation.getInvocationById(this._invocationId);
        if (invocationById != null) {
            invocationById.setInvocationResponse(callbackStatus, r42, arrayList.toArray());
            return;
        }
        DeviceLog.error("Couldn't get batch with id: " + getInvocationId());
    }

    public WebViewCallback(Parcel parcel) {
        this._callbackId = parcel.readString();
        this._invoked = parcel.readByte() != 0;
        this._invocationId = parcel.readInt();
    }
}
