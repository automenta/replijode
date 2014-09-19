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
public class View {
//class dll_export View:
//    public r_code::View {
//private:
//    static uint64_t LastOID;
//    static uint64_t GetOID();
//
//// Ctrl values.
//    uint64_t sln_changes;
//    double acc_sln;
//    uint64_t act_changes;
//    double acc_act;
//    uint64_t vis_changes;
//    double acc_vis;
//    uint64_t res_changes;
//    double acc_res;
//    void reset_ctrl_values();
//
//// Monitoring
//    double initial_sln;
//    double initial_act;
//
//    void init(SyncMode sync,
//              uint64_t ijt,
//              double sln,
//              int64_t res,
//              r_code::Code *host,
//              r_code::Code *origin,
//              r_code::Code *object);
//protected:
//    void reset_init_sln();
//    void reset_init_act();
//public:
//    static uint16_t ViewOpcode;
//
//    P<Controller> controller; // built upon injection of the view (if the object is an ipgm/icpp_pgm/cst/mdl).
//
//    static double MorphValue(double value, double source_thr, double destination_thr);
//    static double MorphChange(double change, double source_thr, double destination_thr);
//
//    uint64_t periods_at_low_sln;
//    uint64_t periods_at_high_sln;
//    uint64_t periods_at_low_act;
//    uint64_t periods_at_high_act;
//
//    View();
//    View(r_code::SysView *source, r_code::Code *object);
//    View(View *view, Group *group); // copy the view and assigns it to the group (used for cov); morph ctrl values.
//    View(const View *view, bool new_OID = false); // simple copy.
//    View(SyncMode sync,
//         uint64_t ijt,
//         double sln,
//         int64_t res,
//         Code *host,
//         Code *origin,
//         Code *object); // regular view; res set to -1 means forever.
//    View(SyncMode sync,
//         uint64_t ijt,
//         double sln,
//         int64_t res,
//         Code *host,
//         Code *origin,
//         Code *object,
//         double act); // pgm/mdl view; res set to -1 means forever.
//    ~View();
//
//    void reset();
//    void set_object(r_code::Code *object);
//
//    uint64_t get_oid() const;
//
//    virtual bool isNotification() const;
//
//    Group *get_host();
//
//    SyncMode get_sync();
//    double get_res();
//    double get_sln();
//    double get_act();
//    bool get_cov();
//    double get_vis();
//    uintptr_t &ctrl0() {
//        return _code[VIEW_CTRL_0].atom; // use only for non-group views.
//    }
//    uintptr_t &ctrl1() {
//        return _code[VIEW_CTRL_1].atom; // idem.
//    }
//
//    void mod_res(double value);
//    void set_res(double value);
//    void mod_sln(double value);
//    void set_sln(double value);
//    void mod_act(double value);
//    void set_act(double value);
//    void mod_vis(double value);
//    void set_vis(double value);
//
//    double update_res();
//    double update_sln(double low, double high);
//    double update_act(double low, double high);
//    double update_vis();
//
//    double update_sln_delta();
//    double update_act_delta();
//
//    void force_res(double value); // unmediated.
//
//// Target res, sln, act, vis.
//    void mod(uint16_t member_index, double value);
//    void set(uint16_t member_index, double value);
//
//    void delete_from_object();
//    void delete_from_group();
//private:
//    std::mutex m_groupMutex;
//};
//
//class dll_export NotificationView:
//    public View {
//public:
//    NotificationView(Code *origin, Code *destination, Code *marker); // res=1, sln=1.
//
//    bool isNotification() const;
//};
//}
//
//
//#include "view.inline.cpp"
    
}
