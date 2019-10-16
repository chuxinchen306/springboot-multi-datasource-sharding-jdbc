package hello.entity;

import java.io.Serializable;

public class SysCompanyOrgDo implements Serializable {
    private static final long serialVersionUID = -5784674122255830303L;

    private Long id;
    private Long companyId;
    private Long idOwnOrg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getIdOwnOrg() {
        return idOwnOrg;
    }

    public void setIdOwnOrg(Long idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }
}
