package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface p extends MessageLiteOrBuilder {
    long getBucketCounts(int i10);

    int getBucketCountsCount();

    List<Long> getBucketCountsList();

    Distribution.BucketOptions getBucketOptions();

    long getCount();

    Distribution.Exemplar getExemplars(int i10);

    int getExemplarsCount();

    List<Distribution.Exemplar> getExemplarsList();

    double getMean();

    Distribution.Range getRange();

    double getSumOfSquaredDeviation();

    boolean hasBucketOptions();

    boolean hasRange();
}
