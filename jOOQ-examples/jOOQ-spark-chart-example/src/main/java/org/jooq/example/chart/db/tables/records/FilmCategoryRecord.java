/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.chart.db.tables.FilmCategory;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> implements Record3<Integer, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_category.film_id</code>.
     */
    public void setFilmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_category.film_id</code>.
     */
    public Integer getFilmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.film_category.category_id</code>.
     */
    public void setCategoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_category.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.film_category.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, LocalDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FilmCategory.FILM_CATEGORY.FILM_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FilmCategory.FILM_CATEGORY.CATEGORY_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return FilmCategory.FILM_CATEGORY.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getFilmId();
    }

    @Override
    public Integer component2() {
        return getCategoryId();
    }

    @Override
    public LocalDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getFilmId();
    }

    @Override
    public Integer value2() {
        return getCategoryId();
    }

    @Override
    public LocalDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public FilmCategoryRecord value1(Integer value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmCategoryRecord value2(Integer value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public FilmCategoryRecord value3(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public FilmCategoryRecord values(Integer value1, Integer value2, LocalDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmCategoryRecord
     */
    public FilmCategoryRecord() {
        super(FilmCategory.FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(Integer filmId, Integer categoryId, LocalDateTime lastUpdate) {
        super(FilmCategory.FILM_CATEGORY);

        setFilmId(filmId);
        setCategoryId(categoryId);
        setLastUpdate(lastUpdate);
    }
}
