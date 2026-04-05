package vk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Struct;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface c extends MessageLiteOrBuilder {
    String getAccessLevels(int i10);

    ByteString getAccessLevelsBytes(int i10);

    int getAccessLevelsCount();

    List<String> getAccessLevelsList();

    String getAudiences(int i10);

    ByteString getAudiencesBytes(int i10);

    int getAudiencesCount();

    List<String> getAudiencesList();

    Struct getClaims();

    String getPresenter();

    ByteString getPresenterBytes();

    String getPrincipal();

    ByteString getPrincipalBytes();

    boolean hasClaims();
}
