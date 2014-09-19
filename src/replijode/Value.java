/*
 * Copyright (C) 2014 me
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package replijode;

/**
 *
 * @author me
 */
public class Value {
    
}
//class dll_export Value:
//    public _Object {
//protected:
//    BindingMap *map;
//    Value(BindingMap *map);
//public:
//    virtual Value *copy(BindingMap *map) const = 0;
//    virtual void valuate(Code *destination, uint16_t write_index, uint16_t &extent_index) const = 0;
//    virtual bool match(const Code *object, uint16_t index) = 0;
//    virtual Atom *get_code() = 0;
//    virtual Code *get_object() = 0;
//    virtual uint16_t get_code_size() = 0;
//
//    virtual bool intersect(const Value *v) const {
//        return false;
//    }
//    virtual bool _intersect(const AtomValue *v) const {
//        return false;
//    }
//    virtual bool _intersect(const StructureValue *v) const {
//        return false;
//    }
//    virtual bool _intersect(const ObjectValue *v) const {
//        return false;
//    }
//
//    virtual bool contains(const Atom a) const {
//        return false;
//    }
//    virtual bool contains(const Atom *s) const {
//        return false;
//    }
//    virtual bool contains(const Code *o) const {
//        return false;
//    }
//};
//
//class dll_export BoundValue:
//    public Value {
//protected:
//    BoundValue(BindingMap *map);
//public:
//};
//
//class dll_export UnboundValue:
//    public Value {
//private:
//    uint8_t index;
//public:
//    UnboundValue(BindingMap *map, uint8_t index);
//    ~UnboundValue();
//
//    Value *copy(BindingMap *map) const;
//    void valuate(Code *destination, uint16_t write_index, uint16_t &extent_index) const;
//    bool match(const Code *object, uint16_t index);
//    Atom *get_code();
//    Code *get_object();
//    uint16_t get_code_size();
//};
//
//class dll_export AtomValue:
//    public BoundValue {
//private:
//    Atom atom;
//public:
//    AtomValue(BindingMap *map, Atom atom);
//
//    Value *copy(BindingMap *map) const;
//    void valuate(Code *destination, uint16_t write_index, uint16_t &extent_index) const;
//    bool match(const Code *object, uint16_t index);
//    Atom *get_code();
//    Code *get_object();
//    uint16_t get_code_size();
//
//    bool intersect(const Value *v) const;
//    bool _intersect(const AtomValue *v) const;
//
//    bool contains(const Atom a) const;
//};
//
//class dll_export StructureValue:
//    public BoundValue {
//private:
//    P<Code> structure;
//    StructureValue(BindingMap *map, const Code *structure);
//public:
//    StructureValue(BindingMap *map, const Code *source, uint16_t structure_index);
//    StructureValue(BindingMap *map, Atom *source, uint16_t structure_index);
//    StructureValue(BindingMap *map, uint64_t time);
//
//    Value *copy(BindingMap *map) const;
//    void valuate(Code *destination, uint16_t write_index, uint16_t &extent_index) const;
//    bool match(const Code *object, uint16_t index);
//    Atom *get_code();
//    Code *get_object();
//    uint16_t get_code_size();
//
//    bool intersect(const Value *v) const;
//    bool _intersect(const StructureValue *v) const;
//
//    bool contains(const Atom *s) const;
//};
//
//class dll_export ObjectValue:
//    public BoundValue {
//private:
//    const P<Code> object;
//public:
//    ObjectValue(BindingMap *map, Code *object);
//
//    Value *copy(BindingMap *map) const;
//    void valuate(Code *destination, uint16_t write_index, uint16_t &extent_index) const;
//    bool match(const Code *object, uint16_t index);
//    Atom *get_code();
//    Code *get_object();
//    uint16_t get_code_size();
//
//    bool intersect(const Value *v) const;
//    bool _intersect(const ObjectValue *v) const;
//
//    bool contains(const Code *o) const;
//};
//
//typedef enum {
//    MATCH_SUCCESS_POSITIVE = 0,
//    MATCH_SUCCESS_NEGATIVE = 1,
//    MATCH_FAILURE = 2
//} MatchResult;
//
//class _Fact;
//class Fact;
//
//class dll_export BindingMap:
//    public _Object {
//    friend class UnboundValue;
//protected:
//    std::vector<P<Value> > map; // indexed by vl-ptrs.
//
//    uint64_t unbound_values;
//
//    void add_unbound_value(uint8_t id);
//
//    uint16_t first_index; // index of the first value found in the first fact.
//    int16_t fwd_after_index; // tpl args (if any) are located before fwd_after_index.
//    int16_t fwd_before_index;
//
//    bool match_timings(uint64_t stored_after, uint64_t stored_before, uint64_t after, uint64_t before, uint64_t destination_after_index, uint64_t destination_before_index);
//    bool match_fwd_timings(const _Fact *f_object, const _Fact *f_pattern);
//    bool match(const Code *object, uint16_t o_base_index, uint16_t o_index, const Code *pattern, uint16_t p_index, uint16_t o_arity);
//
//    void abstract_member(Code *object, uint16_t index, Code *abstracted_object, uint16_t write_index, uint16_t &extent_index);
//    Atom get_atom_variable(Atom a);
//    Atom get_structure_variable(Code *object, uint16_t index);
//    Atom get_object_variable(Code *object);
//public:
//    BindingMap();
//    BindingMap(const BindingMap *source);
//    BindingMap(const BindingMap &source);
//    virtual ~BindingMap();
//
//    BindingMap& operator =(const BindingMap &source);
//    void load(const BindingMap *source);
//
//    virtual void clear();
//
//    void init(Code *object, uint16_t index);
//
//    _Fact *abstract_f_ihlp(_Fact *fact) const; // for icst and imdl.
//    _Fact *abstract_fact(_Fact *fact, _Fact *original, bool force_sync);
//    Code *abstract_object(Code *object, bool force_sync);
//
//    void reset_fwd_timings(_Fact *reference_fact); // reset after and before from the timings of the reference object.
//
//    MatchResult match_fwd_lenient(const _Fact *f_object, const _Fact *f_pattern); // use for facts when we are lenient about fact vs |fact.
//    bool match_fwd_strict(const _Fact *f_object, const _Fact *f_pattern); // use for facts when we need sharp match.
//
//    uint64_t get_fwd_after() const; // assumes the timings are valuated.
//    uint64_t get_fwd_before() const; // idem.
//
//    bool match_object(const Code *object, const Code *pattern);
//    bool match_structure(const Code *object, uint16_t o_base_index, uint16_t o_index, const Code *pattern, uint16_t p_index);
//    bool match_atom(Atom o_atom, Atom p_atom);
//
//    void bind_variable(BoundValue *value, uint8_t id);
//    void bind_variable(Atom *code, uint8_t id, uint16_t value_index, Atom *intermediate_results);
//
//    Atom *get_value_code(uint16_t id);
//    uint16_t get_value_code_size(uint16_t id);
//
//    bool intersect(BindingMap *bm);
//    bool is_fully_specified() const;
//
//    Atom *get_code(uint16_t i) const {
//        return map[i]->get_code();
//    }
//    Code *get_object(uint16_t i) const {
//        return map[i]->get_object();
//    }
//    uint16_t get_fwd_after_index() const {
//        return fwd_after_index;
//    }
//    uint16_t get_fwd_before_index() const {
//        return fwd_before_index;
//    }
//    bool scan_variable(uint16_t id) const; // return true if id<first_index or map[id] is not an UnboundValue.
//};
//
//class dll_export HLPBindingMap:
//    public BindingMap {
//private:
//    int16_t bwd_after_index;
//    int16_t bwd_before_index;
//
//    bool match_bwd_timings(const _Fact *f_object, const _Fact *f_pattern);
//
//    bool need_binding(Code *pattern) const;
//    void init_from_pattern(const Code *source, int16_t position); // first source is f->obj.
//public:
//    HLPBindingMap();
//    HLPBindingMap(const HLPBindingMap *source);
//    HLPBindingMap(const HLPBindingMap &source);
//    ~HLPBindingMap();
//
//    HLPBindingMap& operator =(const HLPBindingMap &source);
//    void load(const HLPBindingMap *source);
//    void clear();
//
//    void init_from_hlp(const Code *hlp);
//    void init_from_f_ihlp(const _Fact *f_ihlp);
//    Fact *build_f_ihlp(Code *hlp, uint16_t opcode, bool wr_enabled) const; // return f->ihlp.
//    Code *bind_pattern(Code *pattern) const;
//
//    void reset_bwd_timings(_Fact *reference_fact); // idem for the last 2 unbound variables (i.e. timings of the second pattern in a mdl).
//
//    MatchResult match_bwd_lenient(const _Fact *f_object, const _Fact *f_pattern); // use for facts when we are lenient about fact vs |fact.
//    bool match_bwd_strict(const _Fact *f_object, const _Fact *f_pattern); // use for facts when we need sharp match.
//
//    uint64_t get_bwd_after() const; // assumes the timings are valuated.
//    uint64_t get_bwd_before() const; // idem.
//};
//}
//
