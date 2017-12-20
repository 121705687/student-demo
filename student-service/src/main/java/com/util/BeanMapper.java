package com.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface BeanMapper {//真正要做到随意转换必须要实现类，
    <S, D> D map(S var1, Class<D> var2);

    <S, D> void map(S var1, D var2);

    <S, D> Set<D> mapAsSet(Iterable<S> var1, Class<D> var2);

    <S, D> Set<D> mapAsSet(S[] var1, Class<D> var2);

    <S, D> List<D> mapAsList(Iterable<S> var1, Class<D> var2);

    <S, D> List<D> mapAsList(S[] var1, Class<D> var2);

    <S, D> D[] mapAsArray(D[] var1, Iterable<S> var2, Class<D> var3);

    <S, D> D[] mapAsArray(D[] var1, S[] var2, Class<D> var3);

    <S, D> void mapAsCollection(Iterable<S> var1, Collection<D> var2, Class<D> var3);

    <S, D> void mapAsCollection(S[] var1, Collection<D> var2, Class<D> var3);
}
