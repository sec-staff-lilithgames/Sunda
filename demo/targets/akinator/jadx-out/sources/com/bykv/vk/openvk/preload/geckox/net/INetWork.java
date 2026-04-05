package com.bykv.vk.openvk.preload.geckox.net;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface INetWork {
    Response doGet(String str) throws Exception;

    Response doPost(String str, String str2) throws Exception;

    Response doPost(String str, List<Pair<String, String>> list) throws Exception;

    void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) throws Exception;

    void syncDoGet(String str);
}
