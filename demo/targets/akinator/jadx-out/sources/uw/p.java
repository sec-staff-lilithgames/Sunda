package uw;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import yw.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface p {
    <T> T read(Class<? extends T> cls, File file) throws Exception;

    <T> T read(Class<? extends T> cls, File file, boolean z10) throws Exception;

    <T> T read(Class<? extends T> cls, InputStream inputStream) throws Exception;

    <T> T read(Class<? extends T> cls, InputStream inputStream, boolean z10) throws Exception;

    <T> T read(Class<? extends T> cls, Reader reader) throws Exception;

    <T> T read(Class<? extends T> cls, Reader reader, boolean z10) throws Exception;

    <T> T read(Class<? extends T> cls, String str) throws Exception;

    <T> T read(Class<? extends T> cls, String str, boolean z10) throws Exception;

    <T> T read(Class<? extends T> cls, yw.p pVar) throws Exception;

    <T> T read(Class<? extends T> cls, yw.p pVar, boolean z10) throws Exception;

    <T> T read(T t10, File file) throws Exception;

    <T> T read(T t10, File file, boolean z10) throws Exception;

    <T> T read(T t10, InputStream inputStream) throws Exception;

    <T> T read(T t10, InputStream inputStream, boolean z10) throws Exception;

    <T> T read(T t10, Reader reader) throws Exception;

    <T> T read(T t10, Reader reader, boolean z10) throws Exception;

    <T> T read(T t10, String str) throws Exception;

    <T> T read(T t10, String str, boolean z10) throws Exception;

    <T> T read(T t10, yw.p pVar) throws Exception;

    <T> T read(T t10, yw.p pVar, boolean z10) throws Exception;

    boolean validate(Class cls, File file) throws Exception;

    boolean validate(Class cls, File file, boolean z10) throws Exception;

    boolean validate(Class cls, InputStream inputStream) throws Exception;

    boolean validate(Class cls, InputStream inputStream, boolean z10) throws Exception;

    boolean validate(Class cls, Reader reader) throws Exception;

    boolean validate(Class cls, Reader reader, boolean z10) throws Exception;

    boolean validate(Class cls, String str) throws Exception;

    boolean validate(Class cls, String str, boolean z10) throws Exception;

    boolean validate(Class cls, yw.p pVar) throws Exception;

    boolean validate(Class cls, yw.p pVar, boolean z10) throws Exception;

    void write(Object obj, File file) throws Exception;

    void write(Object obj, OutputStream outputStream) throws Exception;

    void write(Object obj, Writer writer) throws Exception;

    void write(Object obj, h0 h0Var) throws Exception;
}
